package com.petcare.web.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class HospitalVO {

	private String hospitalId;
	private String hospitalPw;
	private String hospitalName;
	private String hospitalAddress;
	private String hospitalPhone;
	private String hospitalEmail;
	private String hospitalOpen;
	private String hospitalClose;
	private int hospitalNightcare;
	private int hospitalEmergency;
	private int hospitalSpecial;
	private int hospitalHotel;
	private String hospitalSpecies;
	private MultipartFile hospitalPhoto;
	private String hospitalIntro;
	private Date hospitalJoindate;
}
