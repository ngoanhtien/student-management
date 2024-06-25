package Implements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

import Interfaces.ConnectionPool;

public class ConnectionPoolImpl implements ConnectionPool{

	private String driver;
	private String url;
	private String userName;
	private String passWord;
	
	private Stack<Connection> Pool;
	
	
	public ConnectionPoolImpl() {
		this.driver = "com.mysql.cj.jdbc.Driver";
		try
		{
			Class.forName(this.driver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		this.url = "jdbc:mysql://localhost:3306/qlsv_test";
		
		this.userName = "root";
		this.passWord = "W7301@jqir#";
		
		this.Pool = new Stack<>();
	}

	@Override
	public Connection getConnection(String objectName) throws SQLException {
		if(this.Pool.isEmpty())
		{
			System.out.println(objectName + "have created a new Connection");
			return DriverManager.getConnection(url,userName,passWord);
		}
		else
		{
			System.out.println(objectName+" have popped the Connection");
			return this.Pool.pop();
		}
	}

	@Override
	public void releaseConnection(Connection con, String objectName) throws SQLException {
		System.out.println(objectName+" have pushed the Connecttion");
		this.Pool.push(con);
	}

	
	protected void finalize() throws Throwable
	{
		this.Pool.clear();
		this.Pool = null;
		System.out.println("Connecttion is closed");
	}

}
