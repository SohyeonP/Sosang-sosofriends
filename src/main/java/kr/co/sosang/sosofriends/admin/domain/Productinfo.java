package kr.co.sosang.sosofriends.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name="kfs_product_info")
public class Productinfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long kpi_idx;
	
	@Column(length = 100, nullable = false)
	private String kpi_code;
	
	@Column(length = 100, nullable = false)
	private String kpi_price;
	
	@Column(length = 100, nullable = true)
	private String kpi_hit;
	
	@Column(length = 100, nullable = false)
	private String reg_date;	
	
	@Column(length = 100, nullable = false)
	private String kpi_cate_k;
	
	@Column(length = 100, nullable = false)
	private String kpi_name;
	
	
	
	@Builder
	public Productinfo(String kpi_code,String kpi_price,String kpi_hit,String reg_date,String kpi_cate_k,String kpi_name) {
		this.kpi_code = kpi_code;
		this.kpi_hit = kpi_hit;
		this.kpi_price = kpi_price;
		this.reg_date = reg_date;
		this.kpi_cate_k = kpi_cate_k;
		this.kpi_name = kpi_name;
	}
}
