package com.zerocode.jjrb.bean;

import java.util.List;

/**
 * 
 * @����: Info
 * @����: ָ��ĸ�����Ϣ
 * @����: lhs
 * @���� 2018��2��13�� ����10:57:32
 * @�޸���:
 * @�޸�ʱ��:
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
