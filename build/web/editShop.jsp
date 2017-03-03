<%-- 
    Document   : editShop
    Created on : Jun 2, 2015, 1:47:16 AM
    Author     : Master0z
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Shop</title>
        <meta charset="utf-8">
        <!-- Latest compiled and minified CSS -->
        <script src="jquery-2.1.4.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>    
        <link rel="stylesheet" type="text/css" href="mystyle.css">
        <link rel="stylesheet" type="text/css" href="borderStyle.css">

    </head>
    <body>

        <nav class="navbar navbar-default" >
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">PROJECT X</a>
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


        <!-------edit-Shop-------->


        <span style="color:#265640;font-size:30pt;padding-left:5%;">E D I T&emsp; S H O P</span> <hr width="90%"> 

        <div class="col-md-1"></div>
        <div class="col-md-10" style="margin-bottom: 2em">
            <div class="your-at">
                <form method="POST" action='editShopServ'>
                    Shop Name &nbsp;&emsp;<input type="text" name="nameShop" placeholder="Shop Name" aria-required="true" required="required">		<br>					
                    Email&emsp;&emsp;&emsp;&emsp;&nbsp; <input type="email" name="email" placeholder="Email">		<br>
                    Address&emsp;&emsp;&emsp;&nbsp;  <input type="text" name="address" placeholder="Address">  		<br>
                    Tel&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; <input type="tel" name="phone" placeholder="Telephone"> <br>
                    <input type='hidden' value='${shop_id}' name='sid'>
                    <table border="0" style="text-align:left;">
                           
                    </table><br>
                    <input type="submit" value="Save" ><!----add link--->
                    <input type="button" class="back" value="Back" onclick="location.href = 'http://localhost:8080/ProjectX/index.jsp'"><!---add link----->
                </form>								
            </div> <!-----your-at------>
        </div><!-----col-10 ----->    

        <div class="col-md-1"></div>
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
</html
