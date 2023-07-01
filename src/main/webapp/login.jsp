<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
</head>
<body>
	<s:form action="login">
		<s:textfield name="nome" label="Nome" />
		<s:textfield name="senha" label="Senha" />
		<s:submit value="Login" />
	</s:form>
</body>
</html>
