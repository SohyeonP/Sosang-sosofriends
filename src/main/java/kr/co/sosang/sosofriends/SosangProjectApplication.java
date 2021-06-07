package kr.co.sosang.sosofriends;



import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import kr.co.sosang.sosofriends.admin.domain.NoticeInfo;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SosangProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SosangProjectApplication.class, args);
	}
	
	
}
