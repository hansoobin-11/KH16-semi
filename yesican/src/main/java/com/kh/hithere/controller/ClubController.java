package com.kh.hithere.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/club")
public class ClubController {
	@RequestMapping("/list")
	public String list() {
		return "/WEB-INF/views/club/list.jsp";
	}
	@GetMapping("/detail")
	public String detail() {
		return "/WEB-INF/views/club/detail.jsp";
	}
}
