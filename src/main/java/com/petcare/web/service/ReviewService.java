package com.petcare.web.service;

import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.ReviewPageDto;
import com.petcare.web.domain.ReviewVo;

public interface ReviewService {

	public int register(ReviewVo review);
	
	public ReviewPageDto getList(Criteria cri, String hospitalid);
	
	public int remove(int reviewNo);
	
}
