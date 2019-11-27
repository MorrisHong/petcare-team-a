package com.petcare.web.domain;

import java.util.Date;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.*;

@Data
public class UserVO {
	
	@NotEmpty(message = "ID를 입력하세요.")
	@Size(min = 5, max = 10, message = "ID는 5 ~ 10글자이어야 합니다.")
	private String userId;
	
	@NotEmpty(message = "비밀번호를 입력하세요.")
	@Size(min = 8, max = 16, message = "비밀번호는 8 ~ 16글자이어야 합니다.")
	private String userPw;
	
	@NotEmpty(message = "비밀번호를 입력하세요.")
	@Size(min = 8, max = 16, message = "비밀번호는 8 ~ 16글자이어야 합니다.")
	private String userPw2;
	
	@NotEmpty(message = "이름을 입력하세요.")
	private String userName;
	
	@NotEmpty(message = "주소를 입력하세요.")
	private String userAddress;
	
	@NotEmpty(message = "전화번호를 입력하세요.")
	@Pattern(regexp = "(^[0-9]{10,11})", message = " '-' 를 제외한 숫자만 적어주세요.")
	private String userPhone;
	
	@NotEmpty(message = "이메일을 입력하세요.")
	@Email(message = "이메일 형식이 아닙니다.")
	private String userEmail;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date userJoindate;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date userLastLogin;
	
	private String userAuthority;
}
