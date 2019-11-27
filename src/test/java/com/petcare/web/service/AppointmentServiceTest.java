package com.petcare.web.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.AppointmentVo;
import com.petcare.web.domain.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
@WebAppConfiguration
public class AppointmentServiceTest {

	@Autowired
	private AppointmentService service;
	
//	@Test
//	public void listTest() {
//		Criteria cri = new Criteria();
//		
//		cri.setAmount(10);
//		cri.setPageNum(1);
//		
//		service.getList(cri, "nam");
//	}
	
//	@Test
//	public void testGet() {
//		service.get(1);
//	}
	
//	@Test
//	public void removeTest() {
//		service.remove(1);
//	}
	
	@Test
	public void modifyTest() {
		AppointmentVo appt = service.get(2);
		
		appt.setApptStatus(0);
		
		service.modify(appt);
	}
}
