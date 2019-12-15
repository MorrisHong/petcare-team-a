package com.petcare.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserAuthInterceptor extends HandlerInterceptorAdapter{

	private void saveDestination(HttpServletRequest request) {
		String uri = request.getRequestURI();
		String query = request.getQueryString();

		if(query == null || query.equals("null")) {
			query = "";
		}else {
			query = "?" + query;
		}

		if(request.getMethod().equals("GET")) {
			request.getSession().setAttribute("destination", uri + query);
		}
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("prehandle 인터셉터");
		HttpSession httpSession = request.getSession();

		if(httpSession.getAttribute("user")==null) {
			saveDestination(request);
			response.sendRedirect("/login");
			return false;
		}
		return true;
	}
}