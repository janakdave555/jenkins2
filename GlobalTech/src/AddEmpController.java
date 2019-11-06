
import gte.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddUserController
 */
@WebServlet("/AddEmpController")
public class AddEmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		int eid=Integer.parseInt(request.getParameter("eid"));
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String doj=request.getParameter("doj");
		String dept=request.getParameter("dept");
		
		EmpUser empu=new EmpUser();
		empu.setEid(eid);
		empu.setFname(fname);
		empu.setLname(lname);
		empu.setDoj(doj);
		empu.setDept(dept);
		
		EmpUserDAO userDao=new EmpUserDAO();
		String result=userDao.addEmpUser(empu);
		
		if(result.equals(Results.SUCCESS))
		{
			session.setAttribute("fname",empu.getFname());
			RequestDispatcher rd=request.getRequestDispatcher("/userSuccess.jsp");
			rd.forward(request, response);
		}
		
	}

}
