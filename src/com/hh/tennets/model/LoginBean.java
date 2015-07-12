package com.hh.tennets.model;

import java.io.Serializable;

public class LoginBean implements Serializable {

	private static LoginBean loginBean = null;

	private static final long serialVersionUID = -2557958787981500198L;
	/**
	 * 帐号
	 */
	String usercode;
	/**
	 * 密码
	 */
	String password;
	/**
	 * 是否保存密码
	 */
	boolean savepassword;

	private LoginBean() {

	}

	public static LoginBean getInstance() {
		if (loginBean == null) {
			loginBean = new LoginBean();
		}
		return loginBean;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isSavepassword() {
		return savepassword;
	}

	public void setSavepassword(boolean savepassword) {
		this.savepassword = savepassword;
	}

}
