package com.example.CreaningRota2.dto;

public class ChangePasswordDTO {

	/** ユーザーID */
	private String userId;
	/** 変更前パスワード */
	private String defaultPassword;
	/** 変更後パスワード */
	private String changePassword;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDefaultPassword() {
		return defaultPassword;
	}
	public void setDefaultPassword(String defaultPassword) {
		this.defaultPassword = defaultPassword;
	}
	public String getChangePassword() {
		return changePassword;
	}
	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}
	
}
