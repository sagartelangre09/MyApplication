package com.sagar.springmvcmaster.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyLoginInterceptor implements HandlerInterceptor
{
	//private static final org.apache.log4j.Logger Logger=Logger.getLogger(MyLoginInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime=System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String queryString=request.getQueryString()==null?"":"?"+request.getQueryString();
		String requestUrl=request.getRequestURI()+queryString;
		long endTime=System.currentTimeMillis();
		long startTime=(long) request.getAttribute("startTime");
		String s=String.format("the request %s took  milis to process %s",requestUrl,(endTime-startTime));
		System.out.println(s);
		//Logger.info(s);
		
	}
	

}
