<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/17/2023
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <title>Title</title>
    <script>
        $(document).ready(function ()
            {
                $("#id").change(function (){
                    $.ajax(
                        {
                            url:'validateEmail',
                            data:{
                                id:$("#id").val()
                             },
                            success:function (responseText){
                                    $("#errMsg").text(responseText);
                                   if (responseText!="")
                                   {
                                       $("#id").focus();
                                   }
                            }

                        });
                });
            });
    </script>
</head>
<body>
<form action="registerUser" method="post">
    <pre>
        Id:<input type="text" name="id" id="id"><span>id="errMsg"</span>
        Name:<input type="text" name="name">
        Email:<input type="text" name="email">
        <input type="submit" name="register">
    </pre>
</form>
<br/>${result}
</body>
</html>
