package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// bean���� ����Ͽ� �����Ͻ� ���� ����ϴ� ������ �Ѵ�.
@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}
}
