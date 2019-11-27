package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petcare.web.domain.HospitalVO;
import com.petcare.web.domain.UserVO;
import com.petcare.web.mapper.MemberMapper;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	//회원가입
	@Transactional
	@Override
	public void register(UserVO user) {
		memberMapper.register(user);
	}
	
	//아이디 중복체크
	@Override
	public UserVO getUser(String userId) {
		return memberMapper.getUser(userId);
	}

	//이메일 중복체크
	@Override
	public UserVO getEmail(String userEmail) {
		return memberMapper.getEmail(userEmail);
	}
	
	//로그인 처리
	@Override
	public UserVO loginPro(UserVO user) {
		return memberMapper.loginPro(user);
	}
}
