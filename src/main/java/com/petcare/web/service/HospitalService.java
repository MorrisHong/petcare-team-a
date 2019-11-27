package com.petcare.web.service;

import java.util.List;

import com.petcare.web.domain.Character;
import com.petcare.web.domain.Hospital;
import com.petcare.web.domain.HospitalVO;

public interface HospitalService {
	//병원 전체 리스트
	public List<HospitalVO> list();
	//병원 검색
	public List<HospitalVO> search(String hospitalName);
	//병원 보기
	public HospitalVO view(String hospitalId);
	//병원 회원가입
	public void register(Hospital hospital);
	//특성 삽입
	public void codeInsert (Character character);
	//아이디중복체크
	public int selectID(String id);
	//이메일중복체크
	public int selectEmail(String email);
	//병원회원 로그인
	public Hospital loginPro2(Hospital hospitaluser);	
}
