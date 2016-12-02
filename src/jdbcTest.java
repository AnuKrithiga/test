import java.sql.*; 
public class jdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/anu","root","aaaa");  
			Statement stmt=con.createStatement();  
			
			ResultSet rs=stmt.executeQuery("select * from example");  
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
