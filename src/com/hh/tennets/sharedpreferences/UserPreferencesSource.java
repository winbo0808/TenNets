package com.hh.tennets.sharedpreferences;

import java.util.Date;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

import com.hh.tennets.model.LoginBean;

import android.content.Context;
import android.content.SharedPreferences;

public class UserPreferencesSource {
	private SharedPreferences setting;
	public static String PrefferenceName = "UserLoginPrefrences";

	public UserPreferencesSource(SharedPreferences setting) {
		super();
		this.setting = setting;
	}

	public UserPreferencesSource(Context context) {
		super();
		this.setting = context.getSharedPreferences(
				UserPreferencesSource.PrefferenceName,
				Context.MODE_PRIVATE);
	}

	/**
	 * @param Data
	 */
	public void SendData(LoginBean data) {
		SharedPreferences.Editor editor = setting.edit();
		editor.putString("usercode", data.getUsercode());
		editor.putString("password", data.getPassword());
		editor.commit();
	}

	public void setStringValue(String key, String value) {
		SharedPreferences.Editor editor = setting.edit();
		editor.putString(key, value);
		editor.commit();
	}

	public String getStringValueByKey(String key) {
		return setting.getString(key, "");
	}

	public String getPhone() {
		return setting.getString("usercode", "");
	}

	public String getDefaultCvId() {
		return setting.getString("defaultCvId", "");
	}

	/**
	 * 
	 * @return LoginBean
	 */
	public LoginBean GetData() {
		LoginBean model = LoginBean.getInstance();
		if (setting != null) {

			model.setUsercode(setting.getString("usercode", ""));
			model.setPassword(setting.getString("password", ""));
		} else {
			model.setUsercode(setting.getString("usercode", ""));
			model.setPassword(setting.getString("password", ""));

		}
		return model;
	}

	public void sendSession(CookieStore cookieStore) {
		SharedPreferences.Editor editor = setting.edit();
		String value = "";
		if (cookieStore.getCookies().size() > 1) {
			Cookie cookie = cookieStore.getCookies().get(1);
			editor.putInt("version", cookie.getVersion());
			editor.putString("name", cookie.getName());
			editor.putString("value", cookie.getValue());
			value = cookie.getValue();
			editor.putString("domain", cookie.getDomain());
			editor.putString("path", cookie.getPath());
		} else if (cookieStore.getCookies().size() > 0) {
			Cookie cookie = cookieStore.getCookies().get(0);
			editor.putInt("version", cookie.getVersion());
			editor.putString("name", cookie.getName());
			editor.putString("value", cookie.getValue());
			value = cookie.getValue();
			editor.putString("domain", cookie.getDomain());
			editor.putString("path", cookie.getPath());
		}

		editor.commit();
	}

	public Cookie getSession() {
		if (setting != null) {
			return new Cookie() {

				@Override
				public boolean isSecure() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean isPersistent() {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public boolean isExpired(Date arg0) {
					// TODO Auto-generated method stub
					return false;
				}

				@Override
				public int getVersion() {
					// TODO Auto-generated method stub
					return setting.getInt("version", 0);
				}

				@Override
				public String getValue() {
					// TODO Auto-generated method stub
					return setting.getString("value", "");
				}

				@Override
				public int[] getPorts() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public String getPath() {
					// TODO Auto-generated method stub
					return setting.getString("path", "");
				}

				@Override
				public String getName() {
					// TODO Auto-generated method stub
					return setting.getString("name", "");
				}

				@Override
				public Date getExpiryDate() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public String getDomain() {
					// TODO Auto-generated method stub
					return setting.getString("domain", "");
				}

				@Override
				public String getCommentURL() {
					// TODO Auto-generated method stub
					return null;
				}

				@Override
				public String getComment() {
					// TODO Auto-generated method stub
					return null;
				}
			};

		} else {
			return null;
		}

	}

}
