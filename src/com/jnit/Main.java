package com.jnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringJdbcConfiguration.class);
		
		SpringSelect x = (SpringSelect)appContext.getBean("jdbcobj");
		x.exampleSelect();
		

	}

}
