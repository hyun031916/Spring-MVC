package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// bean으로 등록하여 비지니스 로직 담당하는 역할을 한다.
@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}
}
