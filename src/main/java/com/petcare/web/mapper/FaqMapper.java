package com.petcare.web.mapper;

import java.util.List;
import com.petcare.web.domain.FaqVO;

public interface FaqMapper {
	List<FaqVO> faqList();
	FaqVO view(FaqVO faq);
	FaqVO modifyView(FaqVO faq);
	void insert(FaqVO faq);
	void update(FaqVO faq);
	void delete(FaqVO faq);
}
