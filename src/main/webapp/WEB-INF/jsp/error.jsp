<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap/bootstrap.css">
    <script src="https://kit.fontawesome.com/44dbd555de.js" crossorigin="anonymous"></script>
    <style>
        *{
            box-sizing: border-box;
            font-family: Georgia;
        }
        body{
            height: 100vh;
            background-image: url("../images/main_bg.png");
            background-size: cover;
            background-position: center center;
            background-repeat: no-repeat;
        }
        .card{
            box-shadow: 0px 3px 6px rgb(0, 0, 70);
        }
        .card .card-text{
            font-size: 16px;
        }
    </style>
    <title>Errors</title>
</head>
<body class="d-flex align-items-center justify-content-center">
    <!-- Card: Error Card -->
    <div class="card col-4 alert alert-danger border border-danger text-danger">
        <!-- Card Title -->
            <h3 class="card-title">
                <i class="fa fa-window-close me-2"></i>Errors:
            </h3>
            <hr>
                <!-- Card Body-->
            <div class="card-body">
                <!--Card Text-->
                    <p class="card-text">

                        <!-- Display Message -->
                            <c:if test="${requestScope.error != null}">
                                <div class ="alert alert-danger text-center border border-danger">
                                    <b>${requestScope.error}</b>
                                </div>
                            </c:if>
                        <!-- End Of Display Message -->

                    </p>
                <!--End Of Card Text-->
                    <hr>
                <!--Back to login page-->
                    <a href="/login" class="btn btn-sm btn-danger">
                        <i class ="fa fa-arrow-alt-circle-left"></i> Back
                    </a>
                <!--End of Back to login page-->
                </div>
            <!-- End Of Card Body-->
        <!-- End of Card Title -->
    </div>
    <!-- End Of Card: Error Card -->
</body>
</html>