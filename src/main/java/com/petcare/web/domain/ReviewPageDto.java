package com.petcare.web.domain;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReviewPageDto {

	private int reviewCnt;
	private List<ReviewVo> list;

	public int getReviewCnt() {
		return reviewCnt;
	}
	public void setReviewCnt(int reviewCnt) {
		this.reviewCnt = reviewCnt;
	}
	public List<ReviewVo> getList() {
		return list;
	}
	public void setList(List<ReviewVo> list) {
		this.list = list;
	}
}
