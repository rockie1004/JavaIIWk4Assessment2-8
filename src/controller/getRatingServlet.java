package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DogRater;
/**
 * Servlet implementation class 
 */
@WebServlet("/getRatingServlet") 
public class getRatingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getRatingServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName = request.getParameter("name");
		
		DogRater userDog = new DogRater(userName);
		
		request.setAttribute("userDogRating", userDog);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
	}

}