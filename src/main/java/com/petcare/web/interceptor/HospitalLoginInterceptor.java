package com.petcare.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.petcare.web.domain.Hospital;
import com.petcare.web.domain.HospitalVO;

public class HospitalLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        Hospital hospital = (Hospital) modelAndView.getModel().get("hospitaluser");

        if(hospital != null) {
        	
            HttpSession session = request.getSession();
            session.setAttribute("hospitaluser", hospital);
        }

    }
}