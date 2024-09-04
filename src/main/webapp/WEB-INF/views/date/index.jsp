<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>誕生日情報計算ツール</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body class="text-center">
    <div class="container">
        <main>
            <div class="mt-5">
                <h1>誕生日情報計算ツール</h1>
            </div>

            <form class="row justify-content-center mt-5" action="/tools/date" method="get">
                <div class="col-sm-2 d-flex align-items-center">
                    <div class="w-75">
                        <input class="form-control form-control-sm" type="number" id="year" name="year" value="${param.year}" required min="1900" max="2100" />
                    </div>
                    <label class="form-label mb-0 ms-2" for="year">年</label>
                </div>

                <div class="col-sm-2 d-flex align-items-center">
                    <div class="w-75">
                        <input class="form-control form-control-sm" type="number" id="month" name="month" value="${param.month}" required min="1" max="12" />
                    </div>
                    <label class="form-label mb-0 ms-2" for="month">月</label>
                </div>

                <div class="col-sm-2 d-flex align-items-center">
                    <div class="w-75">
                        <input class="form-control form-control-sm" type="number" id="day" name="day" value="${param.day}" required min="1" max="31" />
                    </div>
                    <label class="form-label mb-0 ms-2" for="day">日</label>
                </div>

                <div class="col-sm-2 d-flex justify-content-center">
                    <input class="btn btn-sm btn-primary" type="submit" value="送信" />
                </div>
            </form>

            <c:if test="${bindingResult.hasErrors()}">
                <div class="mt-5 alert alert-danger">
                    <ul class="list-unstyled mb-0">
                        <c:forEach var="error" items="${bindingResult.allErrors}">
                            <li>・${error.defaultMessage}</li>
                        </c:forEach>
                    </ul>
                </div>
            </c:if>

            <c:if test="${not empty viewModel}">
                <table class="table mt-5">
                    <thead>
                    <tr>
                        <th scope="col">生まれてからの日数</th>
                        <th scope="col">星座</th>
                        <th scope="col">干支</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>${viewModel.daysFromBirth}日</td>
                        <td>${viewModel.constellation}</td>
                        <td>${viewModel.zodiac}</td>
                    </tr>
                    </tbody>
                </table>
            </c:if>
        </main>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
