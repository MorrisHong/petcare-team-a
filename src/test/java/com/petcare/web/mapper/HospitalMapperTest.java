package com.petcare.web.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.Hospital;
import com.petcare.web.domain.Character;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = RootConfig.class)
public class HospitalMapperTest {
	
	@Autowired
	private HospitalMapper hospitalMapper;
	
	@Test
	public void joinTest() {
		Hospital hospital = new Hospital();
		
		hospital.setHospitalId("hos01");
		hospital.setHospitalPw("12341234");
		hospital.setHospitalName("김자바");
		hospital.setHospitalAddress("서울시 종로구");
		hospital.setHospitalPhone("010-1234-1234");
		hospital.setHospitalEmail("hos01@naver.com");
		hospital.setHospitalOpen("09:00");
		hospital.setHospitalClose("18:00");
		hospital.setHospitalIntro("안녕하세요.");
		
		hospitalMapper.register(hospital);
	}
	
	@Test
	public void codeTest() {
		Character character = new Character();
		
		character.setHospitalId("hos03");
		character.setCCode(2);
		
		hospitalMapper.codeInsert(character);
	}
}
