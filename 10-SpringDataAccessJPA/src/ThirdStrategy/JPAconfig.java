package ThirdStrategy;

//// with ExceptionHandlingConfiguration
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan
@EnableTransactionManagement
public class JPAconfig {

	@Bean
    public DataSource dataSource() 
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("123");
        return dataSource;
    }
	
	private Properties HibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.put("hibernate.show_sql","true");
        return hibernateProperties;
    }
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = 
            new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("ThirdStrategy");
        factoryBean.setJpaProperties(HibernateProperties());
        return factoryBean;
    }

	
    @Bean
    @Autowired
    public PlatformTransactionManager transactionManager(
        EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }

   
    
    @Bean
    public Member member()
    {
    	return new Member();
    }
    
    
    
	/*@Bean
	public MemberDaoJpaImpl memberDao() {
		MemberDao dao = new MemberDaoJpaImpl();
		return dao;
	}*/
	
    
    /*@Bean
    public MemberDao memberDao() {
        MemberDaoJpaImpl bean = new MemberDaoJpaImpl();
        return bean;
    }*/
    
   /* @Bean
    /// inject dependency of memberdao here 
    public MemberService memberService() {
        MemberServiceImpl bean = new MemberServiceImpl();
        //bean.setMemberDao(memberDao());
        return bean;
    }*/
}
