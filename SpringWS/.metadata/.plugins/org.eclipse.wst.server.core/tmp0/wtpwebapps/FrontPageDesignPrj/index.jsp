<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="mystyle.css" rel="stylesheet" type="text/css" />

    </head>
<body>
        <!-- Defining the header section of the page -->
        <div id="header">
            <div id="header1">
        <jsp:include page="header.jsp"></jsp:include> 
             </div>
        </div>

        <div id="leftcol">
<a href="login.jsp">Login</a><br/><br/>
<a href="signup.jsp">SignUp</a>


        </div>

        <div id="rightcol"><%
   // Set refresh, autoload time as 1 seconds
   response.setIntHeader("Refresh", 59);
   // Get current time
   Calendar calendar = new GregorianCalendar();
   String am_pm;
   int hour = calendar.get(Calendar.HOUR);
   int minute = calendar.get(Calendar.MINUTE);
   int second = calendar.get(Calendar.SECOND);
   if(calendar.get(Calendar.AM_PM) == 0)
      am_pm = "AM";
   else
      am_pm = "PM";
   String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
   out.println( CT );
%></div>

       <div id="content">

<!--LOGIN AND REGISTER CODE:-->

<form action="login.jsp" method="POST">
                <section id="login"><!-- login form -->

                    <table align="right" cellspacing="0">
                        <tr>
                            <td class="t">
                                <label for="email">Email</label>
                            </td>
                            <td class="t">
                                <label for="pass">Password</label>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="text" tabindex="1" value="" id="email" name="email">
                            </td>
                            <td>
                                <input type="password" tabindex="2" id="pass" name="pass">
                            </td>
                            <td>
                                <label for="login_btn" class="login_btn">
                                    <input type="submit" id="login_btn" tabindex="4" value="Log In">
                                </label>                        
                            </td>
                        </tr>
                        <tr>
                            <td>

                            </td>
                            <td class="b">
                                <a rel="nofollow" href="#">Forgot your password?</a>
                            </td>
                        </tr>

                    </table>

                </section>
            </form>
            <form action="reg.jsp" method="post">
                <table align="right">
                    <tr>
                        <td height="0">

                        </td>
                    </tr>
                    <tr>
                        <td> 
                            <img src="images/signup.png"  />
                        </td>
                    </tr>

                    <tr>
                        <td height="20">

                        </td>
                    </tr>

                    <tr>
                        <td>
                            Email:</td><td> <input type="text" name="emailid" value=""   maxlength=125 /><br></td>
                        <td width="50"></td>
                    </tr><br>
                    <tr>
                        <td height="10">

                        </td>
                    </tr>

                    <tr>
                        <td>

                            Password:</td><td> <input type="password" name="pass1" value=""   maxlength=10 /><br></td>
                    </tr><br>
                    <tr>
                        <td height="10">

                        </td>
                    </tr>
                    <tr>
                        <td>
                            Confirm Password:</td><td> <input type="password" name="pass2" value=""   maxlength=10 /><br></td>
                    </tr><br>
                    <tr>
                        <td height="10">

                        </td>
                    </tr>
                    <tr>
                        <td>
                            First Name:</td><td> <input type="text" name="fstname" value="" maxlength="10" /><br></td>
                    </tr><br>
                    <tr>
                        <td height="10">

                        </td>
                    </tr>
                    <tr>
                        <td>
                            Last Name:</td><td><input type="text" name="lstname" value="" maxlength="10" /><br></td>
                    </tr><br>
                    <tr>
                        <td height="10">

                        </td>
                    </tr>
                    <tr>
                        <td>
                            Phone Number:</td><td><input type="text" name="number" value="" maxlength="10" /><br></td>
                    </tr><br>
                    <tr>
                        <td height="5">

                        </td>
                    </tr>
                    <tr>
                        <td>
                        </td><td><input type="submit" name="register" value="Register"/></td>
                    </tr>
                </table>
            </form>
        </div>

<div id="footer">
            <div class="wrap">
                Footer Section
            </div>
        </div>
    </body>
</html>