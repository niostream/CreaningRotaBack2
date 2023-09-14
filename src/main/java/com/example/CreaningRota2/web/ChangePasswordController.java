package com.example.CreaningRota2.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CreaningRota2.domain.User;
import com.example.CreaningRota2.dto.ChangePasswordDTO;
import com.example.CreaningRota2.error.NoDataFoundException;
import com.example.CreaningRota2.service.ChangePasswordService;
import com.example.CreaningRota2.service.LoginService;

@RestController
@RequestMapping("/change-password")
public class ChangePasswordController {
	
	@Autowired
	LoginService loginService;
	@Autowired
	ChangePasswordService changePasswordService;
	
	@PostMapping("/update")
	public int changePassword(@ModelAttribute ChangePasswordDTO changePasswordDTO) throws Exception {
		
		User loginUser = new User();
		loginUser.setUserId(changePasswordDTO.getUserId());
		loginUser.setPassword(changePasswordDTO.getDefaultPassword());
		
		// ユーザー取得
		Optional<User> user = loginService.getUserByUserIdPassword(loginUser);
		if (!user.isPresent()) {
			throw new NoDataFoundException("There is no User data.");
		}
		
		// ユーザーパスワード設定
		user.get().setPassword(changePasswordDTO.getChangePassword());
		
		// ユーザーパスワード更新
		return changePasswordService.updatePasswordByUserId(user.get());
		
	}

}
