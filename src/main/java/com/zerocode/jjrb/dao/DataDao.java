package com.zerocode.jjrb.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


import com.zerocode.jjrb.bean.dataInfo;
import com.zerocode.jjrb.bean.dataSetInfo;
import com.zerocode.jjrb.bean.data_Indicator;
import com.zerocode.jjrb.utils.mysqlconnection;

@Component
public class DataDao extends mysqlconnection{
/**
 * 
 * @������: findData
 * @����: ��ѯ ָ��
 * @����:lhs
 * @param id
 * @return
 * @���� 2018��3��27�� ����1:38:42
 * @����ֵ: ArrayList<dataInfo>
 * @�޸���:
 * @�޸�ʱ��:
 */
	public ArrayList<dataInfo> findData(String id) {
		System.out.println(id);
	         String sql="select country_NAME,indicator_NAME,data_YEAR,data_VALUE from data_data join data_indicator on "
	         		+ " data_data.indicator_ID=data_indicator.indicator_ID join data_country ON "
	         		+ "data_country.country_ID=data_data.country_ID WHERE "
	         		+ " data_indicator.indicator_ID='"+id+"'";
            try {
				stat=connection.prepareStatement(sql);
				resultset=stat.executeQuery();
				ArrayList<dataInfo> dataInfolist=new ArrayList<dataInfo>();
				
				while(resultset!=null&&resultset.next()){
		                  dataInfo dataInfo=new dataInfo();
		                  dataInfo.setCountry_NAME(resultset.getString(1));
		                  dataInfo.setIndicator_NAME(resultset.getString(2));
		                  dataInfo.setData_YEAR(resultset.getString(3));
		                  dataInfo.setData_VALUE(resultset.getString(4));
		                  dataInfolist.add(dataInfo);
				}
				return dataInfolist;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
		return null;
	}

public dataSetInfo<data_Indicator> findCountI(String pram) {
	        String sql="SELECT  count(distinct data_data.indicator_ID) from data_data inner join data_country on data_data.country_ID=data_country.country_ID where data_country.country_NAME='"+pram+"'";

	        int count=0;
	        try{
	        stat=connection.prepareStatement(sql);
	        resultset=stat.executeQuery();
	        while(resultset!=null&&resultset.next()){
	        	count=resultset.getInt(1);
	        	System.out.println(count);
	        }
	        
	       dataSetInfo<data_Indicator> dataSetInfo=new dataSetInfo<data_Indicator>();
	       if(count!=0){
	    	String counts=String.valueOf(count);
	       dataSetInfo.setCode(200);
	       dataSetInfo.setData(counts);
	       dataSetInfo.setMessage("��ѯ�ɹ�");
	       dataSetInfo.setInfos(null);
	       System.out.println(dataSetInfo.getData());
	       return dataSetInfo;
	       }
	       else{
	           dataSetInfo.setCode(404);
		       dataSetInfo.setMessage("��ѯʧ��");
		       return dataSetInfo;
	       }
	        }
	        catch(SQLException e){
	        	e.printStackTrace();
	        }
			return null;
}

public dataSetInfo<data_Indicator> findCount(String pram) {
	String sql="";
	return null;
}



}
