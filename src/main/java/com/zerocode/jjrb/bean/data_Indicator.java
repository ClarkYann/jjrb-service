package com.zerocode.jjrb.bean;

/**
 * 
 * @����: data_Indicator
 * @����: ����ָ��
 * @����: lhs
 * @���� 2018��2��22�� ����9:37:18
 * @�޸���:
 * @�޸�ʱ��:
 */
public class data_Indicator {
	private String indicator_ID;
	private String indicator_Name;
	private String indicator_DESC;
	private String class_ID;
	public String getIndicator_ID() {
		return indicator_ID;
	}
	public void setIndicator_ID(String indicator_ID) {
		this.indicator_ID = indicator_ID;
	}
	public String getIndicator_Name() {
		return indicator_Name;
	}
	public void setIndicator_Name(String indicator_Name) {
		this.indicator_Name = indicator_Name;
	}
	public String getIndicator_DESC() {
		return indicator_DESC;
	}
	public void setIndicator_DESC(String indicator_DESC) {
		this.indicator_DESC = indicator_DESC;
	}
	public String getClass_ID() {
		return class_ID;
	}
	public void setClass_ID(String class_ID) {
		this.class_ID = class_ID;
	}
	@Override
	public String toString() {
		return "data_Indicator [indicator_ID=" + indicator_ID + ", indicator_Name=" + indicator_Name
				+ ", indicator_DESC=" + indicator_DESC + ", class_ID=" + class_ID + "]";
	}

}
