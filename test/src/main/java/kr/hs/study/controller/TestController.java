package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.dto.ScoreDTO;

@Controller
public class TestController {
	@GetMapping("/score_form")
	public String test1() {
		return "score_form";
	}
	
	@PostMapping("/score")
	public String test4(ScoreDTO dto, Model model) {
		model.addAttribute("name", dto.getName());
		model.addAttribute("korean", dto.getKorean());
		model.addAttribute("english", dto.getEnglish());
		model.addAttribute("math", dto.getMath());
		return "score";
	}
}