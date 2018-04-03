package com.zerocode.jjrb.bean;
/**
 * 
 * @类名: dataData
 * @描述: 国际数据实体类
 * @作者: lhs
 * @日期 2018年2月22日 上午9:31:42
 * @修改人:
 * @修改时间:
 */
public class dataData {
private String Id;
private String Indicator_ID;
private String Country_ID;
private String Data_Year;
private String Data_Value;
private String Update_Data;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getIndicator_ID() {
	return Indicator_ID;
}
public void setIndicator_ID(String indicator_ID) {
	Indicator_ID = indicator_ID;
}
public String getCountry_ID() {
	return Country_ID;
}
public void setCountry_ID(String country_ID) {
	Country_ID = country_ID;
}
public String getData_Year() {
	return Data_Year;
}
public void setData_Year(String data_Year) {
	Data_Year = data_Year;
}
public String getData_Value() {
	return Data_Value;
}
public void setData_Value(String data_Value) {
	Data_Value = data_Value;
}
public String getUpdate_Data() {
	return Update_Data;
}
public void setUpdate_Data(String update_Data) {
	Update_Data = update_Data;
}
@Override
public String toString() {
	return "dataData [Id=" + Id + ", Indicator_ID=" + Indicator_ID + ", Country_ID=" + Country_ID + ", Data_Year="
			+ Data_Year + ", Data_Value=" + Data_Value + ", Update_Data=" + Update_Data + "]";
}
public dataData(String id, String indicator_ID, String country_ID, String data_Year, String data_Value,
		String update_Data) {
	super();
	Id = id;
	Indicator_ID = indicator_ID;
	Country_ID = country_ID;
	Data_Year = data_Year;
	Data_Value = data_Value;
	Update_Data = update_Data;
}
public dataData(){}
}
