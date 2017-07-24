<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@page import="java.util.*" %>
 <html> <head> 
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSP Page</title> </head> <body> <br/><br/><br/><br/><br/>
   <center> <h2> <% String a=session.getAttribute("username").toString(); out.println("Hello "+a); %> 
   </h2> <br/> <br/> <br/>
   <%
   // Set refresh, autoload time as 1 seconds
   response.setIntHeader("Refresh", 1);
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
   out.println("Crrent Time: " + CT + "\n");
%>
<br/> <br/> <br/> 
   <a href="Logout.jsp">Logout</a> </center> </body> </html>

