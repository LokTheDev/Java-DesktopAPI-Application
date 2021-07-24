import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.InsertStatement;

import java.sql.*;

public class ConnectDBTEST {

	
	public void ConnectDB() {
		String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
		String username = "root";
		String password = "password";
		
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("connected to the database!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops, error!");
			e.printStackTrace();
			
			
		}
	
		try{Connection connection = DriverManager.getConnection(url, username, password );
		Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery("SELECT * FROM mydb.bookingTable");
		int bookingId =0;
		String name="";
		int phonenumber=0;
		int bknumber=0;
		String time="";
		String day="";
		System.out.println("Id\tName\tPhonenumber\tbkingnumber\tday\ttime");
		while(results.next()){bookingId = results.getInt("bookingId");
		name = results.getString("name");
		phonenumber = results.getInt("phonenumber");
		bknumber = results.getInt("bknumber");
		time = results.getString("time");
		day = results.getString("day");
		System.out.println(bookingId+"\t"+name+"\t"+phonenumber+"\t"+bknumber+"\t"+day+"\t"+time);}
		results.close();
		statement.close();
		connection.close();
		}
		catch(SQLException e) {e.printStackTrace();
		}
		
		
		
	}	
	
	
	
	public void SendInfo(int _bookingID, String _name, int _phonenumber, int _bknumber, String _time, String _day) {
		
		String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
		String username = "root";
		String password = "password";
		
		//try >> server delay...
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement stmt = connection.createStatement();
			stmt.executeUpdate("INSERT INTO mydb.bookingTable "+" VALUES(NULL,'"+ _name +"',"+ _phonenumber+","+_bknumber+",'"+_day+"','"+_time+"')");
			System.out.println("Database Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops, error!(2)");
			e.printStackTrace();
			
			
		}
			
				
		}
	
}
