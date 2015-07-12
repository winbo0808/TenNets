package com.hh.tennets.activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.http.protocol.HTTP;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ab.http.AbFileHttpResponseListener;
import com.ab.http.AbHttpUtil;
import com.ab.http.AbRequestParams;
import com.ab.http.AbStringHttpResponseListener;
import com.ab.util.AbFileUtil;
import com.ab.view.ioc.AbIocView;
import com.hh.tennets.BaseActivity;
import com.hh.tennets.R;

public class TextActivity extends BaseActivity implements OnClickListener {
    @AbIocView(id = R.id.id1)
    private Button btn1;
    @AbIocView(id = R.id.id2)
    private Button btn2;

    @Override
    public int getLayoutId() {
        return R.layout.activity_text;
    }

    @Override
    public void initHolder() {
        initTitleBar("测试");
    }

    @Override
    public void initLayoutParams() {}

    @Override
    public void initData() {}

    @Override
    public void registerClickLister() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btn1) {
            showToast(this, "点击了1");
        } else if (v == btn2) {
            showToast(this, "点击了2");
            // DmHttpHelper helper = new DmHttpHelper(this, new ResultListener() {
            //
            // @Override
            // public void onSuccess(int statusCode, String successContent) {
            // showToast(TextActivity.this, successContent);
            // Log.i("winbo", "onSuccess:" + successContent);
            // }
            //
            // @Override
            // public void onFailure(int statusCode, String failContent) {
            // showToast(TextActivity.this, failContent);
            // Log.i("winbo", "onFail:" + failContent);
            // }
            // });
            // helper.setUrl(Constant.Server.ADDRESS);
            // helper.putParams("nickname", "davi");
            // helper.putParams("password", "123456");
            // helper.postRequest();


            // String filepath = "/storage/sdcard0/download/com.hh.tennets/text.html";
            // String path = "http://101.251.213.18/snstransfer/snstransfer.html";
            // try {
            // URL url = new URL(path);
            // HttpURLConnection connection = (HttpURLConnection) url.openConnection();// 从网络获得链接
            // connection.setRequestMethod("GET");// 获得
            // connection.setConnectTimeout(5000);// 设置超时时间为5s
            //
            // if (connection.getResponseCode() == 200)// 检测是否正常返回数据请求 详情参照http协议
            // {
            // Log.i("winbo", "connection.getResponseCode()：" + connection.getResponseCode());
            // InputStream is = connection.getInputStream();// 获得输入流
            // File file = new File(filepath);// 新建一个file文件
            // FileOutputStream fos = new FileOutputStream(file);// 对应文件建立输出流
            // byte[] buffer = new byte[1024];// 新建缓存 用来存储 从网络读取数据 再写入文件
            // int len = 0;
            // while ((len = is.read(buffer)) != -1) {// 当没有读到最后的时候
            // fos.write(buffer, 0, len);// 将缓存中的存储的文件流秀娥问file文件
            // }
            // fos.flush();// 将缓存中的写入file
            // fos.close();
            // is.close();// 将输入流 输出流关闭
            // }
            // } catch (Exception e) {
            // Log.e("winbo", e.getMessage()+"");
            // }//
            AbFileUtil.initFileDir(this);
//            final String url = "http://101.251.213.18/snstransfer/snstransfer.html";
            final String url = "http://101.251.213.18/snstransfer/aaaaa.jpg";
            // File fileTemp = new File("/storage/sdcard0/download/com.hh.tennets/text.jpg");
            new Thread(new Runnable() {

                @Override
                public void run() {
                    String path = AbFileUtil.downloadFile(url, "");
                    Log.i("winbo", "path:" + path);
                }
            }).start();

            // AbHttpUtil httpUtil = AbHttpUtil.getInstance(this);
            // // String url = "http://101.251.213.18/snstransfer/snstransfer.html";
            // String url = "http://101.251.213.18/snstransfer/aaaaa.jpg";
            // AbRequestParams params = new AbRequestParams();
            // params.put("name", "强哥好牛逼");
            // httpUtil.setTimeout(5000);
            // httpUtil.setEncode(HTTP.UTF_8);
            // final File fileTemp = new File("/storage/sdcard0/download/com.hh.tennets/text.jpg");
            // httpUtil.get(url, params, new AbFileHttpResponseListener() {
            //
            // @Override
            // public void onStart() {}
            //
            // @Override
            // public void onFinish() {}
            //
            // @Override
            // public void onFailure(int arg0, String arg1, Throwable arg2) {}
            //
            // @Override
            // public void onSuccess(int statusCode, File file) {
            // super.onSuccess(statusCode, file);
            // Log.i("winbo", file.getAbsolutePath());
            // file.renameTo(fileTemp);
            // }
            // });

            // AbHttpUtil httpUtil = AbHttpUtil.getInstance(this);
            // String url = Constant.Server.ADDRESS;
            // AbRequestParams params = new AbRequestParams();
            // params.put("name", "老大是个坑");
            // params.put("password", "123456");
            // httpUtil.setTimeout(5000);
            // httpUtil.post(url, params, new AbStringHttpResponseListener() {
            // @Override
            // public void onSuccess(int arg0, String arg1) {
            // Log.i("winbo", "arg1:" + arg1);
            // }
            //
            // @Override
            // public void onFailure(int arg0, String arg1, Throwable arg2) {
            // Log.i("winbo", "onFailure");
            // }
            //
            // @Override
            // public void onFinish() {
            // Log.i("winbo", "onFinish");
            // }
            //
            // @Override
            // public void onStart() {
            // Log.i("winbo", "onStart");
            // }
            // });
        }
    }
}
