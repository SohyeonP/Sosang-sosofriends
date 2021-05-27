package kr.co.sosang.sosofriends.admin.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {

	private Long kpi_idx;
	private String kpi_code;
	private String kpi_name;
	private String kpi_price;
	
	@Builder
	public ProductDTO(String kpi_code,String kpi_name,String kpi_price) {
		this.kpi_code = kpi_code;
		this.kpi_name = kpi_name;
		this.kpi_price = kpi_price;
	}
}
