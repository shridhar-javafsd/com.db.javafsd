package com.db.javafsd;

@FunctionalInterface
public interface FunIn {

	public abstract void functionalMethod();

//	public abstract void anotherFunctionalMethod();

	static void m1() {
		System.out.println("aaa");

	}

	static void m12() {
		System.out.println("aaa");

	}

	default void m22() {
		System.out.println("aaa");

	}

	default void m2() {
		System.out.println("aaa");

	}
}
