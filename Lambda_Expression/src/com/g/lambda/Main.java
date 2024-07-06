package com.g.lambda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello mohinj");
		//void lambda
		Lambdainter i=()->System.out.println("hello i am mohini");
		
		i.display();
		
		//int lambda
		Inter2 i2=(int a,int b)->
		{
			return a+b;
		};
		
		System.out.println(i2.sum(2,4));
		
		//String lambda
		Inter3 i3=(str)->{
			return str.length();
		};
		System.out.println(i3.strlength("mohiniwaghamare"));
	}

}
