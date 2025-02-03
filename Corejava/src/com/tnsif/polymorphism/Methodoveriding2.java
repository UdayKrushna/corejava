package com.tnsif.polymorphism;

public class Methodoveriding2 extends Methodoverideing {
	@Override
	void dirnk()
	{
		System.out.println("cold coffee");
	}
	void display() {
		dirnk();
		super.dirnk();
		
	}
public static void main(String[] args) {
	Methodoveriding2 d=new Methodoveriding2();
	d.display();
}
}
