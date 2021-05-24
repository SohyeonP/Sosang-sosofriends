package kr.co.sosang.sosofriends.login.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	
	private KakaoAPI kakaoapi = new KakaoAPI();
	
	@RequestMapping(value="/login")
	public ModelAndView login(@RequestParam("code") String code,HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		
		String access_token = kakaoapi.getAccessToken(code);
		
		HashMap<String ,Object> userInfo = kakaoapi.getUserInfo(access_token);
		
		System.out.println("login info"+userInfo.toString());
		
		if(userInfo.get("email")!=null) {
			session.setAttribute("userid",userInfo.get("email"));
			session.setAttribute("access_token",access_token);
		}
		mav.addObject("userId",userInfo.get("email"));
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		
		kakaoapi.kakaoLogout(session.getAttribute("access_token"));
		session.removeAttribute("access_token");
		session.removeAttribute("userId");
		mav.setViewName("main");
		return mav;
	}
}
