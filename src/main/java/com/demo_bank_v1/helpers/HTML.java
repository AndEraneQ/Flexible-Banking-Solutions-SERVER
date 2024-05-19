package com.demo_bank_v1.helpers;

public class HTML {

    public static String htmlEmailTemplate(String token, String code){
        // Verify Account Url
        String url = "http://127.0.0.1:5500/verify?token=" + token + "&code=" + code;

        String emailTemplate = "<!DOCTYPE html>\n" +
                "<html lang='en'>\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset='UTF-8'>\n" +
                "    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n" +
                "    <!-- <link rel='stylesheet' href='css/email.css'> -->\n" +
                "    <title>Email</title>\n" +
                "    <style>\n" +
                "        * {\n" +
                "            box-sizing: border-box;\n" +
                "            font-family: 'Times New Roman';\n" +
                "        }\n" +
                "\n" +
                "        html,\n" +
                "        body {\n" +
                "            height: 100%;\n" +
                "            margin: 0;\n" +
                "        }\n" +
                "\n" +
                "        /* Main Body Styling */\n" +
                "        body {\n" +
                "            background-color: rgb(183, 183, 209);\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "        }\n" +
                "\n" +
                "        /* <!-- Wrapper --> */\n" +
                "        .wrapper {\n" +
                "            width: 550px;\n" +
                "            height: auto;\n" +
                "            padding: 15px;\n" +
                "            background-color: white;\n" +
                "            border-radius: 7px;\n" +
                "        }\n" +
                "\n" +
                "        /* <!-- Email MSG Header --> */\n" +
                "\n" +
                "        .email-msg-header {\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        /* <!-- Company Name --> */\n" +
                "\n" +
                "        .company-name {\n" +
                "            width: 100%;\n" +
                "            font-size: 35px;\n" +
                "            color: gray;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        /* Welcome Text */\n" +
                "\n" +
                "        .welcome-text {\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "\n" +
                "        /* <!-- Verify Account Button --> */\n" +
                "        .verify-account-btn {\n" +
                "            padding: 15px;\n" +
                "            background-color: rgb(0, 132, 255);\n" +
                "            text-decoration: none;\n" +
                "            color: white;\n" +
                "            border-radius: 5px;\n" +
                "        }\n" +
                "\n" +
                "        /* <!-- Copy Right Wrapper --> */\n" +
                "        .copy-right {\n" +
                "            padding: 15px;\n" +
                "            color: gray;\n" +
                "            font-size: 14px;\n" +
                "            margin: 20px 0px;\n" +
                "            display: flex;\n" +
                "            align-items: center;\n" +
                "            justify-content: center;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "    <!-- Wrapper -->\n" +
                "    <div class='wrapper'>\n" +
                "\n" +
                "        <!-- Email MSG Header -->\n" +
                "        <h2 class='email-msg-header'>\n" +
                "            Welcome and Thank You for Choosing\n" +
                "            <br>\n" +
                "        </h2>\n" +
                "        <!-- End Of Email MSG Header -->\n" +
                "\n" +
                "        <!-- Company Name -->\n" +
                "        <div class='company-name'>\n" +
                "            Easy Way Bank\n" +
                "        </div>\n" +
                "        <!-- End Of Company Name -->\n" +
                "        <hr>\n" +
                "\n" +
                "        <!-- Welcome Text -->\n" +
                "        <p class='welcome-text'>\n" +
                "            Your Account has been successfully registered, please click below to veryfi your account\n" +
                "        </p>\n" +
                "        <!-- End Of Welcome Text -->\n" +
                "        <br>\n" +
                "        <br>\n" +
                "\n" +
                "        <!-- Verify Account Button -->\n" +
                "        <center><a href='" + url + "' class='verify-account-btn' role='button'>Verify Account</a></center>\n" +
                "        <!-- End Of Verify Account Button -->\n" +
                "\n" +
                "        <!-- Copy Right Wrapper -->\n" +
                "        <div class='copy-right'>\n" +
                "            &copy; Copy Right 2021. All Rights Reserved\n" +
                "        </div>\n" +
                "        <!-- End Of Copy Right Wrapper -->\n" +
                "\n" +
                "    </div>\n" +
                "    <!-- End of Wrapper -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>";
        return emailTemplate;
    }
}
