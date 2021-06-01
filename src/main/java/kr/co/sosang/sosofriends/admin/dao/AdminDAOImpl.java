package kr.co.sosang.sosofriends.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import kr.co.sosang.sosofriends.admin.domain.NoticeInfo;

@Repository("admindao")
public class AdminDAOImpl implements AdminDAO{
	
	
    @Qualifier("devSqlSessionTemplate") 
    private SqlSession devSession;
	
	private String  namespace = "kr.co.sosang.mapper.adminmapper.";
	
	public int getlastNum(String c_code) throws Exception{
		return devSession.selectOne(namespace+"getlastNum",c_code); 
	}
	
	public int addItems(Map<String, Object> param)throws Exception{
		 return devSession.update(namespace+"addItems"); 
	}
	
	public List<NoticeInfo> selectUserList()throws Exception{
		return devSession.selectList(namespace+"selectUserList");
	}
}
