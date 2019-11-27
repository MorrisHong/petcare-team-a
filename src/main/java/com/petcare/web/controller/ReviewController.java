package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.ReviewPageDto;
import com.petcare.web.domain.ReviewVo;
import com.petcare.web.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	//리뷰 등록
	@PostMapping(value = "/new", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> create(@RequestBody ReviewVo review) {
		
		int insertCount = service.register(review);
		
		return insertCount == 1
				? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//병원 리뷰 목록
	@GetMapping(value = "/pages/{hospitalid}/{page}",
			produces = {
					MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReviewPageDto> getList(@PathVariable("page") int page, @PathVariable("hospitalid") String hospitalId){
		Criteria cri = new Criteria(page, 10);
		return new ResponseEntity<>(service.getList(cri, hospitalId), HttpStatus.OK);
	}
	
	//리뷰삭제
	@DeleteMapping(value = "/{reviewNo}", produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@PathVariable("reviewNo") int reviewNo){
		
		return service.remove(reviewNo) == 1
				? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
