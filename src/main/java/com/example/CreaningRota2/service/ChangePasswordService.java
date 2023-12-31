package com.example.CreaningRota2.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.CreaningRota2.domain.User;
import com.example.CreaningRota2.sql.UserSql;

@Service
public class ChangePasswordService {
	
	@Autowired
	NamedParameterJdbcTemplate template;
	
	@Autowired
	UserSql userSql;
	
	public int updatePasswordByUserId(User user) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("userId", user.getUserId());
		parameters.put("password", user.getPassword());
		return template.update(userSql.updatePasswordByUserId(), parameters);
	}

}
