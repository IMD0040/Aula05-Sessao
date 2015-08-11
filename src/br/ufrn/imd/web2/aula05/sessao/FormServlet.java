package br.ufrn.imd.web2.aula05.sessao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String nome = request.getParameter("nome");
			if (nome == null || nome.trim().length() == 0) {
				nome = "Ninguém";
			}
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<thml>");
			out.println("<head><title>Test Formulario</title></head>");
			out.println("<body>");
			out.println("<h1>Dados do formulário:</h1><table border=\"1\">");
			out.println("<tr><th>Nome</th><td>" + nome + "</td></tr>");
			out.println("</table><br>");
			out.println("Ola " + nome + ", por favor clique <a href=\"SessaoServlet\">aqui</a>");
			out.println("</body></html>");
	}

}
