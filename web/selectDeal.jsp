<%-- 
    Document   : selectDeal
    Created on : Aug 7, 2015, 9:53:43 PM
    Author     : Reawpai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Select Deal</title>
        <meta charset="utf-8">
        <script src="jquery-2.1.4.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>    
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <link rel="stylesheet" type="text/css" href="animate.css">

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


        
            <h1 style="color:#703100;padding-left:5%;">S E L E C T &emsp; D E A L</h1><hr style="width:90%;">
            <center>

                <div class="flipInY animated">
                    <div class="addBut">
                        <input type="button" value="A d d &emsp; D e a l" onclick="location.href = 'http://localhost:8080/ProjectX/addDeal.jsp'"><br><br>
                    </div>
                </div>

                <table border="0" class="selectShop" style="width:80%;">
                    <% int count = 0; %>
                    <c:forEach items="${list_deal}" var="ldeal">
                        <tr>
                                <td ><% count++;
                                    out.print(count);%></td>
                            <td >${ldeal.getDeal_Name()}</td>
                            <td>
                                
                                <form action="editDeal" method="post">
                                    <input type="text" name="shop_id" value="${ldeal.getDeal_ID()}" hidden>
                                    <input type="submit" value="Edit" >
                                </form><hr>
                            </td>
                        </tr>
                    </c:forEach>

                </table>
            </center>
        </form>

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
