package kr.co.sosang.sosofriends.admin.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@Entity
@Table(name="kfs_notice")
public class NoticeInfo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	private String contents;
	private Date reg_date;
	
	@Builder
	public NoticeInfo(String title,String contents,String reg_date) {
		this.title = title;
		this.contents = contents;
	}
	
	@PrePersist
	void registerAt(Date reg_date) {
		this.reg_date = new Date(); 
	}
}
