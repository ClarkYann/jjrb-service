package com.zerocode.jjrb.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.zerocode.jjrb.utils.mysqlconnection;
@Component
public class testDao  extends mysqlconnection{

	public String ll(String ll){
		String sql="insert into test values('"+ll+"')";
		try {
			stat=connection.prepareStatement(sql);
			int i=0; 
			i=stat.executeUpdate();
			if(i!=0){
				return "success";
			}
			else{
				return "error";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "error";
	}
	
	
	
}
