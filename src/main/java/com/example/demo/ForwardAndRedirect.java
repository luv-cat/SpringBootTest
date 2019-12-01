package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardAndRedirect {
	
	@RequestMapping("/test")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		return mav;
	}
	// リダイレクトの記述
	@RequestMapping("/other")
	public String other() {
		return "redirect:/";
		// googleに飛ばす場合
		//　return "redirect:http://www.google.com";
	}
	// フォワードの記述
	@RequestMapping("/home")
	public String home() {
		return "forward:/";
	}
}
