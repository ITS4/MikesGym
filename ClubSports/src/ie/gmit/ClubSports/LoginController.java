	package ie.gmit.ClubSports;




import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

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
		String passwordBeforeHash = request.getParameter("password");//takes in password
		String nextUrl = "/Profile.jsp";//might need to change it dynamically later

		String password = Hashesh.MD5(passwordBeforeHash);
		String adminEmail = "admin@email.com";
		String adminPassword ="123";
		
		if (email.equals(adminEmail) && adminPassword.equals(passwordBeforeHash) ){
			nextUrl = "/admin.jsp";
			request.getRequestDispatcher(nextUrl).forward(request, response);
			}else{

		if (email != null && password != null ) {
			Dao.getMemberByEmailAndPassword(email, password);//passes the two strings to dao method 

			List<Member> profileList = Dao.getMemberByEmailAndPassword(email, password);
			request.setAttribute("profileList", profileList);
			for (Member profileItem : profileList){
				System.out.println(profileItem);}
				request.getRequestDispatcher(nextUrl).forward(request, response);
			}else { 
				nextUrl = "/login.jsp";	
				request.getRequestDispatcher(nextUrl).forward(request, response);
				}



		}
	}
}

