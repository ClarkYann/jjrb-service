package com.zerocode.jjrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

/**
 * 
 * @����: jjrbMain
 * @����: ��Ŀ�����ο��������࣬����ӿڣ����սӿ��ĵ�
 * ��Ŀ��Ҫ�Խӿڷ�ʽ�������ݡ���Ŀ���ѡ�ͽ����ο�
 * @����: lhs
 * @���� 2018��3��27�� ����9:18:52
 * @�޸���:
 * @�޸�ʱ��:
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
