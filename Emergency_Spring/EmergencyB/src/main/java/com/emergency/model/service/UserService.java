package com.emergency.model.service;

import com.emergency.model.dto.User;

public interface UserService {
	// 회원 가입
		int createUser(User user);
		
		// 회원 정보 수정
		int updateUser(User user);
		
		// 마이페이지 조회
		User selectUser(String id);
		
		// 회원 탈퇴
		int deleteUser(String id);
}
