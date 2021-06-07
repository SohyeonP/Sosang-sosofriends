package kr.co.sosang.sosofriends.shop.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("shopdao")
public class ShopDAOImpl implements ShopDAO {
	
	@Autowired
	@Qualifier("devSqlSessionTemplate")
    private SqlSession devSession;
	
	private String  namespace = "kr.co.sosang.mapper.shopmapper.";
	
	public List<Map<String, Object>> getBagList(String email)throws Exception{
		return devSession.selectList(namespace+"getBagList");
	}

	public int existUserBag(String useremail)throws Exception{
		return devSession.selectOne(namespace+"existUserBag",useremail);
	}

	public int Addbbags(Map<String, Object> paramMap)throws Exception{
		return devSession.update(namespace+"Addbbags",paramMap);
	}

	public int Updatebags(Map<String, Object> paramMap)throws Exception{
		return devSession.update(namespace+"Updatebags",paramMap);
	}
	
	public int RegisterOrder(Map<String, Object> paramMap)throws Exception{
		return devSession.update(namespace+"RegisterOrder",paramMap);
	}
	

}
