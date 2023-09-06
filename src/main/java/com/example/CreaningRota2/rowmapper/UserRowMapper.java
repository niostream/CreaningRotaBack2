package com.example.CreaningRota2.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.example.CreaningRota2.domain.ConfigAdmin;
import com.example.CreaningRota2.domain.Dormitory;
import com.example.CreaningRota2.domain.User;

@Configuration
public class UserRowMapper {

	public ResultSetExtractor<User> getUserResultSetExtractor() {
		return new ResultSetExtractor<User>() {
			@Override
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (!rs.next()) return null;
				return getUserData(rs);
			}	
		};
	}

    public RowMapper<User> getUserRowMapper() {
		return new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				return getUserData(rs);
			}
        };
	}
    
    /**
     * `Users`テーブルレコード格納
     * @param rs テーブルレコード
     * @return User Object
     * @throws SQLException
     */
    private final User getUserData(ResultSet rs) throws SQLException {
    	User user = new User();
		ConfigAdmin configAdmin = new ConfigAdmin();
		Dormitory dormitory = new Dormitory();
		
		user.setUserId(rs.getString("user.user_id"));
		user.setDeleteFlag(rs.getInt("user.delete_flag"));
		user.setPassword(rs.getString("user.password"));
		user.setFirstName(rs.getString("user.first_name"));
		user.setLastName(rs.getString("user.last_name"));
		configAdmin.setAdminFlag(rs.getInt("config_admin.admin_flag"));
		configAdmin.setAdminName(rs.getString("config_admin.admin_name"));
		dormitory.setDormitoryId(rs.getInt("dormitory.dormitory_id"));
		dormitory.setDeleteFlag(rs.getInt("dormitory.delete_flag"));
		dormitory.setDormitoryPostalCode(rs.getString("dormitory.dormitory_postal_code"));
		dormitory.setDormitoryPrefecture(rs.getString("dormitory.dormitory_prefecture"));
		dormitory.setDormitoryCity(rs.getString("dormitory.dormitory_city"));
		dormitory.setDormitoryTown(rs.getString("dormitory.dormitory_town"));
		dormitory.setDormitoryBlock(rs.getString("dormitory.dormitory_block"));
		dormitory.setDormitoryDetail(rs.getString("dormitory.dormitory_detail"));
		dormitory.setDormitoryName(rs.getString("dormitory.dormitory_name"));
		
		user.setConfigAdmin(configAdmin);
		user.setDormitory(dormitory);
		
		return user;
    }

}
