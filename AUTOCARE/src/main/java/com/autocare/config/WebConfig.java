package com.autocare.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.autocare.security.SecurityConfig;

@Configuration
@EnableWebMvc
@Import({ SecurityConfig.class })
@ComponentScan({ "com.autocare.*" })
@EnableTransactionManagement
public class WebConfig {
	/*
	 * @Bean public InternalResourceViewResolver viewResolver() {
	 * InternalResourceViewResolver viewResolver = new
	 * InternalResourceViewResolver(); viewResolver.setViewClass(JstlView.class);
	 * viewResolver.setPrefix("/WEB-INF/myjsps/"); viewResolver.setSuffix(".jsp");
	 * return viewResolver; }
	 */
	@Bean(name = "DataSource")
	public DataSource mySqlDS() {
		System.out.println("WebConfig -> mySqlDS()");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:8080/autocare");
		ds.setUsername("root");
		ds.setPassword("Abhinav.1");
		return ds;
	}

	@Bean(name = "SessionFactory")
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
		System.out.println("WebConfig -> sessionFactory()");
		LocalSessionFactoryBean lsFactory = new LocalSessionFactoryBean();
		lsFactory.setDataSource(dataSource);

		Properties props = new Properties();
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.format_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

		lsFactory.setHibernateProperties(props);
		lsFactory.setPackagesToScan("com.autocare.entity");
		return lsFactory;
	}

	@Bean(name = "TransactionManager")
	public PlatformTransactionManager transactionManager(SessionFactory sessionFactory) {
		System.out.println("WebConfig -> transactionManager()");
		return new HibernateTransactionManager(sessionFactory);
	}

	@Bean(name = "HibernateTemplate")
	public HibernateTemplate hibernateTemplate(SessionFactory sessionFactory) {
		System.out.println("WebConfig -> hibernateTemplate()");
		return new HibernateTemplate(sessionFactory);
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		System.out.println("WebConfig -> jdbcTemplate()");
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public TilesViewResolver tilesViewResolver() {
		System.out.println("WebConfig -> tilesViewResolver()");
		TilesViewResolver viewResolver = new TilesViewResolver();
		return viewResolver;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		System.out.println("WebConfig -> tilesConfigurer()");
		TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions("WEB-INF/myjsps/tiles.xml");
		return configurer;
	}

	/*
	 * @Bean public JavaMailSender javaMailSenderImpl() { JavaMailSenderImpl
	 * mailSender=new JavaMailSenderImpl(); // mailSender.setHost("smtp.gmail.com");
	 * mailSender.setPort(465); mailSender.setProtocol("smtp");
	 * 
	 * mailSender.setUsername("mamtakumari18dec@gmail.com");
	 * mailSender.setPassword("7492050868");
	 * 
	 * Properties props=mailSender.getJavaMailProperties();
	 * props.put("mail.smtp.host", "smtp.gmail.com");
	 * props.put("mail.smtp.socketFactory.port", "465");
	 * props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	 * props.put("mail.smtp.auth", "true"); props.put("mail.smtp.startssl.enable",
	 * "true"); // props.put("mail.smtp.starttls.enable", "true"); //
	 * props.put("mail.debug", "true"); return mailSender; }
	 */
}
