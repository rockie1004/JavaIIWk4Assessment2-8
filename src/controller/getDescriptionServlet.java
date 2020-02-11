package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DogRater;

/**
 * Servlet implementation class getDescriptionServlet
 */
@WebServlet(description = "takes activity and returns a description", urlPatterns = { "/getDescriptionServlet" })
public class getDescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDescriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userActivity = request.getParameter("activity");	
		
		DogRater userDogDescription = new DogRater();
		userDogDescription.setActivity(userActivity);
		request.setAttribute("userDogDescription", userDogDescription);
		getServletContext().getRequestDispatcher("/resultDesc.jsp").forward(request, response);
		
	}

}
