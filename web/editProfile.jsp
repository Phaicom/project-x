<%-- 
    Document   : editProfile
    Created on : Aug 7, 2015, 6:44:04 PM
    Author     : Reawpai
--%>

<%@page import="Model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
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
        <script>
            function rmReadOnly() {
                document.getElementById("exampleInputUname").removeAttribute("readonly");
                document.getElementById("exampleInputUsname").removeAttribute("readonly");
                document.getElementById("exampleInputEmail").removeAttribute("readonly");
                document.getElementById("exampleInputTel").removeAttribute("readonly");
                document.getElementById("exampleInputPass").removeAttribute("readonly");
                document.getElementById("userpass").removeAttribute("readonly");
                document.getElementById("re_newpass").removeAttribute("readonly");

                document.getElementById("address").removeAttribute("readonly");
                document.getElementById("edit").innerHTML = "";
                document.getElementById("save").removeAttribute("hidden");
            }



        </script>

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

        <!-------edit-profile-------->


        <span style="color:#265640;font-size:30pt;padding-left:5%;">E D I T&emsp; PR O F I L E</span> <hr width="90%"> 

        <div class="col-md-1"></div>
        <div class="col-md-10" style="margin-bottom: 2em">
            <div class="your-at">
                <form action='editProfile' method="post" >
                    Name&emsp;&emsp;&emsp;&emsp; <input type="text" id="exampleInputUname" name='uname' placeholder="${user.getUser_name()}" readonly>		<br>					
                    Last Name&emsp;&emsp; <input type="text" id="exampleInputUsname" name='lname' placeholder="${user.getUser_lname()}" readonly>		<br>
                    Email&emsp;&emsp;&emsp;&emsp; <input type="email" id="exampleInputEmail" name='uemail' placeholder="${user.getEmail()}" readonly>		<br>

                    Address&emsp;&emsp;&emsp;&nbsp;  <input type="text" id="address" name='uaddress' placeholder="${user.getAddress()}" readonly>  		<br>
                    Tel&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; <input type="tel" id="exampleInputTel" name='utel' placeholder="${user.getTel()}" readonly> <br>
                    New Password&emsp;&emsp;&nbsp;&nbsp; <input type="password" id="exampleInputPass" name='newpass' placeholder="Password" readonly>		<br>
                    Re Password&emsp;&emsp;&nbsp;&nbsp; <input type="password" id="re_newpass" name='re_newpass' placeholder="Password" readonly>		<br>
                    Old Password&emsp;&emsp;&nbsp;&nbsp; <input type="password" id="userpass" name='upass' placeholder="Password" readonly>		<br>
                    <table border="0" style="text-align:left;">
                        <tr >        
                            <td> ${edit_message} &emsp;&emsp;&emsp;&emsp; </td>
                        </tr>    
                    </table><br>
                    <span id='save' hidden>
                        <input type="submit" value="save" ><!----add link--->
                    </span>
                    <span id='edit'>
                        <input type="button" value="Edit" onclick="rmReadOnly()"><!----add link--->
                    </span>
                    <input type="button" class="back" value="Back" onclick="location.href='index.jsp'"><!---add link----->
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
</html>
