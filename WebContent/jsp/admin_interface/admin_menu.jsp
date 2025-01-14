<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="menu_template.jsp" />
<jsp:include page="footer.jsp" />
<style>
/* Общие стили для страницы */
body {
	margin: 0;
	padding: 0;
	min-height: 100vh;
	/* Минимальная высота равная высоте видимой области экрана (100% высоты) */
}
/* Стили для меню */
ul.menu {
	list-style-type: none;
	padding: 0;
	background-color: #333;
	position: fixed; /* Фиксированное позиционирование */
	width: 100%;
	top: 0; /* Расположение вверху страницы */
}

ul.menu li {
	display: inline-block; /* Пункты меню в одной строке */
}

ul.menu li a {
	display: block;
	color: #fff;
	text-decoration: none;
	padding: 10px 20px;
}

ul.menu li a:hover {
	background-color: #7DA980;
}

/* Пространство для контента */
.content {
	margin-top: 50px; /* Отступ, чтобы контент не перекрывал меню */
	padding: 20px;
}

footer {
	position: absolute;
	bottom: 0;
	text-align: center; /* Выравниваем текст по центру */
	padding: 10px 0; /* Внутренние отступы сверху и снизу */
	background-color: #333; /* Цвет фона футера */
	color: #fff; /* Цвет текста футера */
	width: 100%;
}
</style>
</head>


</body>
</html>