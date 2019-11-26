<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href='<spring:url value="/resources/css/custom.css"/>' rel="stylesheet" />
<link href='<spring:url value="/resources/css/cards-gallery.css"/>' rel="stylesheet" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/baguettebox.js/1.10.0/baguetteBox.min.js"></script>
</head>
<body>
<div>
	<div class="page-title">
		<div>
			<strong>회원가입</strong>
		</div>
	</div>
</div>
<section class="gallery-block cards-gallery">
	<div class="container">
		<div class="row md-3">
			<div class="col-md-9 col-lg-4 m-b-10">
				<div class="card border-1 transform-on-hover">
					<a href="/member/normal" class="lightbox">
						<img width="300" height="300" src='<spring:url value="/resources/images/join1.png"/>'>
					</a>
				</div>
			</div>
			<div class="col-md-9 col-lg-4 m-b-10">
			</div>
			<div class="col-md-9 col-lg-4 m-b-10">
				<div class="card border-1 transform-on-hover">
					<a href="/hospital/register" class="lightbox">
						<img width="300" height="300" src='<spring:url value="/resources/images/join2.png"/>'>
					</a>
				</div>
			</div>
		</div>
	</div>
</section>
</body>
</html>