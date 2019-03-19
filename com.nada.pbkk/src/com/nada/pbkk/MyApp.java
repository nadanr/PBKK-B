package com.nada.pbkk;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) throws BeansException {
		// TODO Auto-generated method stub
//		Kelas K = new Kelas("IPA-1", 3, 2, 2, 1);
//		
//		System.out.println(K.getIdKelas());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}

}
