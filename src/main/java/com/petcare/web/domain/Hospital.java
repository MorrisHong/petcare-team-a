package com.petcare.web.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.*;

@Data
public class Hospital {

	private String hospitalId;
	
	private String hospitalPw;
	
	private String hospitalPw2;
	
	private String hospitalName;
	
	private String hospitalAddress;
	
	private String hospitalPhone;
	
	private String hospitalEmail;
	
	private String hospitalOpen;
	
	private String hospitalClose;
	
	private String hospitalSpecies;
	
	private MultipartFile hospitalPhoto;
	
	private String hospitalIntro;
	
	private Date hospitalJoindate;
	
}
