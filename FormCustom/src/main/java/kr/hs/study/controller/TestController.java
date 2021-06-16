package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.UserDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String register(UserDTO dto) {
		dto.setUser_name("kim");
		dto.setUser_id("hyun031916");
		dto.setUser_pw("1111");
		dto.setUser_email("hyun03916@gmail.com");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("jungnang");
		return "test1";
	}
	
}