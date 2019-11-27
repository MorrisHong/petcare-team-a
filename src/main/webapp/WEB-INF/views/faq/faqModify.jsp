<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<form action="modify">
	<div style="clear: both; width: 60%; margin: auto;">
		<input type="hidden" name="faqNo" value="${faqModify.faqNo}" />
			<div hidden>
				<label>id</label>
				<input type="text" class="form-control" name="userId" value="" readonly />
			</div>
			<div>
				<label>title</label>
				<input type="text" class="form-control" name="faqTitle" value="${faqModify.faqTitle}" />
			</div>
			<div>
				<label>content</label>
				<pre><textarea class="form-control" name="faqContent" rows="10">${faqModify.faqContent}</textarea></pre>
			</div>
			<div>
				<input class="btn btn-default" type="submit" value="update">
				<a class="btn btn-default" href="faqList">faqList</a>
				<a class="btn btn-default" href="delete?faqNo=${faqModify.faqNo}">delete</a>
			</div>
	</div>
</form>