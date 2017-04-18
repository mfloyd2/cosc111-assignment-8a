<%-- 
    Document   : CalcCar.jsp
    Created on : Apr 4, 2017, 9:27:17 AM
    Author     : mochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="user" class="user.CarLoanData" scope="session"/>
<jsp:setProperty name="user" property="*"/> 
<HTML>
<BODY>
You entered<BR>
Car Price: $<%= user.getCarprice()%><BR>
Monthly Payment: <%= user.getMonthlyPayment()%><BR>
</BODY>
Yearly Amount Remaining: $<%
    double money = user.getCarprice();
    double monthly = user.getMonthlyPayment();
    double interest = user.getExpreturn()/100;
        for(int i = 1; i<=(user.getLoanlen()/12); i++)
        {
            for(int x = 1; x<= 12; x++)
            {
                money = (money- monthly) * (1+interest);
            }
            out.println("year "+i+": $"+ String.format("%.2f",money));
        } %>
</HTML>