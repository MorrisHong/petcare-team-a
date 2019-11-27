<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<form action="faqView" method="post">
		<div style="clear: both; width: 60%; margin: auto;">
				<div>
					<label>id</label>
					<p>${view.userId}</p>
				</div>
				<div>
					<label>title</label>
					<p>${view.faqTitle}</p>
				</div>
				<div>
					<label>content</label>
					<p>${view.faqContent}</p>
				</div>
				<div>
					<label>date</label>
					<p>${view.faqRegdate}</p>
				</div>
				<div>
					<a class="btn btn-default" href="faqMofify?faqNo=${view.fqaNo}">update</a>
					<a class="btn btn-default" href="list">faqList</a>
					<a class="btn btn-default" href="faqDelete?faqNo=${view.faqNo}">delete</a>
				</div>
		</div>		
</form>