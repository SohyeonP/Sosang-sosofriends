package kr.co.sosang.sosofriends.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
public class DBConnectConfigSosang {
	
	private ApplicationContext applicationContext;
	
    @Bean
    @ConfigurationProperties("spring.sosang.datasource")
    public DataSource sosangDataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean
    public SqlSessionFactory sosangSqlSessionFactory(DataSource devDataSource, ApplicationContext applicationContext) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(devDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:/mapper/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    SqlSessionTemplate sosangSqlSessionFactory(SqlSessionFactory sosangsqlSessionFactory) throws Exception{
        return new SqlSessionTemplate(sosangsqlSessionFactory);

    }

    @Bean
    public PlatformTransactionManager sosangTransctionManger(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }
    
    @Bean 
	@ConfigurationProperties(prefix = "mybatis.configuration") 
	public org.apache.ibatis.session.Configuration mybatisConfig() {

		return new org.apache.ibatis.session.Configuration(); 
		}

	


}
