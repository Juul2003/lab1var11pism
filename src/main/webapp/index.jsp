<%@ page import="java.util.*, java.text.*" %>
<%@ page contentType="text/html; charset=utf-8" %>
<html lang="ru">
<head>
    <title>
        Таблица пользователей
    </title>
</head>

<body>


    <h2>Температура</h2>
    <%-- Форма заполнения данных --%>
    <FORM name="form1" method="post" action="FirstServlet">
        Задайте температуру: <INPUT type="text" name="temperature" size="30" maxlength="30"><BR> <BR>

        <INPUT type="submit" name="submit" value="Добавить"><BR>
    </FORM>



</body>
</html>