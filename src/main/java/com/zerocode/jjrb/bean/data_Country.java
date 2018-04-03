package com.zerocode.jjrb.bean;
/**
 * 
 * @类名: data_Country
 * @描述:国家
 * @作者: lhs
 * @日期 2018年2月22日 上午9:42:15
 * @修改人:
 * @修改时间:
 */
public class data_Country {
private String country_ID;
private String country_Name;
public String getCountry_ID() {
	return country_ID;
}
public void setCountry_ID(String country_ID) {
	this.country_ID = country_ID;
}
public String getCountry_Name() {
	return country_Name;
}
public void setCountry_Name(String country_Name) {
	this.country_Name = country_Name;
}
@Override
public String toString() {
	return "data_Country [country_ID=" + country_ID + ", country_Name=" + country_Name + "]";
}

}
