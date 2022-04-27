package net.xdclass.online.config;

import net.xdclass.online.interceptor.CorsInterceptor;
import net.xdclass.online.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: online
 * @description: 拦截器
 * @packagename: net.xdclass.online.config
 * @author: 姚泽宇
 * @date: 2022-04-27 10:18
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Bean
    LoginInterceptor loginInterceptor() {
        return new LoginInterceptor();
    }
    CorsInterceptor corsInterceptor() {return  new CorsInterceptor();}
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(corsInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/api/v1/pri/*/*/**").excludePathPatterns("/api/v1/pri/user/login", "/api/v1/pri/user/register");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
