package com.projetocomspringmvc.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.projetocomspringmvc.model.Admin;

public class ControleAcesso extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getRequestURI();
		
		if(url.contains("adminlogin"))
			return true;
		
		if(url.startsWith("/admin/") && request.getSession().getAttribute("admin") instanceof Admin)
			return true;
		
		else{
			response.sendRedirect("/");
			return false;
		}
	}
}
