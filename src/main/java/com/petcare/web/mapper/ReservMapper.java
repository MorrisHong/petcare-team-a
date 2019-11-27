package com.petcare.web.mapper;

import java.util.List;

import com.petcare.web.domain.PetVO;
import com.petcare.web.domain.ReservVO;

public interface ReservMapper {

	//예약하기 폼
	int reservationForm(ReservVO reservoVO);

	//로그인한 사람의 동물 불러오기
	List<PetVO> getPets(String userId);

}
