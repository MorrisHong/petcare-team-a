package com.petcare.web.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReviewVo {

	private int reviewNo;
	private String userId;
	private String reviewContent;
	private int reviewRating;
	private Date reviewRegdate;
	private String hospitalId;
	
}
