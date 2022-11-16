package com.training_dgv.spring_demo;

import org.springframework.stereotype.Component;

@Component
public class Peon implements Staff{
public void print() {
	System.out.println("I am peon");
}
}
