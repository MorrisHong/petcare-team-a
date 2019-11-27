package com.petcare.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petcare.web.service.HospitalService;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petcare.web.domain.Hospital;
import com.petcare.web.domain.HospitalVO;
import com.petcare.web.domain.Character;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	//병원 정보
	@GetMapping("/get")
	public void get(@RequestParam("hospitalId") String hospitalId, Model model) {
		model.addAttribute("hospital", hospitalService.view(hospitalId));
	}
	
	//병원 전체 리스트
	@GetMapping("/list")
	public void hospitalList(Model model) {
		//new ArrayList?
		List<HospitalVO> list = new ArrayList<HospitalVO>();
		list = hospitalService.list();
		//all?
		model.addAttribute("list",list);
	}
	
	//병원 검색
	@GetMapping("/search")
	public String hospitalSearch(Model model, String hospitalName) {
		List<HospitalVO> search = hospitalService.search(hospitalName);
		model.addAttribute("search",search);
		return "hospital/list";
	}
	
	@GetMapping("/register")
	public String hospital(Model model) {
		model.addAttribute("hospital", new Hospital());
		return "hospitalRegister";
	}
	
	@PostMapping("/Join")
	public String register(Hospital hospital, Character character, HttpServletRequest request) {
		
		hospitalService.register(hospital);
		
		String[] list = request.getParameterValues("cCode");
		
		if(list != null) {
			for(int i = 0; i < list.length; i++) {
				Character code = new Character();
				code.setCCode(Integer.parseInt(list[i]));
				code.setHospitalId(hospital.getHospitalId());
				
				hospitalService.codeInsert(code);
			}
		}
		
		return "redirect:/index";
	}
	
	@PostMapping("/check_id")
	@ResponseBody
	public void selectID(@RequestParam("hospitalId") String id, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		int count = hospitalService.selectID(id);
		if(count == 0) {
			out.print(true);
		}else if(count == 1) {
			out.print(false);
		}
	}
	
	@PostMapping("/check_email")
	@ResponseBody
	public void selectEmail(@RequestParam("hospitalEmail") String email, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		int count = hospitalService.selectEmail(email);
		if(count == 0) {
			out.print(true);
		}else if(count == 1) {
			out.print(false);
		}
	}	
}
