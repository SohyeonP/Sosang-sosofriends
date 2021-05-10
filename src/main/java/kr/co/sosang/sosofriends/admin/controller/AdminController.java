package kr.co.sosang.sosofriends.admin.controller;


import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sosang.sosofriends.admin.domain.Productinfo;
import kr.co.sosang.sosofriends.utils.FileUpload;
import kr.co.sosang.sosofriends.utils.Utils;

@RestController
@SuppressWarnings("unchecked")
public class AdminController {
		
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	
	@RequestMapping(value="/additems.do",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> AddProduct(@RequestBody Productinfo request,@RequestPart(value="file", required = false) MultipartFile file){
		/* 상품 아이디, 상품 코드, 상품 가격, 상품 하트 횟수,상품 판매 카운트, 상품 등록일 */
		/* 상품명을 만들고 상품을 등록한다 */
		HashMap param = new HashMap();
		String lastnum= "0";// 기본값 0 최근값은 가져와야함
		String c_code= Utils.chkNull(request.getCate_code());
		String k_code =Utils.chkNull(request.getCharacter_code());
		
		
		FileUpload upload = new FileUpload();
		
		try {
			
			upload.setFileUpload(file);
			
			param.put("name", Utils.chkNull(request.getP_name()));
			param.put("price",Utils.chkNull(request.getP_price()));
			String productnum ="";
			
			
			// 가장 최근 등록 번호 가져오기 
			productnum += String.format(c_code,Utils.stringNumberToZeroStringNumber(lastnum, 4));
			productnum += k_code;
			productnum += Utils.getPastTimeH();
			/*String.format("CMP%s", Utils.stringNumberToZeroStringNumber(String.valueOf(lastcode), 4));*/
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String createProductNum(String catenum,String catecode) {
		
		String cate= catenum;
		Map<String,Object> paramMap = new HashMap();

		paramMap.put("catenum",catenum);
		String pronum;
		
		return null;
	}
}
