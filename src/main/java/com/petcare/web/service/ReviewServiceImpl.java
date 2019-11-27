package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.ReviewPageDto;
import com.petcare.web.domain.ReviewVo;
import com.petcare.web.mapper.ReviewMapper;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	private ReviewMapper mapper;

	@Override
	public int register(ReviewVo review) {
		return mapper.insert(review);
	}

	@Override
	public ReviewPageDto getList(Criteria cri, String hospitalid) {
		return new ReviewPageDto(mapper.getCountByHospitalId(hospitalid), mapper.getList(cri, hospitalid));
	}

	@Override
	public int remove(int reviewNo) {
		return mapper.delete(reviewNo);
	}
}
