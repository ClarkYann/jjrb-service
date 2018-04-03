package com.zerocode.jjrb.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.zerocode.jjrb.bean.data_Indicator;
import com.zerocode.jjrb.utils.mysqlconnection;
/**
 * 
 * @����: indicatorDao
 * @����:
 * @����: lhs
 * @���� 2018��2��22�� ����10:10:32
 * @�޸���:
 * @�޸�ʱ��:
 */
@Component
public class indicatorDao extends mysqlconnection {

	public ArrayList<data_Indicator> findindicator() {
	String sql="select * from data_indicator";
	try {
		stat=connection.prepareStatement(sql);
		resultset=stat.executeQuery();
		ArrayList<data_Indicator>  Indicatorlist=new ArrayList<data_Indicator>();
		
		while(resultset!=null&&resultset.next())
		{
			data_Indicator dataIndicator=new data_Indicator();
			dataIndicator.setClass_ID(resultset.getString(4));
			dataIndicator.setIndicator_Name(resultset.getString(2));
			dataIndicator.setIndicator_DESC(resultset.getString(3));
			dataIndicator.setIndicator_ID(resultset.getString(1));
			Indicatorlist.add(dataIndicator);
			
			
		}
		return Indicatorlist;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		return null;
	}

}
