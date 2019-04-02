package com.chenpeixin.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override//过滤时机
    public String filterType() {
        /*
        *   pre：路由之前
        *   routing：路由之时
        *   post： 路由之后
        *   error：发送错误调用
        * */
        return "pre";
    }

    @Override//过滤的顺序
    public int filterOrder() {
        return 0;
    }

    @Override//是否进行过滤
    public boolean shouldFilter() {
        return true;
    }

    @Override//过滤筛选，可以通过sql或者nosql进行权限查询
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("{} >>>> {}",request.getMethod(),request.getRequestURL().toString());
        String token = request.getParameter("token");
        if(token == null){
            log.warn("token is empty");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {}
            return null;
        }
        log.info("ok");
        return null;
    }
}
