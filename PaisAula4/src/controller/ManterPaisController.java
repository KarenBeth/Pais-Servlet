package controller;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.PaisService;
import model.Pais;



	
	@WebService("/ManterPais.do")
	public class ManterPaisController extends HttpServlet {
		
	private static final long serialVersionUID = 1L;

		
	/**
		 * 
	@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		
	 */
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
		
	}

		/**
		 * 
	@see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 
	*/
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	String pNome = request.getParameter("nome");
			
	long pPopulacao = request.getParameter("populacao");
			
	String pArea = request.getParameter("area");
		
		
			
	//instanciar o javabean
			
	Pais pais = new Pais();
		
		pais.setNome(pNome);
		
		pais.setPopulacao(pPopulacao);
			
	pais.setArea(Double.parseDouble(pArea));
		
		
		
		//instanciar o service
			
	PaisService cs = new PaisService();
		
		cs.criar(pais);
		
		pais = cs.carregar(pais.getId());
			
			
	PrintWriter out = response.getWriter();
			
	out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
			
	out.println(	"id: "+pais.getId()+"<br>");
			
	out.println(	"nome: "+pais.getNome()+"<br>");
		
		out.println(	"populacao: "+pais.getPopulacao()+"<br>");
		
		out.println(	"area: "+pais.getArea()+"<br>");
		 
	   out.println("</body></html>");
			
		
	}

	}


