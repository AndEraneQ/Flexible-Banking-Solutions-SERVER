<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap/bootstrap.css">
    <link rel="stylesheet" href="css/default.css">
    <script src="https://kit.fontawesome.com/44dbd555de.js" crossorigin="anonymous"></script>
    <title>Register</title>
</head>
    <body class="d-flex align-items-center justify-content-center">
        <!-- Card: Registration Form Card -->
            <div class="card registration-form-card col-6 bg-transparent border-0">
                <!-- Card Body -->
                <div class="card-body">
                    <!-- Form Header -->
                        <h1 class="form-header card-title mb-3">
                            <img class="main-image" src="images\Register\RegisterButtonImage.png"></i> Register
                        </h1>
                    <!-- End of Form Header -->

                    <!-- Registration Form -->
                        <form action="" class="reg-form">
                            <!-- Row -->
                                <div class="row">
                                    <!--From Group-->
                                    <div class="form-group col">
                                        <input type="text" name = "first_name" class="form-control form-control-lg" placeholder="Enter First Name"/>
                                    </div>
                                    <!--End of From Group-->

                                    <!--From Group-->
                                    <div class="form-group col">
                                        <input type="text" name = "last_name" class="form-control form-control-lg" placeholder="Enter Last Name"/>
                                    </div>
                                    <!--End of From Group-->
                                </div>
                            <!-- End of Row -->

                            <!--From Group-->
                            <div class="form-group col">
                                <input type="text" name = "email" class="form-control form-control-lg" placeholder="Enter Email"/>
                            </div>
                            <!--End of From Group-->

                            <!-- Row -->
                            <div class="row">
                                <!--From Group-->
                                <div class="form-group col">
                                    <input type="password" name = "password" class="form-control form-control-lg" placeholder="Enter Password"/>
                                </div>
                                <!--End of From Group-->

                                <!--From Group-->
                                <div class="form-group col">
                                    <input type="password" name = "confirm_pasword" class="form-control form-control-lg" placeholder="Confirm Password"/>
                                </div>
                                <!--End of From Group-->
                            </div>
                        <!-- End of Row -->

                        <!--From Group-->
                        <div class="form-group col">
                            <button class="btn btn-lg">Register</button>
                        </div>
                        <!--End of From Group-->

                        </form>
                    <!-- End of Registration Form -->

                    <!-- Card Text -->
                    <p class="card-text text-white mt-2">
                        Already have an account? <span class="ms-2 text-warning"><a href="/login" class="btn btn-sm text-warning">Sing up</a></span>
                    </p>
                    <!-- Card Text -->

                    <!-- Back Button To Landing Page-->
                        <small class="text-warning">
                            <i class="fa fa-arrow-alt-circle-left"></i> <a href="/" class="btn btn-sm text-warning">Back</a>
                        </small>
                    <!-- End Of Back Button To Landing Page-->
                </div>
                <!-- End of Card Body -->
            </div>
        <!-- Card: Registration Form Card -->
    </body>
</html>