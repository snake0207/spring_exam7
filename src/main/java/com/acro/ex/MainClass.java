package com.acro.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cfg = "classpath:appCTX.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load(cfg);
		ctx.refresh();
		Student student = ctx.getBean("student", Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		
		ctx.close();
	}

}
