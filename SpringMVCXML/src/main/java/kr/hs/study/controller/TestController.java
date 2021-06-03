package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub")
public class TestController {
	
//	@RequestMapping(value="/test2", method=RequestMethod.GET)
	@GetMapping("/test2")
	public String test2() {
		System.out.println("test2");
		return "sub/test2";	//���� ���: ��Ʈ���� ���� webapp/WEB-INF/...
//		return "WEB-INF/views/sub/test2.jsp";	//��� ���: �� ��ġ���� ���� sub/webapp/WEB-INF/...
	}
	
	@RequestMapping(value="/test3", method= {RequestMethod.GET, RequestMethod.POST})	//�� ��� ��� ���
	public String test3() {
		System.out.println("test3");
		return "sub/test3";
//		return "/WEB-INF/views/sub/test3.jsp";
	}

	@RequestMapping(value="/test4", method=RequestMethod.GET)
	public String test4() {
		System.out.println("test4");
		return "sub/test4";
	}
}