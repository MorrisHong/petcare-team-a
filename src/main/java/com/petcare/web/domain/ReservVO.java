package com.petcare.web.domain;

import lombok.Data;

@Data
public class ReservVO {

	//예약 시퀀스
	private String apptNo;
	
	//동물 번호
	private String petNo;
	
	//유저 아이디(pk)
	private String userId;
	
	//병원
	private String hospitalId;
	
	//예약 날짜
	private String apptDate;
	
	//예약 시간
	private String apptTime;
	
	//병원 예약 메모
	private String apptNote;
	
	//예약상태 0:미확정 1:확정
	private String apptStatus;
	
}
