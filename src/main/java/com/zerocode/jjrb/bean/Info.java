package com.zerocode.jjrb.bean;

import java.util.List;

/**
 * 
 * @类名: Info
 * @描述: 指标的各种信息
 * @作者: lhs
 * @日期 2018年2月13日 下午10:57:32
 * @修改人:
 * @修改时间:
 */
  
public class Info<T> {
	private String status;
	private String request;
	private List<T> infos;
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public List<T> getInfos() {
		return infos;
	}
	public void setInfos(List<T> infos) {
		this.infos = infos;
	}
	

}
