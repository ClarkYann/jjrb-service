package com.zerocode.jjrb.service;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.zerocode.jjrb.bean.Info;
import com.zerocode.jjrb.bean.data_Indicator;
import com.zerocode.jjrb.dao.indicatorDao;
/**
 */
@Service
public class indicatorService {
@Resource
  private indicatorDao indicatorDao;
	public  Info<data_Indicator> findindicator() {
	     Info<data_Indicator> info=new Info<data_Indicator>();
	     info.setInfos(indicatorDao.findindicator());
	     if(info.getInfos()==null){
	    	 info.setStatus("error");
	    	 return info;
	     }
	     else{
	    	 info.setStatus("ok");
	    	 return info;
	     }
	}

}
