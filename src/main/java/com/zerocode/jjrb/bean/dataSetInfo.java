package com.zerocode.jjrb.bean;

import java.util.List;

/**
 * 
 * @类名: dataSetInfo
 * @描述: 数据集
 * @作者: lhs
 * @日期 2018年3月30日 下午4:14:48
 * @修改人:
 * @修改时间:
 */
public class dataSetInfo<T>{
      @Override
	public String toString() {
		return "dataSetInfo [Code=" + Code + ", Message=" + Message + ", Data=" + Data + ", infos=" + infos + "]";
	}
	private int Code;
      private String Message;
      private String Data;
  	private List<T> infos;
  	private String[] DataSert[];
	public String[][] getDataSert() {
		return DataSert;
	}
	public void setDataSert(String[][] dataSert) {
		DataSert = dataSert;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public List<T> getInfos() {
		return infos;
	}
	public void setInfos(List<T> infos) {
		this.infos = infos;
	}
  	
}
