console.log("Review Module........");

var reviewService = (function() {

	function add(review, callback, error) {
		console.log("add repview...............");

		$.ajax({
			type : 'post',
			url : '/review/new',
			data : JSON.stringify(review),
			contentType : "application/json; charset=utf-8",
			success : function(result, status, xhr) {
				if (callback) {
					callback(result);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		})
	}
	
	
	function getList(param, callback, error) {
		var hospitalid = param.hospitalId;
		var page = param.page || 1;

		$.getJSON("/review/pages/" + hospitalid + "/" + page + ".json", function (data) {
			if(callback) {
				callback(data.reviewCnt, data.list) // 댓글 총갯수와 목록을 가져오는 경우
				
			}
		}).fail(function (xhr, status, err) {
			if(error) {
				error();
			}
		});
	}
	
	function remove(reviewNo, callback, error) {
		$.ajax({
			type : 'delete',
			url : '/review/' + reviewNo,
			success : function(deleteResult, status, xhr) {
				if (callback) {
					callback(deleteResult);
				}
			},
			error : function(xhr, status, er) {
				if (error) {
					error(er);
				}
			}
		})
	}
	
	function displayTime(timeValue){
		var today = new Date();
		
		var gap = today.getTime() - timeValue;
		
		var dateObj = new Date(timeValue);
		var str = "";
		
		var yy = dateObj.getFullYear();
		var mm = dateObj.getMonth() + 1;
		var dd = dateObj.getDate();
		var hh = dateObj.getHours();
		var mi = dateObj.getMinutes();
			
			return [yy, '.', (mm > 9 ? '' : '0') + mm, '.', (dd > 9 ? '' : '0') + dd, ' ', (hh > 9 ? '' : '0') + hh, ':', (mi > 9 ? '' : '0') + mi].join('');
	};
	
	return{ 
		add : add,
		getList : getList,
		remove : remove,
		displayTime : displayTime
	};
})();
