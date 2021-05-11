package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import modele.beanndeux;

/**
 * Servlet implementation class servdeux
 */
@WebServlet("/servdeux")
public class servdeux extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servdeux() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess =request.getSession();
		beanndeux per=(beanndeux)sess.getAttribute("per");
		if(per==null) {
		String fullname=request.getParameter("p");
		String name=request.getParameter("n");
		per =new beanndeux();
		per.setPrenom(name);
		per.setNom(fullname);
		sess.setAttribute("per", per);
		}
		
		
		
		String page ="aff2.jsp";
		 RequestDispatcher dispInf=request.getRequestDispatcher(page) ;
	        dispInf.forward(request, response) ; 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
