package tp4ex2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import tp4ex2m.cl;

/**
 * Servlet implementation class servdeux
 */
@WebServlet("/servvv")
public class servvv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servvv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess =request.getSession();
		cl per=(cl)sess.getAttribute("per");
		if(per==null) {
		String fullname=request.getParameter("p");
		String name=request.getParameter("n");
		per =new cl();
		per.setPrenom(fullname);
		per.setNom(name);
		
		sess.setAttribute("per", per);
		}
		
		
		
		String page ="NewFile.jsp";
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
