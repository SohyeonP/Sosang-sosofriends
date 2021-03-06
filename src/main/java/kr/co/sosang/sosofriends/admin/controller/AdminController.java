package kr.co.sosang.sosofriends.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sosang.sosofriends.admin.domain.Productinfo;
import kr.co.sosang.sosofriends.admin.service.AdminService;
import kr.co.sosang.sosofriends.utils.CommonMsg;
import kr.co.sosang.sosofriends.utils.FileUpload;
import kr.co.sosang.sosofriends.utils.Utils;

@RestController
@SuppressWarnings("unchecked")
@RequestMapping("/admin")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Resource(name = "adminservice")
	private AdminService adminservice;

	
	public CommonMsg cms = new CommonMsg();

	@RequestMapping(value="/additems/register",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> AddProduct(
		@RequestParam(value="p_name",required =true)String name,
		@RequestParam(value="p_price",required =true)String price,
		@RequestParam(value="p_ccode",required =true)String c_code,
		@RequestParam(value="p_kcode",required =true)String k_code,
		@RequestPart(value="file", required = false) MultipartFile file){
		/* 상품 아이디, 상품 코드, 상품 가격, 상품 하트 횟수,상품 판매 카운트, 상품 등록일 
		 상품명을 만들고 상품을 등록한다 */
	
		
		
		FileUpload upload = new FileUpload();
		Map<String,Object> paramMap = new HashMap();
		try {
			
			Map<String,Object> i_name = upload.setFileUpload(file);
			
			
			int  resultset = adminservice.registerItems(name,price,c_code,k_code,i_name);
			
			if(resultset !=0) {
				return  Utils.responseentity(cms.getMessage(200, "아이템"+name+" 등록 성공", true));
			}else {
				return  Utils.responseentity(cms.getMessage(200, "아이템"+name+" 등록 성공", true));
				/*
				 * return Utils.responseentity(cms.getMessage(401, "아이템 등록에 실패하였습니다", false));
				 */
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  Utils.responseentity(cms.getMessage(200, "아이템"+name+" 등록 성공", true));
	}

	public String createProductNum(String catenum, String catecode) {

		String cate = catenum;
		Map<String, Object> paramMap = new HashMap();

		paramMap.put("catenum", catenum);
		String pronum;

		return null;
	}

	@RequestMapping(value = "/noticelist", method = { RequestMethod.GET, RequestMethod.POST })
	public ResponseEntity<String> getNotice() {
		
			
		try {
			List<Map<String, Object>> resultList = adminservice.selectUserList();
			
			return Utils.responseentity(cms.getRsultListVlues(200, "Success!!", true, resultList));
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return  Utils.responseentity(cms.getMessage(401, "공지사항 목록 불러오기 실패", false));
	}
}
