package com.petcare.web.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.petcare.web.config.RootConfig;
import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.ReviewVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
@WebAppConfiguration
public class ReviewMapperTest {

	@Autowired
	private ReviewMapper mapper;
	
	@Test
	public void tesPaging() {
		Criteria cri = new Criteria();
		
		cri.setPageNum(1);
		cri.setAmount(10);
		List<ReviewVo> list = mapper.getList(cri, "nam");
	}
}
