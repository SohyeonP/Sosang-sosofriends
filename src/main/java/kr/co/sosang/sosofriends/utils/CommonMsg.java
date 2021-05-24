package kr.co.sosang.sosofriends.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;

public class CommonMsg {

	  @SuppressWarnings("unchecked")
	  public String getMessage(String resultcode, String msg) {

	    JSONObject statusItem = new JSONObject();
	    JSONObject resultData = new JSONObject();

	    resultData.put("isSuccessful", null);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }

	  @SuppressWarnings("unchecked")
	  public String getMessage(String resultcode, String msg, boolean isresult) {

	    JSONObject statusItem = new JSONObject();
	    JSONObject resultData = new JSONObject();

	    resultData.put("isSuccessful", isresult);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }

	  public Map<String, Object> getMessageMap(String resultcode, String msg, boolean isresult) {

	    Map<String, Object> statusItem = new HashMap<String, Object>();
	    Map<String, Object> resultData = new HashMap<String, Object>();

	    resultData.put("isSuccessful", isresult);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData;

	  }

	  @SuppressWarnings("unchecked")
	  public String getMessage(int resultcode, String msg, boolean isresult) {

	    JSONObject statusItem = new JSONObject();
	    JSONObject resultData = new JSONObject();

	    resultData.put("isSuccessful", isresult);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }


	  @SuppressWarnings("unchecked")
	  public String getRsultMapVlues(int resultcode, String msg, boolean isresult, Map<String, Object> body) {

	    JSONObject statusItem = new JSONObject();
	    JSONObject resultData = new JSONObject();

	    resultData.put("isSuccessful", isresult);
	    resultData.put("body", body);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }


	  public Map<String, Object> getMapRsultVlues(int resultcode, String msg, boolean isresult, Map<String, Object> body) {

	    Map<String, Object> statusItem = new HashMap<String, Object>();
	    Map<String, Object> resultData = new HashMap<String, Object>();

	    resultData.put("isSuccessful", isresult);
	    resultData.put("body", body);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData;

	  }

	  @SuppressWarnings("unchecked")
	  public String getRsultListVlues(int resultcode, String msg, boolean isresult, List<Map<String, Object>> body) {

	    JSONObject statusItem = new JSONObject();
	    JSONObject resultData = new JSONObject();

	    resultData.put("isSuccessful", isresult);
	    resultData.put("body", body);
	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }
	  
	  
	  @SuppressWarnings("unchecked")
	  public String getRsultJsonObjectAdd(int resultcode, String msg, boolean isresult, JSONObject resultData) {

	    JSONObject statusItem = new JSONObject();

	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }
	  
	  @SuppressWarnings("unchecked")
	  public String getRsultAddError(String resultcode, String msg) {

	    JSONObject statusItem = new JSONObject();
	    JSONObject resultData = new JSONObject();

	    statusItem.put("code", resultcode);
	    statusItem.put("message", msg);
	    resultData.put("status", statusItem);

	    return resultData.toJSONString();

	  }

	  
	  public Map<String, Object> getCheckParam(String apigbn, String apikey){
		  
		  Map<String, Object> paramMap = new HashMap<String, Object>();
		  
		  paramMap.put("apigbn", apigbn);
		  paramMap.put("apikey", apikey);
		  
		  return paramMap;
		  
	  }
	  
	}
