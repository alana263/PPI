<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="CSS/css.css">
<title>Lista de contatos</title>

</head>
<body>
	<table border=1>
		<thead>
			<tr>
				<th>Nome:</th>
				<th>Email:</th>
				<th>Endere�o:</th>
				<th>Data de Nascimento</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="contato" items="${contatos }">

				
				<tr>

					<td>${contato.nome}</td>
					<td><c:choose>
					<c:when test="${not empty contato.email }">
						<a href="mailto:${contato.email }">${contato.email }</a>
					</c:when>
					<c:otherwise>
						Email n�o informado
					</c:otherwise>
				</c:choose></td>
					<td>${contato.endereco }</td>
					<td>${contato.dataNascimento.time }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>