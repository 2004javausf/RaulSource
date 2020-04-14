package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
// single comment
/*
 * Multiline
 * COmment
 * WORA 
 * Write once run anywhere
 * 
 * JVM - COnverts compiled java code into machine code that your porcessor can understand, provides portabilty
 * 
 * JRE - JVM + libraries, everything that we need to run java
 * 
 * JDK - Java Development Kit
 * Contains JVM + JRE, Compiler, etc everythjing we need to write Java
 * states - fields, atrributes
 * classes - blue print for objects
 * objects have states and behaviors
 * */

public static void main (String[]args) {
	// public -access modifier, everything can access it
	//static - do not need to instantiate to use
	//void - does not return anything
	//String [] args - parameters used for this method
	System.out.println("Roll Tide");
	
	Human h = new Human();
	h.name = "Paul";
	System.out.println(h);
	h.setName("Paul");
	h.setAge(34);
	h.setWeight(234);
	System.out.println(h.getname());
}
	
	
	
	
	
}
