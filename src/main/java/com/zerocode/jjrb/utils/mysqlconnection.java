package com.zerocode.jjrb.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @����: mysqlconnection
 * @����:
 * @����: lhs
 * @���� 2018��2��12�� ����10:55:01
 * @�޸���:
 * @�޸�ʱ��:
 */
public   abstract class   mysqlconnection {
 static{
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
    public ResultSet resultset;
    public PreparedStatement stat;
    public static Connection connection;
	public final static String url="jdbc:mysql://192.168.3.241:3306/jjrb_data?useUnicode=true&characterEncoding=utf-8";
	public final static String user="root";
	public final static String password="123456";
	static{
	try {
		connection=DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
		

	
	
	
	public static void killCountion(Connection conn,Statement statement,ResultSet rs){  
		   try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
