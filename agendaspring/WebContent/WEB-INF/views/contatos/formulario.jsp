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

	<form action="/agendaspring/contatos" method="post">
<!-- 		<input type="hidden" name="logica" value="AddAluno"> -->

		<div>
			<label>Nome: <input type="text" name="nome"></label>
		</div>
		<div>
			<label>Email: <input type="text" name="email"></label>
		</div>
		<div>
			<label>Endereço: <input type="text" name="endereco"></label>
		</div>
		<div>
			<label>Data de Nascimento: <input type="text" name="dataNascimento"></label>
		</div>
		<div>
			<input type="submit" value="Adicionar Contato">
		</div>
	</form>
</body>
</html>