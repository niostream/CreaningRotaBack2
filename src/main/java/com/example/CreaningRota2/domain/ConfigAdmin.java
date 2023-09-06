package com.example.CreaningRota2.domain;

import org.springframework.data.relational.core.mapping.Table;

@Table("config_admin")
public class ConfigAdmin {
	
	/** 権限フラグ */
	private Integer adminFlag;
	/** 権限名 */
	private String adminName;
	
	public Integer getAdminFlag() {
		return adminFlag;
	}
	public void setAdminFlag(Integer adminFlag) {
		this.adminFlag = adminFlag;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
}
