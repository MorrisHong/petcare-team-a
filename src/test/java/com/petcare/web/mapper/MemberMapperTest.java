package com.petcare.web.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.MemberVO;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
@Slf4j
public class MemberMapperTest {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void joinTest() {
		MemberVO member = new MemberVO();
		member.setUserId("soul01");
		member.setPassword("1234");
		member.setUserName("홍길동");
		member.setAddress("서울 동작구");
		member.setTel("010-1234-1234");
		member.setUserEmail("soul01@naver.com");
		
		memberMapper.register(member);
	}
}
