<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<!--
Copyright (c) 2003-2013, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
-->
<html>
<head>
<title>Replace Textareas by Class Name &mdash; CKEditor Sample</title>
<meta charset="utf-8">
<script src="resource/plugin/ckeditor/ckeditor.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath() %>/resource/js/jquery/jquery-1.5.2.min.js"></script>
<link rel="stylesheet"
	href="resource/plugin/ckeditor/samples/sample.css">

<script type="text/javascript">
	function InsertText() {
		var editor = CKEDITOR.instances["editor1"];
		
		alert(editor.name);
		var value = document.getElementById('test').value;

		if (editor.mode == 'wysiwyg') {
			editor.insertText(value);
		} else
			alert('You must be in WYSIWYG mode!');
	}
	function getText() {
		alert(CKEDITOR.instances.editor1.getData());
	}

	function showOpen() {
		$.post("<%=request.getContextPath() %>/showOpen.do", 
		{
			"str" : CKEDITOR.instances.editor1.getData()
		}
		,
		function() {
			alert("ok");
		});
	}
	
	function ok() {
		$('<textarea class="ckeditor" cols="1" id="editor2" name="editor"rows="1"></textarea>').appendTo("body");
		CKEDITOR.replace( 'editor2' );
		
		
	}
</script>
</head>
<body>
	<form action="sample_posteddata.php" method="post">
		<p>
			<label for="editor1"> Editor 1: </label>
			<textarea class="ckeditor" cols="80" id="editor1" name="editor1"
				rows="10">
				
			</textarea>
		</p>
		<p>
			<input type="submit" value="Submit">
		</p>
	</form>

	<textarea rows="10" cols="100" id="test">
		
	</textarea>
	<input type="button" id="txtArea" onclick="InsertText()" value="执行">
	<input type="button" id="txtArea" onclick="getText()" value="看值">
	<input type="button" id="txtArea" onclick="showOpen()" value="预览">
	<input type="button" id="txtArea" onclick="ok()" value="ok">
</body>
</html>

