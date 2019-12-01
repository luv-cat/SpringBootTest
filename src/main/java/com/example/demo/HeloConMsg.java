package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloConMsg {
	// value="/Name"でマッピング
	@RequestMapping(value="/Name", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("Name");
		mav.addObject("msg", "お名前を書いて送信してください。");
		return mav;
	}
	
	@RequestMapping(value="/Name", method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str, ModelAndView mav) {
		// 入力値が空の場合
		if(str == "" || str == null) return index(mav);
		// 入力値がある場合
		mav.addObject("msg", "こんにちは、" + str + "さん！");
		mav.addObject("value", str);
		mav.setViewName("Name");
		return mav;
	}
}
