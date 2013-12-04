package ie.gmit.ClubSports;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewMemberController
 */
@WebServlet("/NewMemberController")
public class NewMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String town = request.getParameter("town");
		String county = request.getParameter("county");
		String mobile = request.getParameter("mobile");
		String title = request.getParameter("title");
		String dob = request.getParameter("dob");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		String memId = request.getParameter("memId");
		
//		startDate = "010114";
//		dob = "270482";
//		title = "mr";
//		mobile = "0861686313";
//		county = "mayoo";
//		town ="castlebar";
//		address = "50 Rossmor";
//		lastName = "Govin";
//		firstName = "Colm";
//		password = "AssWord";
//		email = "anyEmail.com";
//		endDate ="31122014";
//		memId = "2";
		
       

		String nextUrl = "/Profile.jsp";
		
		Member member= new Member(0, startDate, dob, title, mobile, county, town, address, lastName, firstName, password, email, endDate);
		//Dao.CreateTable();
		
		
		Dao.addMember(member);
	


	request.getRequestDispatcher(nextUrl).forward(request, response);

}
}