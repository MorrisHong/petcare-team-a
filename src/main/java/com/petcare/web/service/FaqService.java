package com.petcare.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.FaqVO;
import com.petcare.web.mapper.FaqMapper;

@Service
public class FaqService {
	
	@Autowired
	private FaqMapper faqMapper;
	
	public List<FaqVO> faqList(){
		return faqMapper.faqList();
	}
	
	public FaqVO view(FaqVO faq) {
		return faqMapper.view(faq);
	}
	
	public FaqVO modifyView(FaqVO faq) {
		return faqMapper.modifyView(faq);
	}
	
	public void insert(FaqVO faq) {
		faqMapper.insert(faq);
	}
	
	public void update(FaqVO faq) {
		faqMapper.update(faq);
	}
	
	public void delete(FaqVO faq) {
		faqMapper.delete(faq);
	}
}
