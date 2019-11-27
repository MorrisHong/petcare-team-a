package com.petcare.web.domain;

import java.sql.Timestamp;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class FaqVO {
	private Integer faqNo;
	private String faqTitle;
	private String faqContent;
	private String userId;
	private Timestamp faqRegdate;	
}