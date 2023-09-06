package com.example.CreaningRota2.sql;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserSql {

    /**
     * ユーザーID条件ユーザーテーブル取得クエリ
     * @return
     */
	public String getUserByUserId() {
		StringBuilder sql = new StringBuilder();
		sql.append("where ")
			.append("user.user_id = :userId ")
			.append("and user.password = SHA(:password)");
		return getFindAllQuery() + sql.toString();
	}

    /**
     * ユーザーID条件パスワード更新クエリ
     * @return
     */
    public String updatePasswordByUserId() {
		StringBuilder sql = new StringBuilder();
		sql.append("where ")
			.append("user.user_id = :userId");
		return getUpdatePasswordQuery() + sql.toString();
	}
	
	/**
	 * ユーザーテーブル取得クエリ
	 * @return
	 */
	private final String getFindAllQuery() {
		StringBuilder sql = new StringBuilder();
		sql.append("select ")
			.append("user.user_id, ")
			.append("user.delete_flag, ")
			.append("user.password, ")
			.append("user.first_name, ")
			.append("user.last_name, ")
			.append("config_admin.admin_flag, ")
			.append("config_admin.admin_name, ")
			.append("dormitory.dormitory_id, ")
			.append("dormitory.delete_flag, ")
			.append("dormitory.dormitory_postal_code, ")
			.append("dormitory.dormitory_prefecture, ")
			.append("dormitory.dormitory_city, ")
			.append("dormitory.dormitory_town, ")
			.append("dormitory.dormitory_block, ")
			.append("dormitory.dormitory_detail, ")
			.append("dormitory.dormitory_name ")
			.append("from ")
			.append("users user ")
			.append("inner join config_admin config_admin ")
			.append("on user.admin_flag = config_admin.admin_flag ")
			.append("inner join dormitories dormitory ")
			.append("on user.dormitory_id = dormitory.dormitory_id ");
		return sql.toString();
	}
	
	/**
	 * パスワード更新クエリ
	 * @return
	 */
	private final String getUpdatePasswordQuery() {
		StringBuilder sql = new StringBuilder();
		sql.append("update ")
			.append("users user ")
			.append("set ")
			.append("user.password = SHA(:password) ");
		return sql.toString();
	}
	
}
