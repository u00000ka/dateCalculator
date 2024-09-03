<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>誕生日情報</title>
</head>
<body>
<h1>誕生日情報計算フォーム</h1>
<form action="/tools/date" method="get" >
    <c:if test="${bindingResult.hasErrors()}">
        <div style="color: red;">
            <c:forEach var="error" items="${bindingResult.allErrors}">
                <p>${error.defaultMessage}</p>
            </c:forEach>
        </div>
    </c:if>
    <label for="year">年:</label>
    <input type="number" id="year" name="year" value="${param.year}" required />
    <br/>
    <label for="month">月:</label>
    <input type="number" id="month" name="month" value="${param.month}" required />
    <br/>
    <label for="day">日:</label>
    <input type="number" id="day" name="day" value="${param.day}" required />
    <br/>
    <input type="submit" value="送信" />
</form>

<c:if test="${not empty viewModel}">
    <c:if test="${not empty viewModel.daysFromBirth}">
        <h2>生まれてからの日数</h2>
        <p>${viewModel.daysFromBirth}日</p>
    </c:if>

    <c:if test="${not empty viewModel.constellation}">
        <h2>星座</h2>
        <p>${viewModel.constellation}</p>
    </c:if>

    <c:if test="${not empty viewModel.zodiac}">
        <h2>干支</h2>
        <p>${viewModel.zodiac}</p>
    </c:if>
</c:if>
</body>
</html>
