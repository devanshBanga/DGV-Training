package com.training_dgv.spring_demo;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Staff {
	private String name;
public void print() {
	System.out.println("I am a teacher "+name);
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
