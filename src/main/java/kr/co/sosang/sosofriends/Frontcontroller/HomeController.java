package kr.co.sosang.sosofriends.Frontcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String Home() {
		return "soso/main";
	}
	@GetMapping(value = "/additems")
	public String AddItems(){
		return "soso/fileupload";
	}
	
	@RequestMapping(value="/store")
	public String store() {
		return "soso/store_info";
	}
	
	@RequestMapping(value="/items")
	public String item() {
		return "soso/product_list";
	}
	
	@RequestMapping(value="/story")
	public String story() {
		return "soso/brand_story";
	}

	@RequestMapping(value = "/test")
	public String Test(){ return  "test";}

}
