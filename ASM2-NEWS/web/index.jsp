<%-- 
    Document   : index
    Created on : Jan 18, 2019, 3:32:13 AM
    Author     : quanglinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>News Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h2>Dan Tri</h2>
                <form action="NewsList" method="GET" >
                    <input type="submit" value="getdata"/></br>
                </form>
            </div>
            <div class="row">
                <s:iterator value="newsList" var="news" >
                    <div class="col-md-6">
                        <h4><s:property value="title"/></h4>
                        <p><em><s:property value="description"/></em></p>
                        <p><small><s:property value="author"/></small></p><!-- null-->
                        <p><small><s:property value="pubDate"/></small></p>
                        <%--<s:property value="link"/>--%>
                    </div>
                </s:iterator>
            </div>
        </div>
        
        
    </body>
</html>
