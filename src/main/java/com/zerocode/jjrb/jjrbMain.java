package com.zerocode.jjrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

/**
 * 
 * @类名: jjrbMain
 * @描述: 项目仅供参考，具体类，具体接口，按照接口文档
 * 项目主要以接口方式传递数据。项目框架选型仅供参考
 * @作者: lhs
 * @日期 2018年3月27日 上午9:18:52
 * @修改人:
 * @修改时间:
 */


@SpringBootApplication
public class jjrbMain  extends SpringBootServletInitializer{

	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(jjrbMain.class);
	       
	    }
	  public static void main(String[] args) {
		  SpringApplication.run(jjrbMain.class, args);
	}
}
