import java.beans.Statement;
import java.sql.Connection;

public class BookingInfo {
	private int bookingID;
	private String name;
	private int phonenumber;
	private int bknumber;
	private String time;
	private String day;

public void setBooking(int _bookingID, String _name, int _phonenumber, int _bknumber, String _time, String _day) {
	
	this.bookingID = _bookingID;
	this.name = _name;
	this.phonenumber = _phonenumber;
	this.bknumber = _bknumber;
	this.time = _time;
	this.day = _day;	
	
	System.out.println("Booking Record Updated");
	
	//TODO connect DB >>>send info to DBtest
	
	ConnectDBTEST connect= new ConnectDBTEST();
	connect.SendInfo(bookingID, name, phonenumber, bknumber, time, day);
	connect.ConnectDB();
	System.out.println("Current Booking.");
	
}




}