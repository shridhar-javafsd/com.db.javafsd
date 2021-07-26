package com.db.javafsd;

import java.util.Scanner;

//public class AppClass implements FunIn {
//
//	@Override
//	public void functionalMethod() {
//		System.out.println("functional method");
//	}
//
//	@Override
//	public void anotherFunctionalMethod() {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static void main(String[] args) {
//
//		AppClass app = new AppClass();
//		// invoke functional method
//		app.functionalMethod();
//	}
//
//}

//public class AppClass {
//
//	public static void main(String[] args) {
//
//		FunIn obj = new FunIn() {			
//			@Override
//			public void functionalMethod() {
//				System.out.println("fun method");
//			}
//
//			@Override
//			public void anotherFunctionalMethod() {
//				// TODO Auto-generated method stub
//			}
//			
////			@Override
////			public void anotherFunctionalMethod2() {
////				// TODO Auto-generated method stub
////			}
//
//		};
//
//		obj.functionalMethod();
//	}
//}

public class AppClass {
	
	int output;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		FunIn obj = () -> {
//			output = 10;
//			System.out.println("fun In method");
		};

		obj.functionalMethod();
		obj.functionalMethod();

		FunIn obj2 = () -> {
			System.out.println("fun In method 2");
		};

		// invoke abstract method
		obj2.functionalMethod();

		// invoke default methods
		obj2.m2();
		obj2.m22();

		// invoke static methods
		FunIn.m1();
		FunIn.m12();

	}
}
