package com.zerocode.jjrb.bean;
/**
 * 
 * 
 * @����: dataClass
 * @����:
 * @����: lhs
 * @���� 2018��2��13�� ����10:18:50
 * @�޸���:
 * @�޸�ʱ��:
 */
public class dataClass {
 private String Class_Id;
 private String Class_Name;
 private String Class_type;
public String getClass_Id() {
	return Class_Id;
}
public void setClass_Id(String class_Id) {
	Class_Id = class_Id;
}
public String getClass_Name() {
	return Class_Name;
}
public void setClass_Name(String class_Name) {
	Class_Name = class_Name;
}
public String getClass_type() {
	return Class_type;
}
public void setClass_type(String class_type) {
	Class_type = class_type;
}
@Override
public String toString() {
	return "dataClass [Class_Id=" + Class_Id + ", Class_Name=" + Class_Name + ", Class_type=" + Class_type + "]";
}
 
}
