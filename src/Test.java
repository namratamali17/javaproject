import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    try {
    	// load class drivers
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	//create connections
    	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
    	//create statement
    	Statement st =con.createStatement();
    	//execute query
    	ResultSet rs =st.executeQuery("select * from register");
    	 while (rs.next()) 
    	 {
			String name1=rs.getString("name");
			System.out.println(name1);
			String email1=rs.getString("email");
			System.out.println(email1);
			
    		 
		}
    	rs.close();
    	st.close();
    	con.close();
    	 
    	
	} 
    
    catch (Exception e)
     {
		// TODO: handle exception
		e.printStackTrace();
	}	
		
		
		
		
		
		
		
	}

}
