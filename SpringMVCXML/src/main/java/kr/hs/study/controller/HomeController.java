package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// bean���� ����Ͽ� �����Ͻ� ���� ����ϴ� ������ �Ѵ�.
@Controller
public class HomeController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
	//get ������� /test1�� �������� �� �ֿܼ� test1 ���
	
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String test1() {
		System.out.println("test1");
		return "test1";
	}

}
