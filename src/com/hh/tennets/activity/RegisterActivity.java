package com.hh.tennets.activity;

import java.io.File;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.ab.cache.image.AbImageBaseCache;
import com.ab.image.AbImageLoader;
import com.ab.util.AbDialogUtil;
import com.ab.util.AbFileUtil;
import com.ab.util.AbImageUtil;
import com.ab.util.AbLogUtil;
import com.ab.util.AbStrUtil;
import com.ab.util.AbToastUtil;
import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;
import com.hh.tennets.view.CircleImageView;

public class RegisterActivity extends BaseActivity implements OnClickListener {
	@AbIocView(id = R.id.ic_avatar)
	private CircleImageView ic_avatar;
	/* 拍照的照片存储位置 */
	private File PHOTO_DIR = null;
	// 照相机拍照得到的图片
	private File mCurrentPhotoFile;
	private String mFileName;
	private View mAvatarView = null;
	/* 用来标识请求照相功能的activity */
	private static final int CAMERA_WITH_DATA = 3023;
	/* 用来标识请求gallery的activity */
	private static final int PHOTO_PICKED_WITH_DATA = 3021;
	// 图片下载器
	private AbImageLoader mAbImageLoader = null;

	@Override
	public void onClick(View v) {
		if (v == ic_avatar) {
			mAvatarView = mInflater.inflate(R.layout.choose_avatar, null);
			Button albumButton = (Button) mAvatarView
					.findViewById(R.id.choose_album);
			Button camButton = (Button) mAvatarView
					.findViewById(R.id.choose_cam);
			Button cancelButton = (Button) mAvatarView
					.findViewById(R.id.choose_cancel);
			albumButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					AbDialogUtil.removeDialog(mContext);
					// 从相册中去获取
					try {
						Intent intent = new Intent(Intent.ACTION_GET_CONTENT,
								null);
						intent.setType("image/*");
						startActivityForResult(intent, PHOTO_PICKED_WITH_DATA);
					} catch (ActivityNotFoundException e) {
						AbToastUtil.showToast(mContext, "没有找到照片");
					}
				}

			});

			camButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					AbDialogUtil.removeDialog(mContext);
					doPickPhotoAction();
				}

			});

			cancelButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					AbDialogUtil.removeDialog(mContext);
				}

			});
			AbDialogUtil.showDialog(mAvatarView, Gravity.BOTTOM);
		}

	}

	@Override
	public int getLayoutId() {
		// TODO 自动生成的方法存根
		return R.layout.activity_register;
	}

	@Override
	public void initHolder() {
		setSubPageTitle("注册", true);
		// TODO 自动生成的方法存根

	}

	@Override
	public void initLayoutParams() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void registerClickLister() {
		// TODO 自动生成的方法存根
		ic_avatar.setOnClickListener(this);
	}

	@Override
	public void initData() {
		// 图片下载器
		mAbImageLoader = new AbImageLoader(mContext);
		// 初始化图片保存路径
		String photo_dir = AbFileUtil.getImageDownloadDir(this);
		if (AbStrUtil.isEmpty(photo_dir)) {
			AbToastUtil.showToast(mContext, "存储卡不存在");
		} else {
			PHOTO_DIR = new File(photo_dir);
		}
	}

	/**
	 * 从照相机获取
	 */
	private void doPickPhotoAction() {
		String status = Environment.getExternalStorageState();
		// 判断是否有SD卡,如果有sd卡存入sd卡在说，没有sd卡直接转换为图片
		if (status.equals(Environment.MEDIA_MOUNTED)) {
			doTakePhoto();
		} else {
			AbToastUtil.showToast(mContext, "没有可用的存储卡");
		}
	}

	/**
	 * 拍照获取图片
	 */
	protected void doTakePhoto() {
		try {
			mFileName = System.currentTimeMillis() + ".jpg";
			mCurrentPhotoFile = new File(PHOTO_DIR, mFileName);
			Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE, null);
			intent.putExtra(MediaStore.EXTRA_OUTPUT,
					Uri.fromFile(mCurrentPhotoFile));
			startActivityForResult(intent, CAMERA_WITH_DATA);
		} catch (Exception e) {
			AbToastUtil.showToast(mContext, "未找到系统相机程序");
		}
	}

	/**
	 * 描述：因为调用了Camera和Gally所以要判断他们各自的返回情况, 他们启动时是这样的startActivityForResult
	 */
	protected void onActivityResult(int requestCode, int resultCode,
			Intent mIntent) {
		if (resultCode != RESULT_OK) {
			return;
		}
		switch (requestCode) {
		case PHOTO_PICKED_WITH_DATA:
			Uri uri = mIntent.getData();
			String currentFilePath = getPath(uri);
			if (!AbStrUtil.isEmpty(currentFilePath)) {
				setImageBitmap(currentFilePath, ic_avatar);
			} else {
				AbToastUtil.showToast(mContext, "未在存储卡中找到这个文件");
			}
			break;
		case CAMERA_WITH_DATA:
			AbLogUtil.d(mContext, "拍照获取的照片 = " + mCurrentPhotoFile.getPath());
			String currentFilePath2 = mCurrentPhotoFile.getPath();
			setImageBitmap(currentFilePath2, ic_avatar);
			break;
		}
	}

	/**
	 * 从相册得到的url转换为SD卡中图片路径
	 */
	public String getPath(Uri uri) {
		if (AbStrUtil.isEmpty(uri.getAuthority())) {
			return null;
		}
		String[] projection = { MediaStore.Images.Media.DATA };

		Cursor cursor = managedQuery(uri, projection, null, null, null);
		int column_index = cursor
				.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
		cursor.moveToFirst();
		String path = cursor.getString(column_index);
		return path;
	}

	private void setImageBitmap(String imagePath, ImageView view) {
		if (!AbStrUtil.isEmpty(imagePath)) {
			// 从缓存中获取图片，很重要否则会导致页面闪动
			Bitmap bitmap = AbImageBaseCache.getInstance().getBitmap(imagePath);
			// 缓存中没有则从网络和SD卡获取
			if (bitmap == null) {
				view.setImageResource(R.drawable.icon_avtar);
				if (imagePath.indexOf("http://") != -1) {
					// 图片的下载
					mAbImageLoader.display(view, imagePath, view.getWidth(),
							view.getHeight());

				} else if (imagePath.indexOf("/") == -1) {
					// 索引图片
					try {
						int res = Integer.parseInt(imagePath);
						view.setImageDrawable(mContext.getResources()
								.getDrawable(res));
					} catch (Exception e) {
						view.setImageResource(R.drawable.icon_avtar);
					}
				} else {
					Bitmap mBitmap = AbFileUtil.getBitmapFromSD(new File(
							imagePath), AbImageUtil.SCALEIMG, view.getWidth(),
							view.getHeight());
					if (mBitmap != null) {
						view.setImageBitmap(mBitmap);
					} else {
						// 无图片时显示
						view.setImageResource(R.drawable.icon_avtar);
					}
				}
			} else {
				// 直接显示
				view.setImageBitmap(bitmap);
			}
		} else {
			// 无图片时显示
			view.setImageResource(R.drawable.icon_avtar);
		}
		view.setAdjustViewBounds(true);
	}
}
