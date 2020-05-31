<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionnaire</title>
    <meta charset="utf-8">
</head>
<body>
<form method="POST" action="/questionnaire">
    <p>Сколько вам лет?</p>
    <p>
        <input type="radio" name="answer1" value="1">14-21<br>
        <input type="radio" name="answer2" value="1">22-30<br>
        <input type="radio" name="answer3" value="1">31-40<br>
        <input type="radio" name="answer4" value="1">41-100<br>
    </p>
    <p>
        <input type="submit" value="Получить статистику">
    </p>
</form>

</body>
</html>