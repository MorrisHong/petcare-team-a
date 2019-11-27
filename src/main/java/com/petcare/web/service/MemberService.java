package com.petcare.web.service;

import com.petcare.web.domain.HospitalVO;
import com.petcare.web.domain.UserVO;

public interface MemberService {
	//회원가입
	public void register(UserVO user);
	//아이디중복체크
	public UserVO getUser(String userId);
	//이메일중복체크
	public UserVO getEmail(String userEmail);
	//로그인
	public UserVO loginPro(UserVO user);
}
