package kr.co.sosang.sosofriends.shop.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sosang.sosofriends.shop.dao.ShopDAO;

@Service("shopservice")
public class ShopServiceImpl implements ShopService{
	
	@Resource(name ="shopdao")
	private ShopDAO shopdao;
	
	public List<Map<String, Object>> getBagList(String email)throws Exception{
		return shopdao.getBagList(email);
	}

	public int existUserBag(String useremail)throws Exception{
		return shopdao.existUserBag(useremail);
	}

	public int Addbags(Map<String, Object> paramMap)throws Exception{
		return shopdao.Addbbags(paramMap);}

	public int Updatebags(Map<String, Object> paramMap)throws Exception{
		return shopdao.Updatebags(paramMap);
	}
	
	public int RegisterOrder(Map<String,Object> paramMap)throws Exception{
		return shopdao.RegisterOrder(paramMap);
	}
	public List<Map<String, Object>> getOrderList(String useremail)throws Exception{
		return shopdao.getOrderList(useremail);
	}
	
	public int delShopbag(String useremail)throws Exception{
		return shopdao.delShopbag(useremail);
	}
	
	public List<Map<String, Object>> getAllProductList() throws Exception{
		return shopdao.getAllProductList();
	}
	
	public List<Map<String, Object>> getOneProductList(String pdtnum)throws Exception{
		return shopdao.getOneProductList(pdtnum);
	}
	
}
