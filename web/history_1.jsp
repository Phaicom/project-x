<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>HISTORY</title>
        <meta charset="utf-8">
        <script src="shop/jquery-2.1.4.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>    
        <link rel="stylesheet" type="text/css" href="shop/mystyleclothes.css">
        <link rel="stylesheet" type="text/css" href="shop/mystyle.css">
        
        <script type="text/javascript">
$(document).ready(function() {
	

	$("li").hover(function() {
			var itemwidth = $(this).width(); /* Getting the LI width */
			$(this).prepend("<div class='hover'></div>"); /* Inserting a blank div into within li above the <a> tag*/
			$(this).find("div").fadeIn('10000').css({ 'width' : itemwidth}); /* Using the itemwidth for the div to display properly*/
			$(this).find("ul").fadeIn('1000').slideDown('10000').css("display", "block");
			
		
		
		
		
		
	} , function() {
		$(this).find("div").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */
		$(this).find("div").remove();/* removing the <div> code from html at every mouseout event*/
		$(this).find("ul").fadeOut('1000'); /* fading out the sub menu */
		
	});
	
	

	$(".search-input").focus(function(){
		$(this).animate({width:'180px'}, 500); /* on focus, increasing the input width of search to left side*/
	});
	
	$(".search-input").focusout(function(){
		$(this).animate({width:'117px'}, 500);  /* on focus, decreasing the input width of search to left side*/
	});
	
	

});
</script>


    </head>
    <body>
 
<nav class="navbar navbar-default" >
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">PROJECT X</a>
            <ul class="nav navbar-nav navbar-right">
                <li><a class="shop" href="#" >Shop</a></li>
                <li><a class="edit" href="#" >Edit</a></li>
                <li><a class="histoty" href="#" >History</a></li>
                <li><a class="logout" href="#" >Log out</a></li>
            </ul>
        </div><!---header--->          
    </div><!--container--->
</nav><!---nav bar--->
    
        <h1 style="color:#703100;padding-left:5%;">H I S T O R Y</h1><hr style="width:90%;">
        <center>
        <c:choose>
            <c:when test="${historys != null}">
                <table style=" border-spacing: 10px;
    border-collapse: separate;" width="60%">
                    <tr style="font-size: 18px;"><th>ลำดับ<th>ผู้ใช้<th>ชื่อโปรโมชั่น<th>การดำเนินการ</tr>
                    <c:forEach items="${historys}" var="h" varStatus="vs">
                        <tr><td>${vs.count}<td>${h.user_Name}<td>${h.deal_Name}<td>${h.saction}</tr>
                    </c:forEach>
                </table> 
            </c:when>
            <c:otherwise>
                <h3>${message}</h3>
            </c:otherwise>
        </c:choose>
         </table
        </center>
            
            
<div class="clearfix"> </div>

 <div class="footer">
        <hr>
	<center>
        <p >© SIT KMUTT 2015 | Designed by Project X </p>
        <a href="#">About Us</a> &emsp; &emsp;
        <a href="#">Contact Us</a> &emsp; &emsp;
        <a href="#">Privacy Policy</a> &emsp; &emsp;
        <a href="#">Terms & Condition</a>
    </center>
</div>
   
    </body>
</html>