package com.petcare.web.mapper;

import com.petcare.web.domain.MemberVO;

public interface LoginMapper {
	    MemberVO findCorrectUser(MemberVO member);
}
