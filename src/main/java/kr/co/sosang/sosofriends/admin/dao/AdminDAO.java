package kr.co.sosang.sosofriends.admin.dao;

import java.util.List;
import java.util.Map;

import kr.co.sosang.sosofriends.admin.domain.NoticeInfo;

public interface AdminDAO {

	public int getlastNum(String c_code) throws Exception;

	public int addItems(Map<String, Object> param)throws Exception;

	public List<NoticeInfo> selectUserList()throws Exception;
}
