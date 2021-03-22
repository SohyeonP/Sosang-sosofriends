package kr.co.sosang.sosofriends.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.mybatis.spring.annotation.MapperScan;
import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;

@Slf4j
@Configuration
@PropertySource("classpath:/application.properties")
public class DatabaseConfiguration {

    private ApplicationContext applicationContext;

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.hikari")
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    public DataSource getDataSource() throws Exception{
        return  new HikariDataSource(new HikariConfig());
    }
    public SqlSessionFactory getSqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        sqlSessionFactoryBean.setDataSource(getDataSource());
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResource("classpath:/mapper/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("kr.co.sosang.sosofriends.domain");
        return sqlSessionFactoryBean.getObject();

    }
    public SqlSessionTemplate getSqlSessionTemplate() throws Exception{
        return new SqlSessionTemplate(getSqlSessionFactory());
    }

    @Bean
    @ConfigurationProperties(prefix = "mybatis.configuration")
    public org.apache.ibatis.session.Configuration mybatisConfig(){
        return new org.apache.ibatis.session.Configuration();
    }

}
