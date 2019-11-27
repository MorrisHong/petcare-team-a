<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
</head>
<body>
<!------ Include the above in your HEAD tag ---------->
<div class="container login-container">
    <div class="row">
        <div class="col-md-6 login-form-1">
            <h3>Login</h3>
            	<form:form modelAttribute="member" method="post" action="/login/loginProcess">
	                <div class="form-group">
	                    <form:input path="userId" class="form-control" placeholder="Your Id *" />
	                	<form:errors path="userId" class="form-control" placeholder="Your Id *" />
	                </div>
	                <div class="form-group">
	                    <form:input path="userPw" type="password" class="form-control" placeholder="Your Password *" value="" />
	                	<form:errors path="userPw" type="password" class="form-control" placeholder="Your Password *" value="" />
	                </div>
	                <div class="form-group">
	                    <input type="submit" class="btnSubmit" value="Login" />
	                </div>
	                <div class="form-group">
	                    <a href="/member/user" class="btnForgetPwd">Sign up</a>
	                </div>
	                <div class="form-group">
	                    <a href="#" class="btnForgetPwd">Forgot password?</a>
	                </div>
                </form:form>
        </div>
    </div>
</div>
<style>
  .login-container{
    margin-top: 5%;
    margin-bottom: 5%;
}
.login-logo{
    position: relative;
    margin-left: -41.5%;
}
.login-logo img{
    position: absolute;
    width: 20%;
    margin-top: 19%;
    background: #282726;
    border-radius: 4.5rem;
    padding: 5%;
}
.login-form-1{
	clear:both;
	margin:auto;
    padding: 9%;
    background:#282726;
    box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
}
.login-form-1 h3{
    text-align: center;
    margin-bottom:12%;
    color:#fff;
}
.btnSubmit{
    font-weight: 600;
    width: 50%;
    color: #282726;
    background-color: #fff;
    border: none;
    border-radius: 1.5rem;
    padding:2%;
}
.btnForgetPwd{
    color: #fff;
    font-weight: 600;
    text-decoration: none;
}
.btnForgetPwd:hover{
    text-decoration:none;
    color:#fff;
}
</style>
</body>
</html>