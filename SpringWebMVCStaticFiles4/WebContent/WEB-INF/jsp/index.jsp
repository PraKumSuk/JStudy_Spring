<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring Landing Page</title>
</head>
<body>
	<h2>SPK Spring Landing Page</h2>
	<p>Click below button to get a simple HTML page</p>
	<form:form method="GET" action="/SpringWebMVCStaticFiles4/staticPage">
		<table>
			<tr>
				<td><input type="submit" value="Get HTML Page" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>