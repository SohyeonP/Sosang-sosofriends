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
	
	@Override
	public List<Map<String, Object>> getBagList(String email)throws Exception{
		return devSession.selectList(namespace+"getBagList",email);
	}
	@Override
	public int existUserBag(String useremail)throws Exception{
		return devSession.selectOne(namespace+"existUserBag",useremail);
	}
	@Override
	public int Addbbags(Map<String, Object> paramMap)throws Exception{
		return devSession.update(namespace+"Addbbags",paramMap);
	}
	@Override
	public int Updatebags(Map<String, Object> paramMap)throws Exception{
		return devSession.update(namespace+"Updatebags",paramMap);
	}
	@Override
	public int RegisterOrder(Map<String, Object> paramMap)throws Exception{
		return devSession.update(namespace+"RegisterOrder",paramMap);
	}
	@Override
	public List<Map<String, Object>> getOrderList(String email)throws Exception{
		return devSession.selectList(namespace+"getOrderList",email);
	}
	@Override
	public int delShopbag(String useremail)throws Exception{
		return devSession.selectOne(namespace+"delShopbag", useremail);
	}
	@Override
	public List<Map<String, Object>> getAllProductList()throws Exception{
		return devSession.selectList(namespace+"getAllProductList");
	};
	
	@Override
	public List<Map<String, Object>> getOneProductList(String pdtnum)throws Exception{
		return devSession.selectList(namespace+"getOneProductList",pdtnum);
	}

}
