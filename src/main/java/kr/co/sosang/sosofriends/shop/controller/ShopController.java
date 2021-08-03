package kr.co.sosang.sosofriends.shop.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RestController;

import kr.co.sosang.sosofriends.shop.domain.OrderInfo;
import kr.co.sosang.sosofriends.shop.domain.ShopBagInfo;
import kr.co.sosang.sosofriends.shop.service.ShopService;
import kr.co.sosang.sosofriends.utils.CommonMsg;
import kr.co.sosang.sosofriends.utils.Utils;



@RestController
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@Resource(name="shopservice")
	private ShopService shopservice;
	
	private CommonMsg cms = new CommonMsg();

	/*장바구니 추가 하기*/
	@RequestMapping(value="/addbags",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> AddBags(@RequestBody ShopBagInfo request){
		
		Map<String,Object> paramMap = new HashMap();
		try {
			
			int result1 = shopservice.existUserBag(request.getUseremail());
			
				paramMap.put("email",request.getUseremail());
				paramMap.put("pdtname",request.getProduct_name());
				paramMap.put("pdtprice",request.getProduct_price());
				paramMap.put("pdtcnt", request.getProduct_cnt());
				paramMap.put("pdtnum", request.getProduct_num());
			
			if(result1 !=0) {
				int result = shopservice.Updatebags(paramMap);
				if(result !=0) {
					return  Utils.responseentity(cms.getMessage(200, "장바구니 등록에 성공하였습니다",  true));
				}else {
					return  Utils.responseentity(cms.getMessage(401, "장바구니 등록에 실패하였습니다.", false));
					
				}
			}else {
				int result = shopservice.Addbags(paramMap);
					if(result !=0) {
						return  Utils.responseentity(cms.getMessage(200, "장바구니 등록에 성공하였습니다",  true));
					}else {
						return  Utils.responseentity(cms.getMessage(401, "장바구니 등록에 실패하였습니다.", false));
					}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  Utils.responseentity(cms.getMessage(401, "장바구니 등록에 실패하였습니다.", false));
	}

	/*장바구니 내역 확인*/
	@RequestMapping(value="/bagslist",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> getBagsList(@RequestBody ShopBagInfo request){
		
		/*제품 정보와 같이 묶어서 이미지 나타나게 하기*/
		String email = Utils.chkNull(request.getUseremail());
		try {
			List<Map<String,Object>> resultList = shopservice.getBagList(email);
			
			
			return Utils.responseentity(cms.getRsultListVlues(200, "Success!!", true, resultList));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  Utils.responseentity(cms.getMessage(401, "장바구니 목록조회에 실패하였습니다.", false));
	}
	
	@RequestMapping(value="/order",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> OrderRegister(@RequestBody OrderInfo request){
		
		Map<String,Object> paramMap = new HashMap();
		Map<String,Object> paramMap1 =new HashMap(); 
		int totalprice=0;
		try {
				
			List<Map<String,Object>> resultList = shopservice.getBagList(request.getUseremail());
			
			
			Map<String,Object> test= new HashMap();
			
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@"+resultList);
			if(resultList !=null) {
				paramMap.put("useremail", resultList.get(0).get("").toString());
				paramMap.put("kfs_pdtname", resultList.get(0).get("").toString());
				paramMap.put("kfs_pdtprice", resultList.get(0).get("").toString());
				paramMap.put("kfs_pdtnum", resultList.get(0).get("").toString());
				paramMap.put("kfs_pdtcnt", resultList.get(0).get("").toString());
				
				
				/* String i = Integer.toString(totalprice); */
					paramMap.put("useremail",request.getUseremail());
					paramMap.put("orderaddress",request.getOrder_address());
					paramMap.put("ordernum",Utils.getRandomChar());
					paramMap.put("orderprice",request.getKfs_pay());
					paramMap.put("orderdate", Utils.getPastTimeS());
				
				
				int resultset = shopservice.RegisterOrder(paramMap);
				if(resultset !=0) {
					 
					
					/* int rsultdel = shopservice.delShopbag(request.getUseremail()); */
					return  Utils.responseentity(cms.getMessage(200, "주문이 완료되었습니다", true));
					 
				}else {
					return  Utils.responseentity(cms.getMessage(401, "주문배송 등록에 실패하였습니다.", false));
				}						
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return  Utils.responseentity(cms.getMessage(401, "주문배송 조회에 실패하였습니다.", false));
		
	}
	

	@RequestMapping(value="/productall",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> getAllProductList(){
		
		try {	
			List<Map<String,Object>> resultList = shopservice.getAllProductList();
			
			return Utils.responseentity(cms.getRsultListVlues(200, "Success!!", true, resultList));
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  Utils.responseentity(cms.getMessage(401, "주문배송 등록에 실패하였습니다.", false));
	}
	
	@RequestMapping(value="/productone",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> getOneProductList(@RequestParam(value="pdtnum",required =true)String pdtnum){
		
		try {	
			List<Map<String,Object>> resultList = shopservice.getOneProductList(pdtnum);
			
			
			return Utils.responseentity(cms.getRsultListVlues(200, "Success!!", true, resultList));
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  Utils.responseentity(cms.getMessage(401, "주문배송 등록에 실패하였습니다.", false));
	}
	
	@RequestMapping(value="/orderlist",method= {RequestMethod.GET,RequestMethod.POST})
	public ResponseEntity<String> getOrderList(@RequestBody OrderInfo request){
		
		try {	
			List<Map<String,Object>> resultList = shopservice.getOrderList(request.getUseremail());
			
			return Utils.responseentity(cms.getRsultListVlues(200, "Success!!", true, resultList));
				
		}catch(Exception e) {
			return  Utils.responseentity(cms.getMessage(401, "주문배송 등록에 실패하였습니다.", false));
		}
	}
}
