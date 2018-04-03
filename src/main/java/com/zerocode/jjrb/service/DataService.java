package com.zerocode.jjrb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zerocode.jjrb.bean.Info;
import com.zerocode.jjrb.bean.dataInfo;
import com.zerocode.jjrb.bean.dataSetInfo;
import com.zerocode.jjrb.bean.data_Indicator;
import com.zerocode.jjrb.dao.DataDao;
/**
 * 
 * @����: DataService
 * @����:
 * @����: lhs
 * @���� 2018��2��22�� ����10:20:52
 * @�޸���:
 * @�޸�ʱ��:
 */
@Service
public class DataService {
@Resource
        private DataDao datadao;
	public Info<dataInfo> findData(String id) {
	   Info<dataInfo> info=new Info<dataInfo>();
	   info.setInfos(datadao.findData(id));
	   if(info.getInfos()==null){
		   info.setStatus("error");
		  return info;
		  
	   }
	   else{
		   info.setStatus("ok");
		   return info;
	   }
	            
	}
	public  dataSetInfo<data_Indicator> findCount(String pram, int type) {
		 if(type==1)
			 return datadao.findCountI(pram);
		 else
			 return datadao.findCount(pram);
	}
}