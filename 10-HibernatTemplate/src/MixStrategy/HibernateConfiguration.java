package MixStrategy;
 
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.orm.hibernate3.HibernateTemplate;

 
@Configuration
@ComponentScan
@ImportResource({"spring.xml"})
public class HibernateConfiguration {
 
   /* @Bean
    public LocalSessionFactoryBean sessionFactory()
    {
      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
      sessionFactory.setDataSource(dataSource());
      //sessionFactory.setPackagesToScan(new String[] {"model"});
      sessionFactory.setHibernateProperties(hibernateProperties());
      return sessionFactory;
    }*/
     
//    @Bean
//    public DataSource dataSource() {
// 
//    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
//		dataSource.setUsername("postgres");
//		dataSource.setPassword("123");
//        return dataSource;
//    	
//    }
     
  /*  private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.put("hibernate.hbm2ddl.auto", "create");
        properties.put("hibernate.show_sql","true");

        return properties;        
    }*/
     
	/*@Bean
	@Autowired
	public MemberDao memberDao(HibernateTemplate template)
	{
		MemberDao memberdao=new MemberDao();
		memberdao.setTemplate(template);
		return memberdao;
	}*/
   
	
	/*@Bean
	public MemberDao memberDao()
	{
		return new MemberDao();
	}*/
	
    @Bean 
    @Autowired
    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
    {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        return hibernateTemplate;
    }
    
}