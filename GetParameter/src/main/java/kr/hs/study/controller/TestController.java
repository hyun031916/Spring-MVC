package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String[] c = request.getParameterValues("c");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		for(String value:c) {
			System.out.println(value);
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	@PostMapping("/login")
	public String login(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		System.out.println("id: "+id);
		System.out.println("password: "+password);
		return "login";
	}
	
	@GetMapping("/test4")
	public String test4(WebRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		return "result";
	}
}
