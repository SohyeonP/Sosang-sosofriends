package kr.co.sosang.sosofriends.login.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	
	private KakaoAPI kakaoapi = new KakaoAPI();
	
	@RequestMapping(value="/kakaologin")
	    public void kakaologin(HttpServletResponse response) throws IOException {

	        String url = "https://kauth.kakao.com/oauth/authorize?";
	        url += ("client_id=" + "d7a451134c2548e9b0b111051f80c34e");
	        url += ("&redirect_uri=http://localhost:8080/login");
	        url += ("&response_type=code");
	        
	        response.sendRedirect(url);
	    }
	
	@RequestMapping(value="/login")
	public void login(@RequestParam("code") String code,HttpSession session, HttpServletResponse response) {

		try {
			String access_token = kakaoapi.getAccessToken(code);
			
			HashMap<String ,Object> userInfo = kakaoapi.getUserInfo(access_token);
			
			System.out.println("login info"+userInfo.toString());
			
			if(userInfo.get("email")!=null) {
				session.setAttribute("userid",userInfo.get("email"));
				session.setAttribute("access_token",access_token);
			}

			response.sendRedirect("/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/kakaologout")
	public void kakaologout(HttpSession session, HttpServletResponse response) throws IOException {
		
		String url = "https://kauth.kakao.com/oauth/logout?";
        url += ("client_id=" + "d7a451134c2548e9b0b111051f80c34e");
        url += ("&logout_redirect_uri=http://localhost:8080/logout");
		
		session.removeAttribute("access_token");
		session.removeAttribute("userid");
		
		response.sendRedirect(url);
	}
	
	@RequestMapping(value="/logout")
	public void logout(HttpSession session, HttpServletResponse response) throws IOException {
		
		session.removeAttribute("access_token");
		session.removeAttribute("userid");
		
		response.sendRedirect("/");
	}
}
