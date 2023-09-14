package com.example.CreaningRota2.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.CreaningRota2.domain.User;
import com.example.CreaningRota2.rowmapper.UserRowMapper;
import com.example.CreaningRota2.sql.UserSql;

@Service
public class LoginService {
	
	@Autowired
	NamedParameterJdbcTemplate template;
	
	@Autowired
	UserSql userSql;
	
	@Autowired
	UserRowMapper userRowMapper;
	
	public Optional<User> getUserByUserIdPassword(User user) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("userId", user.getUserId());
		parameters.put("password", user.getPassword());
		return Optional.ofNullable(template.query(userSql.getUserByUserId(), parameters,
				userRowMapper.getUserResultSetExtractor()));	
	}

}
