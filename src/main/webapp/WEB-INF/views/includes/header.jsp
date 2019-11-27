<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Top header start -->
<header class="top-header hidden-xs" id="top">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                <div class="list-inline">
                </div>
            </div>
            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                <ul class="top-social-media pull-right">
                	<c:choose>
                		<c:when test="${not empty sessionScope.user}">
                			<li>
                				${sessionScope.user.userName}님 환영합니다.
                				<a href="/logout" class="sign-in"><i class="fa fa-sign-in"></i> Logout</a>
                			</li>
                		</c:when>
                		<c:when test="${not empty sessionScope.hospitaluser}">
                			<li>
                				${sessionScope.hospitaluser.hospitalId}님 환영합니다.
                				<a href="/logout" class="sign-in"><i class="fa fa-sign-in"></i> Logout</a>
                			</li>
                		</c:when>
                		<c:otherwise>
                			<li>
                        		<a href="/login" class="sign-in"><i class="fa fa-sign-in"></i> Login</a>
                    		</li>
                    		<li>
                        		<a href="/select" class="sign-in"><i class="fa fa-user"></i> Register</a>
                    		</li>
                		</c:otherwise>
                	</c:choose>
                </ul>
            </div>
        </div>
    </div>
</header>
<!-- Top header end -->

