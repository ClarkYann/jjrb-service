package com.zerocode.jjrb.bean;
/**
 * 
 * @����: data_Country
 * @����:����
 * @����: lhs
 * @���� 2018��2��22�� ����9:42:15
 * @�޸���:
 * @�޸�ʱ��:
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
