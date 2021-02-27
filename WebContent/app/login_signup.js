function signCheck(){
	const joinform = document.joinform;
	var userid = joinform.userid.value;
	var userpw = joinform.userpw.value;
	var userpwcheck = joinform.userpwCheck.value;
	var username = joinform.username.value;
	var userphoneNum = joinform.userphone.value;
	
	
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