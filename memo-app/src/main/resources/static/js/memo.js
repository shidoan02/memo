function postComment(text) {
	$.ajax({
		headers : {
			'Accept' : 'application/json',
			'Content-Type' : 'application/json'
		},
		type : 'POST',
		dataType : 'json',
		url : '/memos',
		data : JSON.stringify({
			text : text,
		})
	}).done(function(res) { // 正常に処理が行われた際
		$('ul').append($(`<li>${res.text}</li>`));
	});
}