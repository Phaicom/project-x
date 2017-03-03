<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Project X</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <script src="jquery-2.1.4.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


        <link rel="stylesheet" type="text/css" href="mystyleIndex.css">
        <link rel="stylesheet" type="text/css" href="animate.css">



        <script type="text/javascript">
            $(document).ready(function() {
                $("li").hover(function() {
                    var itemwidth = $(this).width(); /* Getting the LI width */
                    $(this).prepend("<div class='hover'></div>"); /* Inserting a blank div into within li above the <a> tag*/
                    $(this).find("div").fadeIn('10000').css({'width': itemwidth}); /* Using the itemwidth for the div to display properly*/
                    $(this).find("ul").fadeIn('1000').slideDown('10000').css("display", "block");
                }, function() {

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
                <div class="col-md-12 navbar-header">
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
                                <li><a href="http://localhost:8080/ProjectX/History2">History</a></li>
                                <li><a href="http://localhost:8080/ProjectX/logout">Log out</a></li>
                                        
                            </c:when>
                            <c:otherwise>
                                <li >
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

        <div class="modal fade" id="basicModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">
                            <span aria-hidden="true">&times;</span>
                            <span class="sr-only">Close</span>
                        </button>

                        <h2>Sign in</h2>
                    </div><!---madal head---->
                    <div class="modal-body">
                        <form role="form" action="#" method="post">
                            <div class="form-group">
                                <label for="user">User </label>
                                <input type="text" class="form-control" id="userid" placeholder="Enter user id">
                            </div><!----form group--->
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" class="form-control" 
                                       id="password" placeholder="Password">
                            </div>
                            <button type="submit" class="btn btn-default" > Log in </button>

                        </form>
                    </div>
                </div><!---madal content-->
            </div><!-----modal-dailog -->
        </div><!--madal fade--->

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
                                <a href="#">Cloths</a>
                                <a href="bag.html">Bag</a>
                                <a href="shoes.html">Shoes</a>
                                <a href="decorations.html">Accessories</a>
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

        <!-------slide------>
        <div class="container">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <div class="carousel slide" id="carousel-40732">
                        <ol class="carousel-indicators">
                            <li class="active" data-slide-to="0" data-target="#carousel-40732">
                            </li>
                            <li data-slide-to="1" data-target="#carousel-40732">
                            </li>
                            <li data-slide-to="2" data-target="#carousel-40732">
                            </li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item active">
                                <img alt="" src="images/head/head03.png">
                                <div class="carousel-caption"></div>
                            </div>
                            <div class="item">
                                <img alt="" src="images/head/head02.png">
                                <div class="carousel-caption"></div>
                            </div>
                            <div class="item">
                                <img alt="" src="images/head/head01.png">
                                <div class="carousel-caption"></div>
                            </div>
                        </div> 
                        <a class="left carousel-control" href="#carousel-40732" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span></a> 
                        <a class="right carousel-control" href="#carousel-40732" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span></a>
                    </div><!----console slide--->


                    <!--------end slide-------->

                    <div class="row">
                        <div class="col-md-4"><br>
                            <div class="thumbnail"><br>
                                <img alt="300x200" src="images/head/shaow2.jpg">
                                <div class="caption">
                                    <h3>สินค้า1</h3>
                                    <p>
                                        เนื้อหา
                                    </p>
                                    <p><a class="btn" href="#">View details »</a></p>
                                </div>
                            </div>

                            <br>
                            <div class="thumbnail"><br>
                                <img alt="300x200" src="images/head/shaow2.jpg">
                                <div class="caption">
                                    <h3>สินค้า1</h3>
                                    <p>
                                        เนื้อหา
                                    </p>
                                    <p><a class="btn" href="#">View details »</a></p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4"><br>
                            <div class="thumbnail"><br>
                                <img alt="300x200" src="images/head/shaow1.jpg">
                                <div class="caption">
                                    <h3>
                                        สินค้า2
                                    </h3>
                                    <p>
                                        เนื้อหา
                                    </p>
                                    <p>
                                        <a class="btn" href="#">View details »</a>
                                    </p>
                                </div>
                            </div>

                            ><br>
                            <div class="thumbnail"><br>
                                <img alt="300x200" src="images/head/shaow1.jpg">
                                <div class="caption">
                                    <h3>
                                        สินค้า2
                                    </h3>
                                    <p>
                                        เนื้อหา
                                    </p>
                                    <p>
                                        <a class="btn" href="#">View details »</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-4"><br>
                            <div class="thumbnail"><br>
                                <img alt="300x200" src="images/head/sahow3.jpg">
                                <div class="caption">
                                    <h3>
                                        สินค้า3
                                    </h3>
                                    <p>
                                        เนื้อหา
                                    </p>
                                    <p>
                                        <a class="btn" href="#">View details »</a>
                                    </p>
                                </div>
                            </div>

                            <br>
                            <div class="thumbnail"><br>
                                <img alt="300x200" src="images/head/shaow2.jpg">
                                <div class="caption">
                                    <h3>นค้า1</h3>
                                    <p>
                                        เนื้อหา
                                    </p>
                                    <p><a class="btn" href="#">View details »</a></p>
                                </div>
                            </div>


                        </div>
                    </div>

                </div>

            </div>
        </div>






        <!-------------->                


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