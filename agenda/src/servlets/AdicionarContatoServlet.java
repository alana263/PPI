package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDAO;
import models.Contato;

@WebServlet("/adicionarContato")
public class AdicionarContatoServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");
		String dataTexto = req.getParameter("dataTexto");
		
		Calendar dataFinal = null;
		try {
			Date dataProvisoria = new SimpleDateFormat("dd/MM/yyyy").parse(dataTexto);
			dataFinal = Calendar.getInstance();
			dataFinal.setTime(dataProvisoria);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataFinal);
		
		ContatoDAO dao = new ContatoDAO();
		dao.inserir(contato);
		
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>O nome do contato é: "+nome+"</h1>");
		out.println("<h1>O email do contato é: "+email+"</h1>");
		out.println("<h1>O endereco do contato é: "+endereco+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
