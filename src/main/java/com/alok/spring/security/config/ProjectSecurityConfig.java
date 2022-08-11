package com.alok.spring.security.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Slf4j
public class ProjectSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.debug("Using default configure(HttpSecurity). "
                + "If subclassed this will potentially override subclass configure(HttpSecurity).");
        http
                .authorizeRequests()
                .antMatchers("/myAccount").authenticated()
                .antMatchers("/myBalance").authenticated()
                .antMatchers("/myLoans").authenticated()
                .antMatchers("/myCards").authenticated()
                .antMatchers("/notices").permitAll()
                .antMatchers("/contact").permitAll()
                .antMatchers("/user").authenticated()
                                        .and()
                .formLogin()
                .and()
                .httpBasic();
        // denyingAll Services
        /*http
                .authorizeRequests().anyRequest()
                .denyAll()
                .and()
                .formLogin()
                .and().httpBasic(); */
// permitting All  Services
        http
                .authorizeRequests().anyRequest().permitAll()
                .and().formLogin().and().httpBasic();
    }

   /* @Override
   public void configure(AuthenticationManagerBuilder auth) throws Exception{
        //Using inMemoryAuthentication
       /* auth.inMemoryAuthentication().withUser("admin").password("12345").authorities("ADMIN")
                .and()
                .withUser("user").password("12345").authorities("read")
                .and()
                .passwordEncoder(NoOpPasswordEncoder.getInstance()); */

        // Using inMemoryUserDetailsManager
        /*InMemoryUserDetailsManager userDetailsManager= new InMemoryUserDetailsManager();
        UserDetails adminUser = User.withUsername("admin").password("12345").authorities("ADMIN").build();
        UserDetails user = User.withUsername("user").password("12345").authorities("read").build();
        userDetailsManager.createUser(adminUser);
        userDetailsManager.createUser(user);
        auth.userDetailsService(userDetailsManager);
    } */

//    @Bean
//public UserDetailsService userDetailsService(DataSource dataSource){
//    return new JdbcUserDetailsManager(dataSource);
//}

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
