<%-- 
    Document   : history
    Created on : Jun 1, 2015, 5:54:21 PM
    Author     : jao_3_000
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            $(document).ready(function () {


                $("li").hover(function () {
                    var itemwidth = $(this).width(); /* Getting the LI width */
                    $(this).prepend("<div class='hover'></div>"); /* Inserting a blank div into within li above the <a> tag*/
                    $(this).find("div").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/
                    $(this).find("ul").fadeIn('1000').slideDown('10000').css("display", "block");






                }, function () {
                    $(this).find("div").slideUp('1000').fadeOut('1000');/* sliding up and fading out the hover div */
                    $(this).find("div").remove();/* removing the <div> code from html at every mouseout event*/
                    $(this).find("ul").fadeOut('1000'); /* fading out the sub menu */

                });



                $(".search-input").focus(function () {
                    $(this).animate({width: '180px'}, 500); /* on focus, increasing the input width of search to left side*/
                });

                $(".search-input").focusout(function () {
                    $(this).animate({width: '117px'}, 500);  /* on focus, decreasing the input width of search to left side*/
                });



            });
        </script>
    </head>
    <body>

        <nav class="navbar navbar-default" >
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.jsp">PROJECT X</a>
                    <ul class="nav navbar-nav navbar-right">
                        <c:choose>
                            <c:when test="${! empty user && user.getStatus()==1||user.getStatus()==2||user.getStatus()==3}">
                                <!-- window.location.replace(); -->
                                <c:choose>
                                    <c:when test="${user.getStatus()==2||user.getStatus()==3}">
                                        <li><a href="http://localhost:8080/ProjectX/selectShop.jsp">Shop</a></li>

                                    </c:when>
                                </c:choose>

                                <li><a href="http://localhost:8080/ProjectX/editProfile.jsp">Edit Profile</a></li>
                                <li><a href="http://localhost:8080/ProjectX/History">History</a></li>
                                <li><a href="http://localhost:8080/ProjectX/logout">Log out</a></li>

                            </c:when>
                            <c:otherwise>
                                <li>
                                    <a href="#" class="login" data-toggle="modal" data-target="#basicModal" >Log in</a>
                                </li>
                            </c:otherwise>
                        </c:choose>
                    </ul>
                </div><!---header--->          
            </div><!--container--->
        </nav><!---nav bar--->


        <div class="modal fade" id="basicModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">
                            <span aria-hidden="true">&times;</span>
                            <span class="sr-only">Close</span>
                        </button>

                        <h2>Log in</h2>


                    </div>
                    <div class="modal-body">
                        <form role="form" action="login" method="post">
                            <div class="form-group">
                                <label for="user">User </label>
                                <input type="text" class="form-control" name="userid" 
                                       placeholder="Enter user id">
                            </div>
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" 
                                       name="password" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-default" > Log in </button>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <!-------add-Deal-------->

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

