<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <title>404</title>
        <link href="<c:url value='/bootstrap-v5_3_0/css/bootstrap.min.css' />" rel="stylesheet">
    </head>
    <body>
        <div class="container text-center">
            <main>
                <div class="mt-5">
                    <h1>指定されたページは存在しません</h1>
                </div>
                <div class="mt-5">
                    <a href="/">ホームに戻る</a>
                </div>
            </main>
        </div>
        <script src="<c:url value='/bootstrap-v5_3_0/js/bootstrap.bundle.min.js'>"></script>
    </body>
</html>
