package ie.gmit.ClubSports;




import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");//takes in email
		String password = request.getParameter("password");//takes in password
		String nextUrl = "/Profile.jsp";//might need to change it dynamically later
		email = "colmsEmail@email";
		password = "AssWord";
		int memId =4;
		
		Dao.getMemberByEmailAndPassword(email, password);//passes the two strings to dao method 
		//System.out.println(email + password + "this is from bean controller");//
	   // Dao.getMemberById(memId);
	//Dao.deleteMember(memId);
		
		
	request.getRequestDispatcher(nextUrl).forward(request, response);
		
	}
}


