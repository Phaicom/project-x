<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Use Voucher</title>

    <!-- Bootstrap Core CSS -->
    <link href="outsource/css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="outsource/css/grayscale.css" rel="stylesheet">
    <link href="outsource/css/animate.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="outsource/css/font.css" rel="stylesheet">
    <style type="text/css">
        body{
        font-family: 'supermarketregular';
        overflow:hidden;
        color: #ccc;
        
        }
        input {
            /*opacity: 0.4;*/
            
            border: 0;
            padding: 0;
            border-radius: 50px;
            width: 300px;
            height: 50px;
            text-align: center;
            font-size: 15px;
            color: #000;
        }
        
        #back {
            background-color: #ccc;
            opacity: 0.8;
            padding: 50px;
        }
    </style>
    
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  <script src="outsource/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="outsource/js/bootstrap.js">
            
    </script>

    <!-- Plugin JavaScript -->
    <script src="outsource/js/jquery.easing.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="outsource/js/grayscale.js"></script>
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

    <!-- Navigation -->
    <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">
                    <i class="fa fa-play-circle"></i> Project<span class="light"> X </span>
                </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                <ul class="nav navbar-nav">
                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#" >Contact Us</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Intro Header -->
    <div class="intro">
        <div class="intro-body">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2  flipInY animated" id="back">
                        <div class="col-lg-8 col-lg-offset-2">
                            <p class="intro-text" style="color: #333;font-weight:bold;font-size:50px;">Voucher Detail
                               
        <table style="color: #333;font-size:20px;border-spacing: 15px;
    border-collapse: separate;" align="center" >
            <tr align="left">
                <td><b>Code : </b></td>
                <td>${code}</td>
            </tr>
            <tr align="left">
                <td><b>Name : </b></td>
                <td>${user_Name}&nbsp;${user_Lname}</td>
            </tr>
            <tr align="left">
                <td><b>Tel : </b></td>
                <td>${user_Tel}</td>
            </tr>
            <tr align="left">
                <td><b>Deal : </b></td>
                <td>${deal_Name}</td>
            </tr>
            <tr align="left">
                <td><b>Expire Date : </b></td>
                <td>${date}&nbsp;${month}&nbsp;${year}</td>
            </tr>
            <tr align="left">
                <td><b>Shop : </b></td>
                <td><b>${shop_Name}</b>
                    <br>${shop_Address}
                    <br>Tel.${shop_Tel}
                <br>E-Mail: ${shop_Email}</td>
            </tr>
        </table>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>