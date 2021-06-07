package kr.co.sosang.sosofriends.admin.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.sosang.sosofriends.admin.dao.AdminDAO;
import kr.co.sosang.sosofriends.admin.domain.Productinfo;
import kr.co.sosang.sosofriends.utils.Utils;

@Service("adminservice")
public class AdminServiceImpl implements AdminService {

	@Resource(name = "admindao")
	private AdminDAO admindao;
	
	public int registerItems(Productinfo request, Map<String, Object> i_name) throws Exception {

		Map<String,Object> param = new HashMap();
		int lastnum = 1;// 기본값 0 최근값은 가져와야함
		
		System.out.println("");
		
		String c_code= Utils.chkNull(request.getKpi_code());
		String k_code =Utils.chkNull(request.getKpi_cate_k());
		
		
		String productnum ="";
		
		param.put("name", Utils.chkNull(request.getKpi_name()));
		param.put("price",Utils.chkNull(request.getKpi_price()));
		
		
		String num = Integer.toString(admindao.getlastNum(c_code)+1);
		
		productnum += String.format(c_code,Utils.stringNumberToZeroStringNumber(num, 4));
		productnum += k_code;
		productnum += Utils.formatStrDay1();
		// 캐릭터 코드 +  최근 
		param.put("pdtnum", productnum);
		param.put("code", c_code);
		param.put("img", i_name.get("saveFileName"));
		
		int resultset = admindao.addItems(param);
		
		if(resultset != 0) {
			 lastnum = resultset;
		}
		
		// 가장 최근 등록 번호 가져오기 
		
		productnum += Utils.getPastTimeH();
		String.format("CMP%s", Utils.stringNumberToZeroStringNumber(String.valueOf(lastnum), 4));
		
		return 0;
	}

	public List<Map<String,Object>> selectUserList()throws Exception{
		return admindao.selectUserList();
	}

}
