package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.ModelDTO;
import kr.hs.study.model.ModelDTO2;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test(ModelDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	@GetMapping("/test2")
	public String test2() {
		return "login_form";
	}
	@PostMapping("/login")
	public String login(LoginDTO dto) {
		System.out.println("id: "+dto.getId());
		System.out.println("password: "+dto.getPassword());
		return "result";
	}
	@GetMapping("/test3")
	public String test3(ModelDTO2 dto) {
		System.out.println("a: "+dto.getA());
		System.out.println("b: "+dto.getB());
		System.out.println("c: ");
		for(int i=0; i < dto.getC().length; i++) {
			System.out.println(dto.getC()[i]);
		}
		return "result";
	}
}
