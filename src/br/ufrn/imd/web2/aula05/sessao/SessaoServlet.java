package br.ufrn.imd.web2.aula05.sessao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessaoServlet
 */
@WebServlet("/SessaoServlet")
public class SessaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String nome = (String)session.getAttribute("nome.usuario");
		
		if (nome == null || nome.trim().length() == 0) {
			nome = "Intruso";
		}
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Recuperando da Sessão</title></head>");
		out.println("<body>"); 
		out.println("Obrigado por clicar, "	+ nome);
		out.println("</body></html>");

	}

}
