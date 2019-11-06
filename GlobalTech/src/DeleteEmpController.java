

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import gte.*;



@WebServlet("/DeleteEmpController")
public class DeleteEmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DeleteEmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int eid=Integer.parseInt(request.getParameter("eid"));
		
		EmpUser emp=new EmpUser();
		
		emp.setEid(eid);
		
		
		EmpUserDAO empu=new EmpUserDAO();
		String result1 =empu.deleteEmpUser(emp);
		
		if(result1.equals("success"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/DeleteSuccess.jsp");
			rd.forward(request, response);
		}
	}

	
}
