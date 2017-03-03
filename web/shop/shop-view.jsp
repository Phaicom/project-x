<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Select Shop</title>
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
    
        <h1 style="color:#703100;padding-left:5%;">S E L E C T &emsp; S H O P</h1><hr style="width:90%;">
        <center>
        <c:choose>
            <c:when test="${shoplist!= null}">
            <table border="0" class="selectShop" style="width:80%;">
           <c:forEach items="${shoplist}" var="c" varStatus="vs">
                <tr align="left">
                <td>${vs.count}</td>
                <td ><b>${c.shop_Name}</b><br>${c.shop_Address}<br>${c.shop_Email}<br>${c.shop_Tel}</td>
                <td><form action="editShop.jsp" method="POST"><input type="submit" value="Edit"><input type="hidden" name="" value="${shop_ID}"></form></td>
            </tr>
            <tr><td><br></td></tr>
                    </c:forEach>
                </table>
            </c:when>
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