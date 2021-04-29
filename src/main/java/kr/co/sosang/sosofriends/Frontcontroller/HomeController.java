package kr.co.sosang.sosofriends.Frontcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String Home() {
		
		return "main";
	}
	
	@RequestMapping(value="/admin")
	public String admin() {
		
		return "admin";
	}
}
