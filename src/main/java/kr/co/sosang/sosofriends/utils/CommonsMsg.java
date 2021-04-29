package kr.co.sosang.sosofriends.utils;

import org.json.simple.JSONObject;

public class CommonsMsg {
	
	@SuppressWarnings("unchecked")
	public String getMessage(String resultcode, String msg) {
		
		JSONObject statusItem = new JSONObject();
		JSONObject resultData = new JSONObject();
		
		resultData.put("isSuccessFul", null);
		statusItem.put("code", resultcode);
		statusItem.put("message", msg);
		resultData.put("status", statusItem);
		resultData.put("server_response_time", Utils.pastTime());
		
		return resultData.toJSONString();
		
	}
}
