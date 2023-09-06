package com.example.CreaningRota2.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("dormitories")
public class Dormitory {
	
	/** 寮ID */
	@Id
	private Integer dormitoryId;
	/** 削除フラグ */
	private Integer deleteFlag;
	/** 寮郵便番号 */
	private String dormitoryPostalCode;
	/** 寮住所(県) */
	private String dormitoryPrefecture;
	/** 寮住所(市) */
	private String dormitoryCity;
	/** 寮住所(町) */
	private String dormitoryTown;
	/** 寮住所(番地) */
	private String dormitoryBlock;
	/** 寮住所(その他詳細) */
	private String dormitoryDetail;
	/** 寮名 */
	private String dormitoryName;
	
	public Integer getDormitoryId() {
		return dormitoryId;
	}
	public void setDormitoryId(Integer dormitoryId) {
		this.dormitoryId = dormitoryId;
	}
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getDormitoryPostalCode() {
		return dormitoryPostalCode;
	}
	public void setDormitoryPostalCode(String dormitoryPostalCode) {
		this.dormitoryPostalCode = dormitoryPostalCode;
	}
	public String getDormitoryPrefecture() {
		return dormitoryPrefecture;
	}
	public void setDormitoryPrefecture(String dormitoryPrefecture) {
		this.dormitoryPrefecture = dormitoryPrefecture;
	}
	public String getDormitoryCity() {
		return dormitoryCity;
	}
	public void setDormitoryCity(String dormitoryCity) {
		this.dormitoryCity = dormitoryCity;
	}
	public String getDormitoryTown() {
		return dormitoryTown;
	}
	public void setDormitoryTown(String dormitoryTown) {
		this.dormitoryTown = dormitoryTown;
	}
	public String getDormitoryBlock() {
		return dormitoryBlock;
	}
	public void setDormitoryBlock(String dormitoryBlock) {
		this.dormitoryBlock = dormitoryBlock;
	}
	public String getDormitoryDetail() {
		return dormitoryDetail;
	}
	public void setDormitoryDetail(String dormitoryDetail) {
		this.dormitoryDetail = dormitoryDetail;
	}
	public String getDormitoryName() {
		return dormitoryName;
	}
	public void setDormitoryName(String dormitoryName) {
		this.dormitoryName = dormitoryName;
	}
		
}
