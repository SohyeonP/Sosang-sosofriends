package kr.co.sosang.sosofriends.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

	 @Override
	protected void configure(HttpSecurity http) throws Exception{
	
	    http.cors().and().csrf().disable();
	    http    .authorizeRequests()
	            .antMatchers("/login").authenticated().antMatchers("/**").permitAll()
	            .antMatchers("/**").permitAll()
	            .antMatchers(HttpMethod.GET, "/css/**", "/js/**","img/main/**").permitAll()
	            .and().authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
	            .and().anonymous().authorities("ROLE_ANONYMOUS").and().authorizeRequests();
	    http   .httpBasic().disable()	
	            .anonymous().authorities("ROLE_ANONYMOUS")
	            .and().httpBasic().disable();
	}




}
