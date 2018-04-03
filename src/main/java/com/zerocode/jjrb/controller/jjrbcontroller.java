package com.zerocode.jjrb.controller;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zerocode.jjrb.bean.Info;
import com.zerocode.jjrb.bean.dataClass;
import com.zerocode.jjrb.bean.dataInfo;
import com.zerocode.jjrb.bean.dataSetInfo;
import com.zerocode.jjrb.bean.data_Indicator;
import com.zerocode.jjrb.service.DataService;
import com.zerocode.jjrb.service.dataClassService;
import com.zerocode.jjrb.service.indicatorService;

/**
 * 
 * @����: jjrbcontroller
 * @����:  ָ����ƽӿ�
 * @����: lhs
 * @���� 2018��2��6�� ����10:10:03
 * @�޸���:
 * @�޸�ʱ��:
 */
@RestController
public class jjrbcontroller {
	@Resource
	private dataClassService dataClassService;
	@Resource
	private indicatorService indicatorService;
	@Resource
	private DataService dataservice;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String test(){
		return "haha";
	}
/**
 * 
 * @������: findtest
 * @����:����
 * @����:lhs
 * @return
 * @���� 2018��3��27�� ����1:48:07
 * @����ֵ: Info<dataClass>
 * @�޸���:
 * @�޸�ʱ��:
 */
@RequestMapping(value="/find")
public Info<dataClass> findtest(){
	
	return dataClassService.FindTest();	
}
@RequestMapping(value="/findindicator/{ID}",method=RequestMethod.GET)
public Info<data_Indicator> FindIncator(@PathVariable("ID") String id){
	System.out.println(id);
	return indicatorService.findindicator();	
}
@RequestMapping(value="/finddata/{indicatorid}",method=RequestMethod.GET)
public Info<dataInfo> FindData(@PathVariable("indicatorid") String id){
	System.out.println(id);
	return dataservice.findData(id);
}
@RequestMapping(value="/findfilter")
@ResponseBody
public ResponseEntity<String> findfileter(
		@RequestParam(name="id" ,required=false,defaultValue="") String id){
			return new ResponseEntity<String>(id+"asdf",HttpStatus.OK);
	
}
/**
 * 
 * @������: FindCount
 * @����:1.��ѯ���һ����������
 * @����:lhs
 * @param id
 * @param type ���͡�1������ң�2�������
 * @param pageNo ��ǰҳ
 * @param pageSize ÿҹ������
 * @return
 * @���� 2018��3��30�� ����4:52:00
 * @����ֵ: Info<data_Indicator>
 * @�޸���:
 * @�޸�ʱ��:
 */
@RequestMapping(value="/findCount/{pram}/{type}",method=RequestMethod.GET)
public dataSetInfo<data_Indicator> FindCount(@PathVariable("pram") String pram,@PathVariable("type") int type) {
	System.out.println(dataservice.findCount(pram,type).getMessage());
	return dataservice.findCount(pram,type);
}

@RequestMapping(value="/findlist/{pram}/{type}",method=RequestMethod.GET)
public dataSetInfo<data_Indicator> findList(@PathVariable("pram") String pram,@PathVariable("type") int type){
	return null;
	
}

}