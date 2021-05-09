package kr.co.sosang.sosofriends;

import kr.co.sosang.sosofriends.config.WebSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(exclude = { WebSecurityConfig.class })
public class SosangProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SosangProjectApplication.class, args);
	}

}
