package com.zerocode.jjrb.bean;
/**
 * 
 * @类名: Response
 * @描述:相应信息
 * @作者: lhs
 * @日期 2018年2月27日 上午9:41:41
 * @修改人:
 * @修改时间:
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
