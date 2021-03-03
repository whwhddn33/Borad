<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/app/css/main.css">
</head>

<body>
<div class="logout-wrapper">
            <div class="btn"><a class="btn blue" href="/login/logout.php">로그아웃</a></div>       
       </div>
    <div class ="text-wrapper">   
       <div class="text"><a class="btn blue" >${loginid}님</a></div>
    </div>
    <br><br>


    <div class = "wrapper">
            <a href="#" class="logo">
            	<img class="logo" src="/app/main_images/logo.png">
            </a>
    
            
                    
                    <input type="radio" name= "radiobtn" id= "books">
                    <label class = "book" name= "radiobtn"for="books">
                        <img id ="book"src="/app/main_images/Book.png" alt="">
                    </label>

                    <input type="radio" name= "radiobtn" id= "relis">
                    <label class = "reli" name= "radiobtn"for="relis">
                        <img id ="reli"src="/app/main_images/Religion.png" alt="">
                    </label>

                    <input type="radio" name= "radiobtn" id= "arts">
                    <label class = "art" name= "radiobtn"for="arts">
                        <img id ="art"src="/app/main_images/Art_Culture.png" alt="">
                    </label>

                    <input type="radio" name= "radiobtn" id= "vols">
                    <label class = "vol" name= "radiobtn"for="vols">
                        <img id ="vol"src="/app/main_images/Volunteer.png" alt="">
                    </label>

                    <input type="radio" name= "radiobtn" id= "sports">
                    <label class = "sport" name= "radiobtn"for="sports">
                        <img id ="sport"src="/app/main_images/Sport.png" alt="">
                    </label>


                    <a href="#" class="minions">
                        <img src="/app/main_images/minions.png">
                        </a>


                    <div class = "list1">
                        <li>
                            1
                            <a href="https://www.youtube.com/watch?v=6-q68eYvzyE">아마테라스</a>
                            <a href="https://www.youtube.com/watch?v=FSn_3I9yMJU">나셍강</a>
                        </li>
                        <li>
                            <a href="#">띵사모</a>
                            <a href="#">전띵진</a>
                        </li>

                    </div>
                    <div class = "list2">
                        <li>
                            2
                            <a href="https://www.youtube.com/watch?v=6-q68eYvzyE">아마테라스</a>
                            <a href="https://www.youtube.com/watch?v=FSn_3I9yMJU">나셍강</a>
                        </li>
                    </div>
                    <div class = "list3">
                        <li>
                            3
                            <a href="https://www.youtube.com/watch?v=6-q68eYvzyE">아마테라스</a>
                            <a href="https://www.youtube.com/watch?v=FSn_3I9yMJU">나셍강</a>
                        </li>
                    </div>
                    <div class = "list4">
                        <li>
                            4
                            <a href="https://www.youtube.com/watch?v=6-q68eYvzyE">아마테라스</a>
                            <a href="https://www.youtube.com/watch?v=FSn_3I9yMJU">나셍강</a>
                        </li>
                    </div>
                    <div class = "list5">
                        <li>
                            5
                            <a href="https://www.youtube.com/watch?v=6-q68eYvzyE">아마테라스</a>
                            <a href="https://www.youtube.com/watch?v=FSn_3I9yMJU">나셍강</a>
                        </li>
                    </div>
            
        
    </div>
</body>
</html>