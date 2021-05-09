package kr.co.sosang.sosofriends.admin.domain;

public class Productinfo {

	private String p_price;
	private String character_code;
	private String cate_code;
	
	private String p_name;
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_price() {
		return p_price;
	}
	public void setP_price(String p_price) {
		this.p_price = p_price;
	}
	public String getCharacter_code() {
		return character_code;
	}
	public void setCharacter_code(String character_code) {
		this.character_code = character_code;
	}
	public String getCate_code() {
		return cate_code;
	}
	public void setCate_code(String cate_code) {
		this.cate_code = cate_code;
	}
}
