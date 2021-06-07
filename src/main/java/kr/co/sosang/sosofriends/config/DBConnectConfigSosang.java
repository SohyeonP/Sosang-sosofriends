package kr.co.sosang.sosofriends.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;


@Configuration
@PropertySource("classpath:/application.properties")
@MapperScan(basePackages = "kr.co.sosang")
public class DBConnectConfigSosang {
	
	private ApplicationContext applicationContext;
	
	@Bean
    @ConfigurationProperties(prefix = "spring.sosang.datasource")
    public DataSource sosangDataSource(){
        return DataSourceBuilder.create().build();
    }
	
	public SqlSessionFactory getSqlSessionFactory(DataSource devDataSource, ApplicationContext applicationContext) throws Exception {
	
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean(); 
		sqlSessionFactoryBean.setDataSource(devDataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/*.xml"));
		
		return sqlSessionFactoryBean.getObject();
	}
	  
	@Bean 
	public SqlSessionTemplate devSqlSessionTemplate(SqlSessionFactory devSqlSessionFactory) throws Exception{
		return new SqlSessionTemplate(devSqlSessionFactory); 
	}

	
		 
	@Bean 
	@ConfigurationProperties(prefix = "mybatis.configuration") 
	public org.apache.ibatis.session.Configuration mybatisConfig() {
		
		return new org.apache.ibatis.session.Configuration(); 
		}

	
	


}
