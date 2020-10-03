package com.autocare.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		System.out.println("SecurityConfig -> configure()");
		String userQuery="select username,password,status from MyUsers where username=?";
		String rolesQuery="select username,role from myroles where username=?";
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery(userQuery)
		.authoritiesByUsernameQuery(rolesQuery)
		.passwordEncoder(passwordEncoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		System.out.println("SecurityConfig -> configure()");
		http.authorizeRequests()
		.antMatchers("/removeStaff**" , "/allusers**").access("hasRole('ROLE_Admin')")
		.antMatchers("/removeCustomer**", "/part**", "/serviceDetails**", "/serviceNames**", "/worksheetItems**", "/addStaff**")
		.access("hasAnyRole('ROLE_Admin','ROLE_Storekeeper', 'ROLE_Staff')")
		.antMatchers("/bookService**", "/addCar**").access("hasRole('ROLE_Customer')")
		.and()
		.formLogin().loginPage("/login").failureUrl("/login?error")
		.usernameParameter("username").passwordParameter("password")
		.and()
		.logout().invalidateHttpSession(true)
		.logoutSuccessUrl("/login?logoout")
		.and()
		.exceptionHandling().accessDeniedPage("/invalidAccess")
		.and()
		.csrf()
		.and()
		.sessionManagement().enableSessionUrlRewriting(true)
		.maximumSessions(1);
	}
	
	
	  @Bean 
	  public BCryptPasswordEncoder passwordEncoder() {
		  BCryptPasswordEncoder  bCryptPasswordEncoder = new BCryptPasswordEncoder(); 
		  return bCryptPasswordEncoder; 
	  }
	 
}
