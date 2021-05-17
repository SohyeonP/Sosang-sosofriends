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
	@GetMapping(value = "/additems")
	public String AddItems(){
		return "fileupload";
	}
	
	@RequestMapping(value="/store")
	public String store() {
		return "store_info";
	}
	
	@RequestMapping(value="/items")
	public String item() {
		return "product_list";
	}

	@RequestMapping(value = "/login")
	public String SoscialLogin(){return "login";}

	@RequestMapping(value = "/test")
	public String Test(){ return  "test";}

}
