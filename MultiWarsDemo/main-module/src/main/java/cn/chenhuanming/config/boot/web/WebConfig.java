package cn.chenhuanming.config.boot.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by Administrator on 2016/8/13.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{

    /**
     * spring mvc不对静态资源进行拦截
     * @param configurer DefaultServletHandlerConfigurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /**
     * spring 拦截器注册
     * @param registry InterceptorRegistry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    }

    /**
     * 配置spring文件解析器
     * @return MultipartResolver
     */
    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }

}
