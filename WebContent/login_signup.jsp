<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>

	<div class = slidepage>
                
                <input type="radio" name = "trans" id= "move2page">
                <input type="radio" name = "trans" id= "move1page"checked>

                    <div class = slider>

                        <div class = slide1>

                            <div class =slide1in-1>

                                <div class = label1hw>
                                    <label for="move2page"><img id ="signupimg" src="signupimg.png" alt=""></label>
                                </div>   

                                <div class = "loginbox">
                                    <h1> LOGIN </h1>
                                    <form name= "login" action = "login_action.jsp" method="post">
                                        <div class = "logint-area">
                                            <input type="text" name= "id" id = "id"
                                            autocomplete = "off" required>
                                            <label for="id">STUDENT ID</label>
                                        </div>
                                        <div class = "logint-area">
                                            <input type="password" name= "password" id = "password"
                                            autocomplete = "off" required>
                                            <label for="password">PASSWORD</label>
                                        </div>
                                        <div class="logbtn-area">
                                            <button id ="login" 
                                            type="submit">Login</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>



                        <div class = slide2>
                            <div class =slide2in>
                                <div class = label2hw>
                                <label for="move1page"><img id ="loginimg" src="loginimg.png" alt=""></label>
                                </div>
                                <div class = "signupbox">
                                    <h1>SIGN UP</h1>
                                    
                                    <!-- -----------------------signupform--------------------- -->
                                    <form name = "joinform" action="membersave.jsp" method="post">
                                        <div class = "int-a">
                                            <input type = "text" name = "id" id = "sign_id">
                                            <label for="id">STUDENT ID</label>
                                        </div> 
                                       
                                        <div class = "int-a">
                                            <input type="password" name= "password" id = "sign_password">
                                            <label for="password">PASSWORD</label>
                                        </div> 
                                        <div class = "int-a">
                                            <input type="password" name= "password_ck" id = "sign_password_ck">
                                            <label for="password_ck">PASSWORD CHECK</label>
                                        </div>
                                        <div class = "int-a">
                                            <input type = "text" name = "name" id = "sign_name">
                                            <label for="name">NAME</label>
                                        </div> 
                                        <div class = "int-a">
                                            <input type = "text" name = "phone_num" id = "sign_phone_num">
                                            <label for="phone_num">PHONE NUMBER</label>
                                        </div> 
                                        <div class="btn-area">
                                            <input type="button" id ="btn" onclick="signCheck();">
                                            <!-- <button id ="btn" onclick="signCheck();">SUBMIT</button> -->
                                        </div>
                                    </form>
                                    <!-- -----------------------signupform----------------- -->
                                </div>오  
                        </div>
                    </div>
            </div>
</body>

<script>
	function signCheck(){
		const joinform = document.joinform;
	if(joinform.id.value.length <8){
		alert("아이디를 8자 이상으로 설정해주세요");
		joinform.id.focus();
		return false;
	}
	if(joinform.password.value != joinform.password_ck.value){
		alert("비밀번호와 비밀번호확인이 다릅니다. 다시 확인해주세요");
		return false;
	} 
	if(joinform.phone_num.value<10){
		alert("휴대폰번호를 확인해주세요");
		return false;
	}
	joinform.submit();
}

</script>


</html>