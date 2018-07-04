package com.pablomonteserin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pablomonteserin.beans.TraductorEspanol;

public class Main3_conSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		ITraductor traductor = (ITraductor) context.getBean("traductor");
	
		
		traductor.traduceloPlease("hola");

	}

}
