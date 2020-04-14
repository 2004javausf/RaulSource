package com.revature.beans;
//naming conventions
//Classes and Projects: {ascal casing, capitalize the first letter of each word ex. PRojectMayhem
//Methods and variables Camel casing, ex. firstSecondThirdFourth
//packages: lowercase and delimited by periods
//constants: All_CAPS_LOLZ typically delimited by underline

public class Human {
//members of class - couple of forms
	// Instance varables - property of a specific object (humans name)
	// static variables - property of the class shared by all of it's instances
	//Instance methods - behavior related to a specific object
	//static methods - behavior relative to entire class 
	// constructor - instantiates the class using the keyword "new"
	//java bean - represents some entity, there is no logic associated
//	ex a bank a count has a number and an owner, but to manipulate the balance the logic will be
//	in another class
//	so the bank account is just going to define itself

	 public String name;
	private int age;
	private int weight;
	
	public String getname() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	

}