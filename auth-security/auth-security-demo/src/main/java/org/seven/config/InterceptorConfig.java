package org.seven.config;

import org.seven.web.interceptor.TraceInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Seven.Lin
 * @date 2020/1/8 18:17
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration reg = registry.addInterceptor(new TraceInterceptor());
        reg.addPathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
