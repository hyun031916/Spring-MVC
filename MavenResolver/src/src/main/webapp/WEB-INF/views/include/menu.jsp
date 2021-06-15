<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/main.css"/>
</head>
<body>
	<a href="/test1?a=100&b=200&c=300"/> | Get Test1	|</a>
	<a href="/test2?a=100&b=200&c=300&c=400&c=500"/>	Test2	|</a>
	<a href="/test3"> Test3 |</a>
	<a href="/test4?a=100&b=200">	Test4	|</a>
	<a href="/test5/1000/2000/3000">	@PathVariable	|</a>
	<a href="/test6?a=30&b=400&c=5000">	@RequestParam	|</a>
	<a href="/test7?a=300&b=400&c=500&c=400">	@RequestParam2	|</a>
	<a href="/test8?a=319&b=419&c=519">	@RequestParam3	|</a>
	<a href="/test9?a=319&b=419&c=519&c=400">	@RequestParam4	|</a>
</body>
</html>