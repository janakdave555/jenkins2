

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import gte.EmpUser;
import gte.EmpUserDAO;;

/**
 * Servlet implementation class FetchAllUsers
 */
@WebServlet("/FetchEmp")
public class FetchEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		EmpUserDAO userDao=new EmpUserDAO();
		ArrayList<EmpUser> list=userDao.getAllUsers();
		
		HttpSession session=request.getSession();
		session.setAttribute("userList",list);
		
		RequestDispatcher rd=request.getRequestDispatcher("/showAllEmpUser.jsp");
		rd.forward(request, response);
		
	}

}
