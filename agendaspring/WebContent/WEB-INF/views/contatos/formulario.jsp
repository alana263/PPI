<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario</title>
</head>
<body>
	<h1>Página de formulário. Bem vindos(as)</h1>
	<h2>Preencha o formulário</h2>
	
	<form action="/agendaspring/contatos">
		Nome: <input type="text" name="nome">
		email: <input type="text" name="email">
		Endereço: <input type="text" name="endereco">
		<button type="submit">Adicionar</button>
		
	</form>
</body>
</html>