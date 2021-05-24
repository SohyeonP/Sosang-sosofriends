package kr.co.sosang.sosofriends.admin.service;

import java.util.HashMap;
import java.util.Map;

import kr.co.sosang.sosofriends.admin.domain.Productinfo;

public interface AdminService {

	public int registerItems(Productinfo request, Map<String, Object> i_name)throws Exception;
	
	
}
