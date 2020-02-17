<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
		$("#userForm").bind("submit", function(e) {
			//e.preventDafault();
			alert($("#userForm").serialize());
			$.ajax({	   
				url: "user/register",
				method: "get",
				data:$("#userForm").serialize(),
				success:function(user){
					$("#p").html("다음 내용으로 저장되었습니다<br>"
							+"이름: " +user.name +"<br>"
							+"나이: " +user.age+ "<br>"
							+"가입일: " +user.regDate);
				},
				error:function(a,b,errMsg){
					$("#p").hhtml("실패: " + errMsg);
				}
				});
		});
		
	});
</script>

<form id="userForm">
	<label>이름</label>
	<input id="name" type="text" name="name" required="required"/><br>
	<label>나이</label>
	<input id="age" type="number" name="age" required="required"/><br>
	<label>등록일</label>
	<input id="regDate" type="date" name="regDate" required="required"/><br> 
	<input type="submit"/> 
</form>

<p id="p"></p>