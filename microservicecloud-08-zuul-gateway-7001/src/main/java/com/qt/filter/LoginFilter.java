package com.qt.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LoginFilter extends ZuulFilter {


    /**
     * filterType:返回字符串代表过滤器的类型，返回值有:
     * pre:在请求路由之前执行
     * route:在请求路由时调用
     * post:请求路由之后调用， 也就是在route和errror过滤器之后调用
     * error:处理请求发生错误时调用
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0; //filterOrder:此方法返回整型数值，通过此数值来定义过滤器的执行顺序，数字越小优先级越高。
    }

    @Override
    public boolean shouldFilter() {
        return true;//shouldFilter:返回Boolean值，判断该过滤器是否执行。返回true表示要执行此过虑器，false不执行
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if (token == null) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(200);
            try {
                context.getResponse().getWriter().write("tocken is null");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

        }
        return null;
    }
}
