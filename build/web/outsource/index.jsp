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
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/grayscale.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="css/font.css" rel="stylesheet">
    <style type="text/css">
        body{
        font-family: 'supermarketregular';
        overflow:hidden;
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
  <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.js">
            
    </script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>

    <!-- Custom Theme JavaScript 
    <script src="js/grayscale.js"></script>-->
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
                        <div class="col-lg-6 col-lg-offset-3">
                            <p class="intro-text" style="color: #333;font-weight:bold;font-size:50px;">Voucher code
                                <form action="../getCode">
                                    <div class="input-group">
                                        <input type="text" class="form-control" name="code" placeholder="Voucher Code" autofocus />
                                        <span class="input-group-btn">
        <button class="btn btn-success" type="submit">Go!</button>
      </span>
                                    </div>
                        </div>
                        </form>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>
    <!-- jQuery -->
  