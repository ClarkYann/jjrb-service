package com.zerocode.jjrb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zerocode.jjrb.bean.Info;
import com.zerocode.jjrb.dao.DataClassDao;
/**
 * 
 * @����: dataClassService
 * @����:
 * @����: lhs
 * @���� 2018��2��12�� ����10:47:35
 * @�޸���:
 * @�޸�ʱ��:
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
