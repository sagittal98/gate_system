package com.jyyd.gate.common.interceptor;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * CORS策略 过滤器
 */
public class SimpleCORSFilter implements Filter {
 
	@Override
	public void destroy() {
 
	}
 
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) req;
		HttpServletResponse httpResponse = (HttpServletResponse) res;
		System.out.println("我是过滤器--------------------");
		// 跨域
		String origin = httpRequest.getHeader("Origin");
		System.out.println(origin);
		if (origin == null) {
			httpResponse.addHeader("Access-Control-Allow-Origin", "*");
		} else {
			httpResponse.addHeader("Access-Control-Allow-Origin", origin);
		}
		httpResponse.addHeader("Access-Control-Allow-Headers",
				"Origin, x-requested-with, Content-Type, Accept,X-Cookie");
		httpResponse.addHeader("Access-Control-Allow-Methods", "GET,POST,PUT,OPTIONS,DELETE");
		if (httpRequest.getMethod().equals("OPTIONS")) {
			httpResponse.setStatus(HttpServletResponse.SC_OK);
			return;
		}
		chain.doFilter(httpRequest, httpResponse);
	}
 
	@Override
	public void init(FilterConfig arg0) throws ServletException {
 
	}
}