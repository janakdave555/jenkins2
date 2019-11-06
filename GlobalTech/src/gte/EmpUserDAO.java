package gte;
import java.sql.*;
import java.util.ArrayList;

public class EmpUserDAO {
	DatabaseConnector db=new DatabaseConnector();


public String addEmpUser(EmpUser empu)
{
	String result="";
	try
	{
		String query="Insert into empglobal values(?,?,?,?,?)";
		PreparedStatement pstmt=db.getPreparedStatement(query);
		pstmt.setInt(1, empu.getEid());
		pstmt.setString(2,empu.getFname());
		pstmt.setString(3,empu.getLname());
		pstmt.setString(4,empu.getDoj());
		pstmt.setString(5,empu.getDept());
		
	int i=pstmt.executeUpdate();
	
	if(i==1)
	{
		result=Results.SUCCESS;
	}
	else
	{
		result=Results.FAILURE;

		
	}
}

catch(Exception e)
	{
	 e.printStackTrace();	
	result=Results.PROBLEM;

	}

	finally
	{
		db.closeConnection();
	}

	return result;
}

public String deleteEmpUser(EmpUser empu)
{
	String result="";
	
	try
	{
		String query="delete from empglobal where eid=?";;
		PreparedStatement pstmt=db.getPreparedStatement(query);
		pstmt.setInt(1,empu.getEid());
		
		int i=pstmt.executeUpdate();
		
		if(i==1)
		{
			result=Results.SUCCESS;
		}
		else
		{
			result=Results.FAILURE;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		result=Results.PROBLEM;
	}
	finally
	{
		db.closeConnection();
	}
	
	return result;
}


public ArrayList<EmpUser> getAllUsers()
{
	ArrayList<EmpUser> list=new ArrayList<>();
	
	
	try
	{
		String query="Select * from empglobal";
		ResultSet rs=db.getResultSet(query);
		while(rs.next())
		{
			EmpUser empu=new EmpUser();
			empu.setEid(rs.getInt("eid"));
			empu.setFname(rs.getString("fname"));
			empu.setLname(rs.getString("lname"));
			empu.setDoj(rs.getString("doj"));
			empu.setDept(rs.getString("dept"));
			
			list.add(empu);
		}
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	
	}
	finally
	{
		db.closeConnection();
	}
	
	return  list;
}

}
