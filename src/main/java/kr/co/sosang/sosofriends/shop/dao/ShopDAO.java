package kr.co.sosang.sosofriends.shop.dao;

import java.util.List;
import java.util.Map;

public interface ShopDAO {

	public List<Map<String, Object>> getBagList(String email)throws Exception;

	public int existUserBag(String useremail)throws Exception;

	public int Addbbags(Map<String, Object> paramMap)throws Exception;

	public int Updatebags(Map<String, Object> paramMap)throws Exception;

	public int RegisterOrder(Map<String, Object> paramMap)throws Exception;

	public List<Map<String, Object>> getOrderList(String useremail)throws Exception;

	public int delShopbag(String useremail)throws Exception;

	public List<Map<String, Object>> getAllProductList()throws Exception;

	public List<Map<String, Object>> getOneProductList(String pdtnum)throws Exception;


}
