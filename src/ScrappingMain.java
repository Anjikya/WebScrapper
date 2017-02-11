import java.sql.*;
import java.util.*;
public class ScrappingMain {

	public static void main(String[] args)
	{
		ArrayList<String> colleges;
		ArrayList<String> deadlines;
		boolean bool=false;
		int rs;
		try{
			Connection connection=SQLConnection.getConnection();
			colleges=Colleges.getColleges();
			deadlines=Exp1.getDeadline();
			int size1=colleges.size();
			int size2=deadlines.size();
			if(colleges.size()+1==deadlines.size())
			{
				for(int i=0;i<colleges.size();i++)
				{
					PreparedStatement ps=connection.prepareStatement("insert into UniversityDeadline(id,University,Deadline) values(?,?,?)");
					ps.setString(1, "i+1");
					ps.setString(2, colleges.get(i));
					ps.setString(3,deadlines.get(i+1));
					rs=ps.executeUpdate();
					bool=rs>0?true:false;
				}
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("College deadlines update? "+bool);
	}
}
