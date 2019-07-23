package com.kshitij.certification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Certification")
public class CertificationController {
	@RequestMapping("/Java8")
	public String getData()
	{
		
		return "index";
	}

}
