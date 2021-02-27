<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href="/app/css/loginsignup.css">
</head>
<body>

	<div class = slidepage>
                
                <input type="radio" name = "trans" id= "move2page">
                <input type="radio" name = "trans" id= "move1page"checked>

                    <div class = slider>

                        <div class = slide1>

                            <div class =slide1in-1>

                                <div class = label1hw>
                                    <label for="move2page"><img id ="signupimg" src="/app/login_signupimages/signupimg.png" alt=""></label>
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
                                <label for="move1page"><img id ="loginimg" src="/app/login_signupimages/loginimg.png" alt=""></label>
                                </div>
                                <div class = "signupbox">
                                    <h1>SIGN UP</h1>
                                    
                                    <!-- -----------------------signupform--------------------- -->
                                    <form name = "joinform" action="/userController/UserJoinCheck.User" method="post">
                                        <div class = "int-a">
                                            <input type = "text" name = "userid" id = "sign_id">
                                            <label for="id">STUDENT ID</label>
                                        </div> 
                                       
                                        <div class = "int-a">
                                            <input type="password" name= "userpw" id = "sign_password">
                                            <label for="password">PASSWORD</label>
                                        </div> 
                                        <div class = "int-a">
                                            <input type="password" name= "userpwCheck" id = "sign_password_ck">
                                            <label for="password_ck">PASSWORD CHECK</label>
                                        </div>
                                        <div class = "int-a">
                                            <input type = "text" name = "username" id = "sign_name">
                                            <label for="name">NAME</label>
                                        </div> 
                                        <div class = "int-a">
                                            <input type = "text" name = "userphone" id = "sign_phone_num1">
                                            <label for="phone_num">PHONE NUMBER</label>
                                        </div> 
                                        <div class="btn-area">
                                        	<button id = btn type="button" onclick="signCheck();" value = "Signup">SUBMIT</button>
                                        </div>
                                    </form>
                                    <!-- -----------------------signupform----------------- -->
                                </div>
                        </div>
                    </div>
            </div>
</body>

<script src="<%=request.getContextPath()%>/app/js/login_signup.js"></script>

</html>