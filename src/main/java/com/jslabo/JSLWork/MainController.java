package com.jslabo.JSLWork;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("abc", "ほげほげほげ");
		model.addAttribute("detail", new ProjectDetail());
		return "hello";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String hello2(@ModelAttribute ProjectDetail detail,Model model) {
		model.addAttribute("abc", "ふがふがふが");
		model.addAttribute("detail", new ProjectDetail());
		return "hello";
	}
}
