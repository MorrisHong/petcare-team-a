package com.petcare.web.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.petcare.web.config.RootConfig;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = RootConfig.class)
@Slf4j
@WebAppConfiguration
public class TimeMapperTest {

	@Autowired
	private TimeMapper mapper;
	
	@Test
	public void get_time_test() {
		log.info(mapper.getTime());
	}
}
