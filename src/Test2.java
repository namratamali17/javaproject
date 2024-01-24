import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);
		System.out.println("enter name");
		String name1=s.next();
		
		System.out.println("enter email..");
		String email1= s.next();
		
		System.out.println("enter address");
		String address1 =s.next();

			 try {
			    	// load class drivers
			    	Class.forName("com.mysql.cj.jdbc.Driver");
			    	
			    	//create connections
			    	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			    	//create statement
			    
			    	PreparedStatement ps =con.prepareStatement(" insert into register values(?,?,?)");
			    	ps.setString(1, name1);
			    	ps.setString(2, email1);	
			    	ps.setString(3, address1);
			    	
			    	int i=ps.executeUpdate();
			    	if(i>0)
			    	{
			    		System.out.println("value insert sucessffuly");
			    	}
			    	else {
						System.out.println("error");
					}
			 
			
	       	}
		
		
		
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
