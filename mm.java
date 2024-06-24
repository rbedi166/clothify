import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends Frame implements ActionListner{
	TextField TF1,TF2;
	Button B1;
	Main()
	{
		TF1=new TextField(10);
		TF2 = new TextField(10);
		B1 = new Button("Insert");
		SetSize(10,10);
		SetVisible(true);
	}
	public void actionPerformend(ActionEvent AE)
	{
		try
		{
			Class.forName("Sun.JdbcOc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:dsn","","");
		}catch(Exception e1){System.out.println(""+e1);}
		System.out.print("connected");
	}
	public static void main(String[] args) {
		Main M = new Main();
}
}