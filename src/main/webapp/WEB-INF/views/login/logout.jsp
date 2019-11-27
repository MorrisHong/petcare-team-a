<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test="${not empty sessionScope.member}">
       <h1>${sessionScope.member.userId} 님 환영합니다.</h1>
    </c:when>
    <c:otherwise>
        <h1>로그아웃 되었습니다.</h1>
    </c:otherwise>
</c:choose>
