package com.zerocode.jjrb.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zerocode.jjrb.bean.dataClass;
import com.zerocode.jjrb.utils.mysqlconnection;
/**
 * 
 * @����: DataClassDao
 * @����:
 * @����: lhs
 * @���� 2018��2��12�� ����10:47:23
 * @�޸���:
 * @�޸�ʱ��:
 */
@Component
public class DataClassDao  extends mysqlconnection{
	public ArrayList<dataClass> Findtest(){
		
		String sql="select * from data_class";
	 
		try {
			stat = connection.prepareStatement(sql);
			 resultset=stat.executeQuery();
			 ArrayList<dataClass> dataClassList=new ArrayList<dataClass>();
			 while(resultset!=null&&resultset.next()){
				dataClass dataclass=new dataClass();
				 dataclass.setClass_Id(resultset.getString(1));
				 dataclass.setClass_Name(resultset.getString(2));
				 dataclass.setClass_type(resultset.getString(3));
				 dataClassList.add(dataclass);
			 }
			 return dataClassList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}

}
