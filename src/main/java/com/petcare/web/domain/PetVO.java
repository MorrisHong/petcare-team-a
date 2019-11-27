package com.petcare.web.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

//동물vo
@Data
public class PetVO {

	private int petNo;
	@NotEmpty(message="이름을 입력해주세요.")
	private String petName;
	private String petGender;
	private String petNeuter;
	@Min(value=1, message="몸무게는 0 이상이어야 합니다.")
	@NotNull(message="몸무게를 입력해주세요.")
	private int petWeight;
	@NotEmpty(message="종류를 입력해주세요.")
	private String petSpecies;
	@NotEmpty(message="품종을 입력해주세요.")
	private String petBreed;
	@Min(value=1, message="나이는 0 이상이어야 합니다.")
	@NotNull(message="나이를 입력해주세요.")
	private int petAge;
	private byte[] petPhoto;
	private String userId;
	private Date petRegdate;
	private Date treatRegdate;
	
}
