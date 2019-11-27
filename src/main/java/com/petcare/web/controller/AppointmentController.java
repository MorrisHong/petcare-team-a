package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.petcare.web.domain.AppointmentVo;
import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.PageDto;
import com.petcare.web.service.AppointmentService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService service;
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		model.addAttribute("apptLists", service.getList(cri));
		
		int total = service.getTotal(cri);
		
		model.addAttribute("pageMaker", new PageDto(cri, total));
	}
	
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("apptNo") int apptNo, @ModelAttribute("cri") Criteria cri, Model model) {
		model.addAttribute("appt", service.get(apptNo));
	}
	
	@PostMapping("/modify")
	public String modify(AppointmentVo appointment, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		
		if(service.modify(appointment)) {
			rttr.addFlashAttribute("modify", appointment.getApptStatus());
		}

		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:/appointment/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("apptNo") int apptNo, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) {
		if(service.remove(apptNo)) {
			rttr.addFlashAttribute("remove", apptNo);
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		
		return "redirect:/appointment/list";
	}
}
