package kr.co.sosang.sosofriends.login.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
	private GoogleAPI googleapi = new GoogleAPI();
	
	
	
	@RequestMapping(value="/kakaologin")
	    public void kakaologin(HttpSession session, HttpServletResponse response) throws IOException {

			SecureRandom state = new SecureRandom();
		
	        String url = "https://kauth.kakao.com/oauth/authorize?";
	        url += ("client_id=" + "{client_id}");
	        url += ("&redirect_uri=http://localhost:8080/login");
	        url += ("&response_type=code");
	        url += ("&state=" + state);
	        
	        session.setAttribute("l_info", "k");
	        
	        response.sendRedirect(url);
	    }
	
	
	@RequestMapping(value="/naverlogin")
		public void naverlogin(HttpSession session, HttpServletResponse response) throws IOException{
		SecureRandom state = new SecureRandom();
		
		String url = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
		url += ("&client_id=" + "{client_id}");
		url += ("&redirect_uri=" + URLEncoder.encode("http://localhost:8080/login","UTF-8"));
		url += ("&state=" + state);
		
		session.setAttribute("state", state);
		session.setAttribute("l_info", "n");
		
		response.sendRedirect(url);
	}
	
	
	
	@RequestMapping(value="/googlelogin")
		public void googleloing(HttpSession session, HttpServletResponse response) throws IOException {
		SecureRandom state = new SecureRandom();
		
		String url = "https://accounts.google.com/o/oauth2/v2/auth?scope=profile%20email&response_type=code";
		url += ("&access_type=" + "offline");
		url += ("&client_id=" + "client_id");
		url += ("&redirect_uri=" + URLEncoder.encode("http://localhost:8080/login","UTF-8"));
		url += ("&state=" + state);
		
		session.setAttribute("l_info", "g");
		
		response.sendRedirect(url);
	}
	
	@RequestMapping(value="/login")
	public void login(@RequestParam("code") String code, @RequestParam("state") String state, HttpSession session, HttpServletResponse response) {
			String l_code = (String) session.getAttribute("l_info");
			
			String access_token = "";
			HashMap<String ,Object> userInfo = new HashMap<>();
			
		 try {
			 
			 if(l_code == "k") {
				access_token = kakaoapi.getAccessToken(code);
				userInfo = kakaoapi.getUserInfo(access_token);
			 }
			 
			 if(l_code == "n") {
				 access_token = naverapi.getAccessToken(code, state);
				 userInfo = naverapi.getUserInfo(access_token);
			 }
			 
			 if(l_code == "g") {
				 access_token = googleapi.getAccessToken(code);
				 userInfo = googleapi.getUserInfo(access_token);
			 }
			
			
			System.out.println("login info"+userInfo.toString());
			
			if(userInfo.get("email")!=null) {
				session.setAttribute("userid",userInfo.get("email"));
				session.setAttribute("access_token",access_token);
				session.setAttribute("l_code", l_code);
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
        url += ("client_id=" + "client_id");
        url += ("&logout_redirect_uri=http://localhost:8080/logout");
        
		response.sendRedirect(url);
	}
	
	@RequestMapping(value="/naverlogout")
	public void naverlogout(HttpSession session, HttpServletResponse response) throws IOException {
		
		String url = "https://nid.naver.com/oauth2.0/token?grant_type=delete";
        url += ("&client_id=" + "{Client id}");
        url += ("&client_secret=" + "CP9NVJbtDd");
        url += ("&access_token=" + session.getAttribute("access_token"));
        url += ("&service_provider=NAVER");
        
        URL url1 = new URL(url);
        URL url2 = new URL(" http://nid.naver.com/nidlogin.logout");
        HttpURLConnection con = (HttpURLConnection)url1.openConnection();
        HttpURLConnection con2 = (HttpURLConnection)url2.openConnection();

		response.sendRedirect("/logout");
	}
	
	@RequestMapping(value="/googlelogout")
	public void googlelogout(HttpSession session, HttpServletResponse response) throws IOException {
		
		String url = "https://oauth2.googleapis.com/revoke?";
        url += ("token=" + session.getAttribute("access_token"));
        
        URL url1 = new URL(url);
        HttpURLConnection con = (HttpURLConnection)url1.openConnection();
		response.sendRedirect("/logout");
	}
	
	
	@RequestMapping(value="/logout")
	public void logout(HttpSession session, HttpServletResponse response) throws IOException {
		
		session.removeAttribute("access_token");
		session.removeAttribute("userid");
		session.removeAttribute("l_code");
		session.removeAttribute("l_info");
		session.removeAttribute("state");
		
		response.sendRedirect("/");
	}
}
