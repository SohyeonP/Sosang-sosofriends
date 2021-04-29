package kr.co.sosang.sosofriends.admin.controller;


import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.co.sosang.sosofriends.admin.domain.Productinfo;
import kr.co.sosang.sosofriends.utils.Utils;

@RestController
@SuppressWarnings("unchecked")
public class AdminController {
		
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	  
	@RequestMapping(value="/admin/addpd",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> AddProduct(@RequestBody Productinfo request){
		/* 상품 아이디, 상품 코드, 상품 가격, 상품 하트 횟수,상품 판매 카운트, 상품 등록일 */
		
		HashMap param = new HashMap();
		
		String c_code= Utils.chkNull(request.getCate_code());
		String k_code =Utils.chkNull(request.getCharacter_code());
		param.put("name", Utils.chkNull(request.getP_name()));
		param.put("price",Utils.chkNull(request.getP_price()));
		
		return null;
	}
	
	public String createProductNum(String catenum,String catecode) {
		
		String cate= catenum;
		
		String pronum;
		
		return null;
	}
}
