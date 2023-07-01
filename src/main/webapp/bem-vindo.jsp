<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Bem vindo</title>
</head>
<body>
	<h1>
		Bem vindo,
		<s:property value="#session.nome" />
	</h1>
</body>
</html>