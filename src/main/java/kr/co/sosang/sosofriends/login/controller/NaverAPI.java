package kr.co.sosang.sosofriends.login.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class NaverAPI {

	public String getAccessToken(@RequestParam("code") String code, @RequestParam("state") String state) throws IOException {
		String accessToken = "";
		String refreshToken ="";
		
		String reqURL= "https://nid.naver.com/oauth2.0/token?grant_type=authorization_code})";
			reqURL += ("&redirect_uri=" + URLEncoder.encode("http://localhost:8080/login","UTF-8"));
			reqURL += ("&code=" + code);
			reqURL += ("&state=" + state);
		try {
		      URL url = new URL(reqURL);
		      
		      HttpURLConnection con = (HttpURLConnection)url.openConnection();
		      con.setRequestMethod("GET");
		      int responseCode = con.getResponseCode();
		      
		      System.out.println("responseCode="+responseCode);
		      
		      
		      BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
		      String line = "";
		      String result = "";
		      
		      while ((line = br.readLine()) != null) {
		        result += line;
		      }
		      
		      JsonParser parser = new JsonParser();
				
			  JsonElement  element = parser.parse(result);
			
			  accessToken = element.getAsJsonObject().get("access_token").getAsString();
			  refreshToken = element.getAsJsonObject().get("refresh_token").getAsString();
			
				
		      br.close();
		      
	    } catch (Exception e) {
	      System.out.println(e);
	    }
		return accessToken;
	}

	
	
	public HashMap<String, Object> getUserInfo(String access_token) {
		HashMap<String,Object> userInfo = new HashMap<String,Object>();
		
		String reqUrl = "https://openapi.naver.com/v1/nid/me";
		
		try {
			URL url = new URL(reqUrl);
			
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Authorization", "Bearer "+access_token);
			
			for(HashMap.Entry<String, Object> header :userInfo.entrySet()) {
                con.setRequestProperty(header.getKey(), (String) header.getValue());
            }

            int responseCode = con.getResponseCode();
            System.out.println("responsecode"+responseCode);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            
            String line = "";
			
			String result ="";
			while((line = br.readLine()) !=null){
				result += line;
			}
			
			System.out.println("body" + result);
			
			JsonParser  parser = new JsonParser();
			
			JsonElement element = parser.parse(result);
			
			JsonObject response = element.getAsJsonObject().get("response").getAsJsonObject();
			
			String name = response.getAsJsonObject().get("name").getAsString();
			String mail = response.getAsJsonObject().get("email").getAsString();
			
			userInfo.put("name",name);
			userInfo.put("email",mail);
			
		} catch(IOException e) {
			throw new RuntimeException("API 요청과 응답 실패", e);
		}
		return userInfo;
	}
	
}
