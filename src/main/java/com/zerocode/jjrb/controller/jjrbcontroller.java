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
 * @类名: jjrbcontroller
 * @描述:  指标控制接口
 * @作者: lhs
 * @日期 2018年2月6日 上午10:10:03
 * @修改人:
 * @修改时间:
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
 * @方法名: findtest
 * @描述:测试
 * @作者:lhs
 * @return
 * @日期 2018年3月27日 下午1:48:07
 * @返回值: Info<dataClass>
 * @修改人:
 * @修改时间:
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
 * @方法名: FindCount
 * @描述:1.查询国家或地区总条数
 * @作者:lhs
 * @param id
 * @param type 类型。1代表国家，2代表地区
 * @param pageNo 当前页
 * @param pageSize 每夜的条数
 * @return
 * @日期 2018年3月30日 下午4:52:00
 * @返回值: Info<data_Indicator>
 * @修改人:
 * @修改时间:
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