<%-- 
    Document   : addDeal
    Created on : Jun 1, 2015, 7:47:34 PM
    Author     : Master0z
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Deal</title>
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

    <!-------add-Deal-------->


    <span style="color:#265640;font-size:30pt;padding-left:5%;">A D D&emsp; D E A L</span> <hr width="90%"> 

    <div class="col-md-1"></div>
    <div class="col-md-10" style="margin-bottom: 2em">
        <div class="your-at">
            <form action='addDealChk' method="post" enctype="multipart/form-data">
                Deal Name<br> <input type="text" name="nameDeal" placeholder="Deal Name">  <br>	<br>	
                Detail<br><input type="text" name="detail" placeholbr>		<br>	<br>			
                Expiration Date <br>  <input type="date" name="expirationDate">	<br>	<br>
                Deal Count <br> <input type="text" name="deal_count" placeholder="Number">  		<br><br>
                Category<br><br>
                <select name='category_id'>
                    <option value=2>Drink</option>
                    <option value=1>Food</option>
                    <option value=3>Dessert</option>

                    <option value=4>Cloths</option>
                    <option value=5>Bag</option>
                    <option value=6>Shoes</option>
                    <option value=7>Accessories</option>

                    <option value=8>Cosmetics</option>
                    <option value=9>Perfume</option>
                    <option value=10>Skin Care</option>
                    <option value=11>Cleanser</option>

                    <option value=12>Furniture</option>
                    <option value=13>Tools & Material</option>

                    <option value=14>Mother Products</option>
                    <option value=15>Baby Products</option>

                    <option value=16>Computer & Notebook</option>
                    <option value=17>Phone & Tablet</option>
                    <option value=18>Electronic</option>

                    <option value=19>Other</option>


                </select><br><br>

                Image<br><br>
                <input type="file" accept="image/*" name='deal_img'>



                <input type='hidden' name='serve_chk' value='0'>
                <br>
                <input type="submit" value="Add">
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

    <script>

    </script>

</body>
</html
