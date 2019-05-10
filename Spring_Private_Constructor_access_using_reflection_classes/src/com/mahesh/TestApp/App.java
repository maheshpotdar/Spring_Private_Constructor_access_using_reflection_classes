package com.mahesh.TestApp;

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;

public class App {

	public static void main(String[] args) {

		try {

			Class c1 = Class.forName("com.mahesh.model.Employee");
			Constructor[] constructor = c1.getDeclaredConstructors();
			constructor[0].setAccessible(true);
			constructor[0].newInstance(null);
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}
}
