package com.jsp.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value(value = "1024")
	int emp_id;
	@Value(value = "XYZ")
	String name;
	@Value(value = "xyz@mail.com")
	String email;
	
	public void print() {
		System.out.println(emp_id);
		System.out.println(name);
		System.out.println(email);
		
	}

}
