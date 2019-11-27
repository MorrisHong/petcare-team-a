<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<tiles:insertAttribute name="head" />
	</head>
    <body>
    	<div class="page_loader"></div>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="nav" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
		
		<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="/resources/js/bootstrap-submenu.js"></script>
		<script type="text/javascript" src="/resources/js/rangeslider.js"></script>
		<script type="text/javascript" src="/resources/js/jquery.mb.YTPlayer.js"></script>
		<script type="text/javascript" src="/resources/js/wow.min.js"></script>
		<script type="text/javascript" src="/resources/js/bootstrap-select.min.js"></script>
		<script type="text/javascript" src="/resources/js/jquery.easing.1.3.js"></script>
		<script type="text/javascript" src="/resources/js/jquery.scrollUp.js"></script>
		<script type="text/javascript" src="/resources/js/jquery.mCustomScrollbar.concat.min.js"></script>
		<script type="text/javascript" src="/resources/js/leaflet.js"></script>
		<script type="text/javascript" src="/resources/js/leaflet-providers.js"></script>
		<script type="text/javascript" src="/resources/js/leaflet.markercluster.js"></script>
		<script type="text/javascript" src="/resources/js/dropzone.js"></script>
		<script type="text/javascript" src="/resources/js/jquery.filterizr.js"></script>
		<script type="text/javascript" src="/resources/js/maps.js"></script>
		<script type="text/javascript" src="/resources/js/app.js"></script>
		
		<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
		<script type="text/javascript" src="/resources/js/ie10-viewport-bug-workaround.js"></script>
		<!-- Custom javascript -->
		<script type="text/javascript" src="/resources/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</html>