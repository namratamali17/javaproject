import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args) throws SQLException 
	{
		// TODO Auto-generated method stub
		
		String url= "jdbc:mysql://localhost:3306/demo";
		Connection con=DriverManager.getConnection(url,"root","root");
		Statement st= con.createStatement();
		
		
		String query="insert into register values('prashant','pa@gmail.com','pune')";
		
		int rs= st.executeUpdate(query);
		System.out.println(rs);
		
	

	}

}
