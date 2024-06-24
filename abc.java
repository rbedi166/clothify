import java.util.*;
import java.sql.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("Sun.Jdbc.Odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:dsn","","");
		}catch(Exception e1){System.out.println(""+e1);}
		System.out.print("connected");
}}