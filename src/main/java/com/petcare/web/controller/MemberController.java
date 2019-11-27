package com.petcare.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.UserVO;
import com.petcare.web.service.MemberService;
import com.petcare.web.validator.MemberValidator;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService MemberService;
	
    @Autowired
    private MemberValidator memberValidator;
	  
    @InitBinder
    private void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setValidator(memberValidator);
    }

	@GetMapping("/normal")
	public String normal(Model model) {
		model.addAttribute("user", new UserVO());
		return "user/normalRegister";
	}
	
	@PostMapping("/user")
	public String register(@ModelAttribute("user") @Valid UserVO user, BindingResult result) {
		String msg = null;
		
		if(result.hasErrors()) {
			
			  List<FieldError> errors = result.getFieldErrors(); 
			  for(FieldError error : errors) { 
				  msg = error.getDefaultMessage(); 
			  }
			 
			return "user/normalRegister";
		}
		MemberService.register(user);
		return "redirect:/index";
	}
	

}