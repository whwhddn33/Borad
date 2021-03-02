function signCheck(){
	const joinform = document.joinform;
	const userid = joinform.userid.value;
	const userpw = joinform.userpw.value;
	const userpwcheck = joinform.userpwCheck.value;
	const username = joinform.username.value;
	const userphoneNum = joinform.userphone.value;
	
	
	if(id == null){
		alert("아이디를 입력해주세요");
		joinform.userid.focus();
		return false;
	}else if(userpw != userpwcheck){
		alert("비밀번호와 비밀번호확인이 다릅니다. 다시 확인해주세요");
		return false;
	}else if(userpw.length < 6){
		alert("6자리 이상 비밀번호를 입력해주세요");
		return false;
	}else if(username.length ==1 || username.length>6){
		alert("이름을 정확히 입력해주세요.");
		return false;
	}else if(userphoneNum.length!=11){
		alert("휴대폰번호를 확인해주세요");
			return false;
		}else joinform.submit();
}

function checkId() {
	const useridTag = document.joinform.userid;
	const userid = useridTag.value;//apple
	const checkText = document.getElementById("checkText");
	if (userid == null || userid == '') {
		checkText.innerHTML = "";
	} else {
		var xhr = new XMLHttpRequest();
		xhr.open("POST", "/userController/UserCheckId.User", true);
		xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		xhr.send("userid="+userid);
		xhr.onreadystatechange = function() {
			if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200 || xhr.status == 201) {
				if (xhr.responseText.trim() == "ok") {
					checkText.style.color = "green";
					checkText.innerHTML = "사용할 수 있는 아이디입니다.";
				} else {
					checkText.style.color = "red";
					checkText.innerHTML = "중복된 아이디입니다.";
				}
			}
		}
		

	}
}