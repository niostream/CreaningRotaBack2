package com.example.CreaningRota2.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CreaningRota2.domain.User;
import com.example.CreaningRota2.dto.login.LoginDTO;
import com.example.CreaningRota2.error.NoDataFoundException;
import com.example.CreaningRota2.service.ChangePasswordService;
import com.example.CreaningRota2.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	@Autowired
	ChangePasswordService changePasswordService;
	
	@GetMapping
	public User getLoginUser(@ModelAttribute LoginDTO loginDto) throws Exception {
		// Java動作検証用(Node.js起動時はパラメータコメント化)
//		loginDto.setUserId("urushi");
//		loginDto.setPassword("urushi");
		Optional<User> user = loginService.getUserByUserIdPassword(loginDto);
		if (user.isPresent()) {
			// Passwordテスト更新
//			user.get().setPassword("gohara");
//			int x = changePasswordService.updatePasswordByUserId(user.get());
			return user.get();
		} else {
			throw new NoDataFoundException("There is no User data.");
		}
	}

}
