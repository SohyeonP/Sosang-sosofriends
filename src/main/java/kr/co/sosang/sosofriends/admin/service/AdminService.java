package kr.co.sosang.sosofriends.admin.service;

import java.util.Map;
import kr.co.sosang.sosofriends.admin.dto.ProductDTO;

public interface AdminService {

	public int registerItems(ProductDTO request, Map<String, Object> i_name)throws Exception;
	
	
}
