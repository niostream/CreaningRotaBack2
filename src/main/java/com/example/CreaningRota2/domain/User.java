package com.example.CreaningRota2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public class User {
	
	/** ユーザーID */
	@Id
	private String userId;
	/** 削除フラグ */
	private Integer deleteFlag;
	/** パスワード */
	private String password;
	/** 名字 */
	private String firstName;
	/** 名前 */
	private String lastName;
	/** 権限設定 */
	private ConfigAdmin configAdmin;
	/** 寮 */
	private Dormitory dormitory;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public ConfigAdmin getConfigAdmin() {
		return configAdmin;
	}
	public void setConfigAdmin(ConfigAdmin configAdmin) {
		this.configAdmin = configAdmin;
	}
	public Dormitory getDormitory() {
		return dormitory;
	}
	public void setDormitory(Dormitory dormitory) {
		this.dormitory = dormitory;
	}

}
