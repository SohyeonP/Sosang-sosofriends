package kr.co.sosang.sosofriends.admin.service;

import java.util.List;
import java.util.Map;

import kr.co.sosang.sosofriends.admin.domain.NoticeInfo;
import kr.co.sosang.sosofriends.admin.domain.Productinfo;

public interface AdminService {
	


	public List<Map<String,Object>> selectUserList()throws Exception;

	public int registerItems(String name, String price, String c_code, String k_code, Map<String, Object> i_name)throws Exception;
	
	
}
