package kr.co.sosang.sosofriends.admin.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<NoticeInfo, Long> {
	
	List<NoticeInfo> findAll();
}
