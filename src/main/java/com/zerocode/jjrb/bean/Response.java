package com.zerocode.jjrb.bean;
/**
 * 
 * @����: Response
 * @����:��Ӧ��Ϣ
 * @����: lhs
 * @���� 2018��2��27�� ����9:41:41
 * @�޸���:
 * @�޸�ʱ��:
 */
public class Response {
  private String responseMessage;

public String getResponseMessage() {
	return responseMessage;
}

public void setResponseMessage(String responseMessage) {
	this.responseMessage = responseMessage;
}
  public Response(String responseMessage){
	  this.responseMessage=responseMessage;
  }
}
