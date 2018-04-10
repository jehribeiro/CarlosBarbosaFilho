<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	
		<form action="ContatoController" method="POST">
			Nome : <input id="nome" name="nome" type="text"/><br/>
			E-mail : <input id="email" name="email" type="text"/><br/>
			
			<input id="enviar" type="submit" value="Enviar" />
			<input id="enviar" type="reset" value="Limpar" />
		</form>
	</div>
</body>
</html>