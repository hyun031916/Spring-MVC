package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// bean으로 등록하여 비지니스 로직 담당하는 역할을 한다.
@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	//get 방식으로 /test1에 접속했을 때 콘솔에 test1 출력
	
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String test1() {
		System.out.println("test1");
		return "test1";
	}

}
