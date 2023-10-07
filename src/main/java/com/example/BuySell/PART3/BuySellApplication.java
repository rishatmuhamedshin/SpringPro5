package com.example.BuySell.PART3;

import org.springframework.context.support.GenericXmlApplicationContext;


public class BuySellApplication {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("app-context-xml.xml");
		InjectSimple injectSimple = (InjectSimple)ctx.getBean("InjectSimple");
		System.out.println(injectSimple);
		ctx.close();
	}


}
