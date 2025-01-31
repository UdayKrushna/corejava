package com.tnsif.inheritance;

public class Childinheritance extends Inheritancedemo {
	String cycle="pink";
	
	
	public static void main(String[] args) {
		Childinheritance c=new Childinheritance();
		System.out.println(c.money);
		System.out.println(c.car);
		System.out.println(c.cycle);
		c.drinking();
	}

}
