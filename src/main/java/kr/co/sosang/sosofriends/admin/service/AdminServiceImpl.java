package kr.co.sosang.sosofriends.admin.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sosang.sosofriends.admin.dao.AdminDAO;
import kr.co.sosang.sosofriends.utils.Utils;

@Service("adminservice")
public class AdminServiceImpl implements AdminService {

	@Resource(name = "admindao")
	private AdminDAO admindao;
	
	public int registerItems(String name, String price, String c_code, String k_code, Map<String, Object> i_name)throws Exception{

		Map<String,Object> param = new HashMap();
		int lastnum = 1;// 기본값 0 최근값은 가져와야함
		
		System.out.println("");
		
		
		String productnum ="";
		
		param.put("name", Utils.chkNull(name));
		param.put("price",Utils.chkNull(price));
		String code = k_code.substring(0,1);
		String num = Integer.toString(admindao.getlastNum(code)+1);
		productnum +=code;
		productnum += Utils.stringNumberToZeroStringNumber(num, 4);
		productnum += c_code.substring(0,1);
		productnum += Utils.getPastTimeH();
		// 캐릭터 코드 +  최근 
		param.put("pdtnum", productnum);
		param.put("code", code);
		param.put("img", i_name.get("saveFileName"));
		
		
		int resultset = admindao.addItems(param);
		
		if(resultset != 0) {
			return resultset;
		}else {
			return 0;
		}
		
	
	}

	public List<Map<String,Object>> selectUserList()throws Exception{
		return admindao.selectUserList();
	}

}
