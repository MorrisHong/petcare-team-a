<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>병원 검색</title>
</head>
<body>
<!-- 검색창 상단, 결과 하단 -->
<!-- 선택지 검색기능 -->
<!-- Ajax 통신 -->
<div>
	<div>
	<h3>동물병원 목록</h3>
	<form method="get" action="/hospital/search">
		<select>
		  <option value="hospitalName">병원 이름</option>
		  <option value="hospitalAddress">병원 주소</option>
		</select>
		<input type="text" name="hospitalName" placeholder="검색어를 입력하세요"><br>
		  <input type="checkbox" name="choice1" value="hospitalNightcare">야간진료
		  <input type="checkbox" name="choice2" value="hospitalEmergency">응급실
		  <input type="checkbox" name="choice3" value="hospitalSpecial">특수동물
		  <input type="checkbox" name="choice4" value="hospitalHotel">애견호텔
		<input type="submit" value="검색">
	</form>
	</div>
	<div>
	<h3>전체 리스트</h3>
		<c:forEach items="${list}" var="list">
		<a class='move' href='<c:out value="get?hospitalId=${list.hospital_id}"/>'>이름: ${list.hospital_name}</a><br>
			주소: ${list.hospital_address}<br>
			전화번호: ${list.hospital_phone}<br>
			이메일: ${list.hospital_email}<br>
			영업시작: ${list.hospital_open}<br>
			영업마감: ${list.hospital_close}<br>
			야간진료: ${list.hospital_nightcare}<br>
			응급실: ${list.hospital_emergency}<br>
			특수동물: ${list.hospital_special}<br>
			애견호텔: ${list.hospital_hotel}<br>
			종류: ${list.hospital_species}<br>
			사진: ${list.hospital_photo}<br>
			소개: ${list.hospital_intro}<br><br><br>
		</c:forEach>
	</div>
	<div>
	<h3>검색 결과</h3>
		<c:forEach items="${search}" var="list">
			이름: ${list.hospital_name}<br>
			주소: ${list.hospital_address}<br>
			전화번호: ${list.hospital_phone}<br>
			이메일: ${list.hospital_email}<br>
			영업시작: ${list.hospital_open}<br>
			영업마감: ${list.hospital_close}<br>
			야간진료: ${list.hospital_nightcare}<br>
			응급실: ${list.hospital_emergency}<br>
			특수동물: ${list.hospital_special}<br>
			애견호텔: ${list.hospital_hotel}<br>
			종류: ${list.hospital_species}<br>
			사진: ${list.hospital_photo}<br>
			소개: ${list.hospital_intro}<br><br><br>
		</c:forEach>
	</div>
</div>

</body>
</html>