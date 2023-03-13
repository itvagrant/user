package com.example.user.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration(proxyBeanMethods = false)
//@EnableWebSecurity
public class SecurityConfig {

//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
////        http.authorizeHttpRequests()
////                .requestMatchers("/admin/**").hasRole("ADMIN")
////                .requestMatchers("/user/**").hasAnyRole("ADMIN","USER")
////                .anyRequest().authenticated()
////                .and()
////                .formLogin()
////                .and()
////                .httpBasic();
//        http.authorizeHttpRequests().anyRequest().permitAll();
//        return http.build();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
////        auth.inMemoryAuthentication()
////                .withUser("user").password("{noop}password").roles("USER")
////                .and()
////                .withUser("admin").password("{noop}password").roles("ADMIN");
//    }
}
