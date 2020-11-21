package co.ufps.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.ufps.edu.dao.HeroeDao;
import co.ufps.edu.model.Heroe;


/**
 * Servlet implementation class HeroeController
 */
@WebServlet("/Heroe")
public class HeroeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeroeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
			switch(action) {
			case "new":
				showNewForm(request, response);
				break;
			case "insert":
				insertarHeroe(request, response);
				break;
			case "delete":
				eliminarHeroe(request, response);
				break;
			case "edit":
				showEditHeroe(request, response);
				break;
			case "update":
				actualizarHeroe(request, response);
				break;
			case "buscar":
				buscarHeroe(request, response);
				break;	
			default:
				listHeroe(request,response);	
					
			}
			
	}

	private void listHeroe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HeroeDao eDao = new HeroeDao();
		request.setAttribute("heroes", eDao.list());
		RequestDispatcher dispatcher = request.getRequestDispatcher("listHeroes.jsp");
		dispatcher.forward(request, response);
		
	}

	private void buscarHeroe(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void actualizarHeroe(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void showEditHeroe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		HeroeDao eDao=new HeroeDao();
		Heroe e =eDao.find(id);
		
		request.setAttribute("heroe", e);
		RequestDispatcher dispatcher = request.getRequestDispatcher("heroeForm.jsp");
		dispatcher.forward(request, response);
		
	}

	private void eliminarHeroe(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void insertarHeroe(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inserta");
		RequestDispatcher dispatcher = request.getRequestDispatcher("heroeForm.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
