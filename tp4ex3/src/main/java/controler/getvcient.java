package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beanm.client;



/**
 * Servlet implementation class getvcient
 */
@WebServlet("/getvcient")
public class getvcient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getvcient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nom=request.getParameter("nom");
		String Prenom=request.getParameter("prenom");
		String Adresse=request.getParameter("adr");
		String email=request.getParameter("adre");
		
		int num=Integer.parseInt(request.getParameter("num"));	
		
	client	client =new client();
		
		
        client.setNom(nom);
        
		client.setPrenom(Prenom);
		client.setAdresse(Adresse);
		client.setTelephone(num);
		client.setAdresse_email(email);
		//System.out.println("  le nom est "+client.getNom()+"   le prenom est"+client.getPrenom());
		
		request.setAttribute("client",client);
		
		String page ="/aff.jsp";
		
	        this.getServletContext().getRequestDispatcher(page).forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
