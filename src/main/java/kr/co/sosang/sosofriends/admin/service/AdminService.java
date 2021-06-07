package kr.co.sosang.sosofriends.admin.service;

import java.util.List;
import java.util.Map;

import kr.co.sosang.sosofriends.admin.domain.NoticeInfo;
import kr.co.sosang.sosofriends.admin.domain.Productinfo;

public interface AdminService {
	

	public int registerItems(Productinfo request,Map<String, Object> i_name)throws Exception;

	public List<Map<String,Object>> selectUserList()throws Exception;
	
	
}
