<%-- 
    Document   : CategoryGen
    Created on : Jun 2, 2015, 7:32:50 AM
    Author     : Master0z
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clothes</title>
        <meta charset="utf-8">
        <!-- Latest compiled and minified CSS -->
        <script src="jquery-2.1.4.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>    <link rel="stylesheet" type="text/css" href="mystyleIndex.css">
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
            });
        </script>

    </head>

    <body>

        <!------nav bar head1-------->    
        <nav class="navbar navbar-default1" >
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="index.jsp">PROJECT X</a>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="login"><a href="#" class="login" data-toggle="modal" data-target="#basicModal" >Log in</a></li>
                    </ul>
                </div><!---header--->          
            </div><!--container--->
        </nav><!---nav bar--->

        <!----end-->                              


        <!------nav head2------>


        <nav class="navbar navbar-default2" >
            <div class="container-fluid">
                <div class="navbar-header">
                    <ul>
                        <div class="hover" style="display:block; width:120px;"></div>
                        <li class="dropdown">

                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Food </span></a>
                            <ul class="dropdown-menu" role="menu">
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=3">Dessert</a>
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=2">Drink</a>
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=1">Food</a>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Fashion</a>
                            <ul class="dropdown-menu" role="menu">
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=4">Cloths</a>
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=5">Bag</a>
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=6">Shop</a>
                                <a href="http://localhost:8080/ProjectX/categoryServ?cat_id=7">Accessories</a>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Health & Beauty</a>
                            <ul class="dropdown-menu" role="menu">
                                <a href="cosmetics.html">Cosmetics</a>
                                <a href="perfume.html">Perfume</a>
                                <a href="skincare.html">Skin Care</a>
                                <a href="cleanser.html">Cleanser</a>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Home & garden</a>
                            <ul class="dropdown-menu" role="menu">
                                <a href="furniture.html">Furniture</a>
                                <a href="tools.html">Tools & Material</a> 
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Mother & Baby </a>
                            <ul class="dropdown-menu" role="menu">
                                <a href="mom.html">Mother Products</a>
                                <a href="baby.html">Baby Products</a>
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Technology </a>
                            <ul class="dropdown-menu" role="menu">
                                <a href="comp.html">Computer & Notebook</a></li>
                        <a href="smartphone.html">Phone & Tablet</a>
                        <a href="elec.html">Electronic</a>
                    </ul>
                    </li>               
                    <li>
                        <a href="#" role="button" class="otherA"  aria-expanded="false">Other</a>
                    </li>   

                    </ul>
                </div><!---header--->          
            </div><!--container--->
        </nav><!---nav bar--->


        <!----------end nav2----------->


        <h1 style="text-align:center;color:#703100;">${cat_name}</h1>  <br>

        <div class="col-md-2"></div>

    <c:forEach items="${food_array}" var="food">
            <a href='#' class='img' data-toggle="modal" data-target="#${food.getDeal_ID()}">
                <img src="images/${food.getDeal_Img()}" width="350" height="350" id="pi">
            </a>


            <div class="modal fade" id="${food.getDeal_ID()}">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">
                                <span aria-hidden="true">&times;</span>
                                <span class="sr-only">Close</span>
                            </button>
                            <h2>เงื่อนไขการใช้สิทธิ์</h2>
                        </div>
                        <div class="modal-body">

                            <div style="text-align:left">
                                - ${food.getDeal_Name()}<br>
                                - ${food.getDeal_Detail()}<br>
                                - 1รหัส/สิทธิ์/สัปดาห์<br>
                                - ${food.getDeal_Count()}<br>
                                - ในกรณีที่มีการกดรหัสแล้วไม่ได้นำมาใช้สิทธิ์ ไม่ว่ากรณีใดก็ตาม ขอสงวนสิทธิ์ในการชดเชยให้ในทุกกรณี<br>
                                - ระยะเวลาการใช้สิทธิ์  ${curren_date} - ${food.getDeal_Expdate()}

                            </div>

                            <br><br>
                            <div align='center'><button type="button" class="btn btn-default" onclick="location.href='redeem.jsp'"> redeem </button></div>


                        </div>

                    </div><!---madal content-->
                </div>
            </div><!--madal fade--->
        </c:forEach>
    <!----------------->



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
