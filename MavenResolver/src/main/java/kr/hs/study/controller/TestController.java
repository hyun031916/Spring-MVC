package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("id", "Kim");
		model.addAttribute("password", 1111);
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	
	@PostMapping("/test_result")
	public String test4(UserDTO dto, Model model) {
		model.addAttribute("id", dto.getId());
		model.addAttribute("password", dto.getPassword());
		model.addAttribute("email", dto.getEmail());
		return "login";
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("id", "lee");
		mv.addObject("password", "1111");
		mv.addObject("email", "hyun031916@gmail.com");
		//view �̸����� ����
		mv.setViewName("test4");
		return mv;
	}
	
	//��ü�� ��� ���� model�� ��Ƽ� view�� �ѱ�
	@GetMapping("/test5")
	public String test5(abcDTO dto, Model model) {	//���������� ModelDTO dto = new DTO() �ϰ� ���������.
		model.addAttribute("a", dto.getA());
		model.addAttribute("b", dto.getB());
		model.addAttribute("c", dto.getC());
		return "test5";
	}
	
	//��ü�� ��� ���� �ٷ� view�� �ѱ�
	@GetMapping("/test6")
	public String test6(@ModelAttribute abcDTO dto) {
		return "test6";
	}
	
	//��ü�� ��� ���� �ٷ� view�� �ѱ�
	@GetMapping("/test7")
	public String test7(@ModelAttribute("sample") abcDTO dto) {
		return "test7";
	}
}