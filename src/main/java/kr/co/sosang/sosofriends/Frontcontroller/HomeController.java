package kr.co.sosang.sosofriends.Frontcontroller;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String Home() {
		return "main";
	}
	@GetMapping(value = "/additems")
	public String AddItems(){
		return "fileupload";
	}

	@RequestMapping(value = "/login")
	public String SoscialLogin(){return "login";}

	@RequestMapping(value = "/test")
	public String Test(){ return  "test";}

}
