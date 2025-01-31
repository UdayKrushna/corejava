package com.tnsif.paraconstructordemo;

public class Parameterdemo {
Parameterdemo(){
System.out.println("default");
}
Parameterdemo(int a){
	System.out.println("one parameter");
}
Parameterdemo(int a,String b){
	System.out.println("two parameter");
}
public static void main(String[] args) {
	Parameterdemo d=new Parameterdemo();
	Parameterdemo d1=new Parameterdemo(1,"uday");
	Parameterdemo d2=new Parameterdemo(4);
}
}
