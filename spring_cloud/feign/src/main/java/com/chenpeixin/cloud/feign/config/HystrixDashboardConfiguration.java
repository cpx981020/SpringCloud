package com.chenpeixin.cloud.feign.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class HystrixDashboardConfiguration {

    @Bean
    public ServletRegistrationBean getServlet(){
        //servlet需要的web.xml配置但是spring boot里面没有web.xml，所以通过servletRegistrationBean进行配置
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean servletServletRegistrationBean = new ServletRegistrationBean(streamServlet);
        servletServletRegistrationBean.setLoadOnStartup(1);
        //访问熔断器仪表盘:localhost:port/hystrix
        //监控：localhost:port/hystrix.stream(title和时间监控可以自己设置)
        servletServletRegistrationBean.addUrlMappings("/hystrix.stream");
        servletServletRegistrationBean.setName("HystrixMetricsStreamServlet");
        return servletServletRegistrationBean;
    }
}
