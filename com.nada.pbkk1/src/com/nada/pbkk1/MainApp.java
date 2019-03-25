package com.nada.pbkk1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		Kelas K = new Kelas("IPA-1", 3, 2, 2, 1);
//		
//		System.out.println(K.getIdKelas());
		
		
		/*
		 * ClassPathXmlApplicationContext context = new
		 * ClassPathXmlApplicationContext("appcontext.xml");
		 */
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RuangConfig.class);
		
		
		System.out.println("mulai xml");
		
		
		Ruang lab = context.getBean("lab", Ruang.class);
		System.out.println("---------------"); 
		/*
		 * System.out.println("kelas: " + ((Kelas)kelas).getVolume());
		 * System.out.println("kelas: " + ((Kelas)kelas).getArea());
		 */
		System.out.println("lab: " + ((Lab)lab).getIdLab());
		context.close();
		 
	}

}
