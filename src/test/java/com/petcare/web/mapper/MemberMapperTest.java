package com.petcare.web.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = RootConfig.class)
public class MemberMapperTest {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Test
	public void joinTest() {
		MemberVO member = new MemberVO();
		/*
		 * member.setUserId("soul09"); member.setUserPw("1234");
		 * member.setUserName("홍길동"); member.setUserAddress("서울시 동작구");
		 * member.setUserPhone("010-1234-1234");
		 * member.setUserEmail("soul09@naver.com");
		 */
		
		//memberMapper.register(member);
	}
	
}
