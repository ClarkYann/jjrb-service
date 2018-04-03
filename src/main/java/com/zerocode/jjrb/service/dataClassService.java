package com.zerocode.jjrb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zerocode.jjrb.bean.Info;
import com.zerocode.jjrb.dao.DataClassDao;
/**
 * 
 * @类名: dataClassService
 * @描述:
 * @作者: lhs
 * @日期 2018年2月12日 下午10:47:35
 * @修改人:
 * @修改时间:
 */
@Service
public class dataClassService {
	@Resource
    private	DataClassDao  dataClassDao;
   public Info FindTest(){
	     Info info=new Info();
	            info.setInfos(dataClassDao.Findtest());
	            info.setStatus("ok");
	            return info;
	   
   }
}
