package kr.co.sosang.sosofriends.login.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class GoogleAPI {
	public String getAccessToken(@RequestParam("code") String code) throws IOException {
		String accessToken = "";
		String refreshToken ="";
		
		String reqURL= "https://oauth2.googleapis.com/token";
		
		try {
		      URL url = new URL(reqURL);
		      
		      HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		      conn.setRequestMethod("POST");
		      conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		      conn.setDoOutput(true);
		      
		      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
		      StringBuilder sb = new StringBuilder();
		      sb.append("grant_type=authorization_code");
		      sb.append("&client_id={google_Client_ID}");
		      sb.append("&client_secret={google_API_KEY}");
			  sb.append("&redirect_uri=http://localhost:8080/login");
			  sb.append("&code="+code);
				
			  bw.write(sb.toString());
			  bw.flush();
			  
		      int responseCode = conn.getResponseCode();
		      
		      System.out.println("responseCode="+responseCode);
		      
		      
		      BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		      String line = "";
		      String result = "";
		      
		      while ((line = br.readLine()) != null) {
		        result += line;
		      }
		      
		      JsonParser parser = new JsonParser();
				
			  JsonElement  element = parser.parse(result);
			
			  System.out.println(element);
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
		
		String reqUrl ="https://www.googleapis.com/userinfo/v2/me?token=" + access_token;
		try {
				URL url = new URL(reqUrl);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				conn.setRequestProperty("Authorization", "Bearer "+access_token);
				int responseCode = conn.getResponseCode();
				
				System.out.println("responseCode"+responseCode);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				String line = "";
				
				String result ="";
				while((line = br.readLine()) !=null){
					result += line;
					
				}
				System.out.println("response body ="+result);
				
				JsonParser  parser = new JsonParser();
				
				JsonElement element = parser.parse(result);
				String name = element.getAsJsonObject().get("name").getAsString();
				String mail = element.getAsJsonObject().get("email").getAsString();
				
				userInfo.put("name",name);
				userInfo.put("email",mail);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return userInfo;
	}
}
