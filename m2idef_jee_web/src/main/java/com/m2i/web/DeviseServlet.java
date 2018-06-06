package com.m2i.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m2i.service.IServiceDevise;

/**
 * Servlet implementation class DeviseServlet
 */
@WebServlet("/DeviseServlet")
public class DeviseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB //injection de dépendance (depuis EJB 3.0) equivalent de @Autowired de Spring
	private IServiceDevise serviceDevise;
     
	/*
    private void initialiserServiceDevise(){
    	try {
			InitialContext ctx = new InitialContext(); //JNDI
			this.serviceDevise = (IServiceDevise) 
					ctx.lookup( "java:app/m2idef_jee_ejb_impl/ServiceDeviseBean!com.m2i.service.IServiceDevise");
			System.out.println("serviceDevise="+serviceDevise);
		} catch (NamingException e) {
			e.printStackTrace();
		} 
    }*/
	
    public DeviseServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*if(this.serviceDevise==null) 
			initialiserServiceDevise();*/
		double montant = Double.parseDouble(request.getParameter("montant"));
		PrintWriter out = response.getWriter(); //objet technique pour générer réponse
		response.setContentType("text/html");
		out.println("<html><body>");
		//on délègue un traitement à l'ejb (accès local dans meme JVM/jboss)
		double res = this.serviceDevise.euroToFranc(montant);
		out.println("res="+res);
		
		out.println("listeDevises="+serviceDevise.rechercherListeDevise());
		
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
