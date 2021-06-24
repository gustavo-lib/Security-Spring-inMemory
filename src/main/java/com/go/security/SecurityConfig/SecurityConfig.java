package com.go.security.SecurityConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// {noop} => No operation for password encoder (no password encoding needed)
		auth.inMemoryAuthentication().withUser("adm").password("{noop}adm").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("emp").password("{noop}emp").authorities("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("man").password("{noop}man").authorities("MANAGER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// declares which Page(URL) will have What access type
		http.authorizeRequests().
		antMatchers("/home").permitAll().
		antMatchers("/welcome").authenticated().
		antMatchers("/admin").hasAuthority("ADMIN").
		antMatchers("/emp").hasAuthority("EMPLOYEE").
	    antMatchers("/mgr").hasAuthority("MANAGER").
	    antMatchers("/common").hasAnyAuthority("EMPLOYEE", "MANAGER")
		// Any other URLs which are not configured in above antMatchers
		// generally declared aunthenticated() in real time
		.anyRequest().authenticated()
		// Login Form Details
		.and().formLogin().defaultSuccessUrl("/welcome", true)
		// Logout Form Details
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		// Exception Details
		.and().exceptionHandling().accessDeniedPage("/accessDenied");
	}
}