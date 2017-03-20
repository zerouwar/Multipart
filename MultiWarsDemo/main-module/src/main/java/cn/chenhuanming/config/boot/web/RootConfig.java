package cn.chenhuanming.config.boot.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * Created by Administrator on 2016/9/10.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"cn.chenhuanming.*"})
public class RootConfig {

    @Bean
    ViewResolver viewResolver(){
        ViewResolver resolver = new InternalResourceViewResolver("/WEB-INF/views/",".html");
        return resolver;
    }
}
