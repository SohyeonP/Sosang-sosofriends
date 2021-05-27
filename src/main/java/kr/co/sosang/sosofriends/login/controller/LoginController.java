package kr.co.sosang.sosofriends.login.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
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
	private NaverAPI naverapi = new NaverAPI();
	
	@RequestMapping(value="/kakaologin")
	    public void kakaologin(HttpSession session, HttpServletResponse response) throws IOException {

			SecureRandom state = new SecureRandom();
		
	        String url = "https://kauth.kakao.com/oauth/authorize?";
	        url += ("client_id=" + "d7a451134c2548e9b0b111051f80c34e");
	        url += ("&redirect_uri=http://localhost:8080/login");
	        url += ("&response_type=code");
	        url += ("&state=" + state);
	        
	        session.setAttribute("lo_info", "k");
	        
	        response.sendRedirect(url);
	    }
	
	
	@RequestMapping(value="/naverlogin")
		public void naverlogin(HttpSession session, HttpServletResponse response) throws IOException{
		SecureRandom state = new SecureRandom();
		
		String url = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
		url += ("&client_id=" + "gVb2zptEhIq39x0FnnPq");
		url += ("&redirect_uri=" + URLEncoder.encode("http://localhost:8080/login","UTF-8"));
		url += ("&state=" + state);
		
		session.setAttribute("state", state);
		session.setAttribute("lo_info", "n");
		
		response.sendRedirect(url);
	}
	
	@RequestMapping(value="/login")
	public void login(@RequestParam("code") String code, @RequestParam("state") String state, HttpSession session, HttpServletResponse response) {
			String lo_info = (String) session.getAttribute("lo_info");
			
			String access_token = "";
			HashMap<String ,Object> userInfo = new HashMap<>();
			
		 try {
			 
			 if(lo_info == "k") {
				access_token = kakaoapi.getAccessToken(code);
				userInfo = kakaoapi.getUserInfo(access_token);
			 }
			 
			 if(lo_info == "n") {
				 access_token = naverapi.getAccessToken(code, state);
				 userInfo = naverapi.getUserInfo(access_token);
			 }
			
			
			System.out.println("login info"+userInfo.toString());
			
			if(userInfo.get("email")!=null) {
				session.setAttribute("userid",userInfo.get("email"));
				session.setAttribute("access_token",access_token);
				session.setAttribute("lo_info", lo_info);
			}

			response.sendRedirect("/sosologin");
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
        
		response.sendRedirect(url);
	}
	
	@RequestMapping(value="/naverlogout")
	public void naverlogout(HttpSession session, HttpServletResponse response) throws IOException {
		
		String url = "https://nid.naver.com/oauth2.0/token?grant_type=delete";
        url += ("&client_id=" + "gVb2zptEhIq39x0FnnPq");
        url += ("&client_secret=" + "CP9NVJbtDd");
        url += ("&access_token=" + session.getAttribute("access_token"));
        url += ("&service_provider=NAVER");
        
        URL url1 = new URL(url);
        URL url2 = new URL(" http://nid.naver.com/nidlogin.logout");
        HttpURLConnection con = (HttpURLConnection)url1.openConnection();
        HttpURLConnection con2 = (HttpURLConnection)url2.openConnection();

		response.sendRedirect("/logout");
	}
	
	
	@RequestMapping(value="/logout")
	public void logout(HttpSession session, HttpServletResponse response) throws IOException {
		
		session.removeAttribute("access_token");
		session.removeAttribute("userid");
		session.removeAttribute("lo_info");
		
		response.sendRedirect("/");
	}
}
