<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring Page Redirection 3 - Index</title>
</head>
<body>
	<h2>SPKs Spring Page Redirection</h2>
	<p>Dude click below button to redirect the result to new page</p>
	<form:form method="GET" action="/SpringWebMVCPageRe3/redirect">
		<table>
			<tr>
				<td><input type="submit" value="Redirect Page" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>