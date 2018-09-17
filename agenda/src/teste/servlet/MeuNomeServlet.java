package teste.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/informacoes")
public class MeuNomeServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Nome: Alana</h1>");
		out.println("<h1>Idade: 17 anos</h1>");
		out.println("<h1>Email: alanasato@email.com</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
