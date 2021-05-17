package kr.co.sosang.sosofriends.admin.dao;

import java.util.Map;

public interface AdminDAO {

	public int getlastNum(String c_code) throws Exception;

	public int addItems(Map<String, Object> param)throws Exception;
}
