package com.db.javafsd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColDemo1 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50 };
		for (int i : arr1)
			System.out.println(i);

		List myList = new ArrayList();

		System.out.println(myList.size());

		myList.add(10);
		myList.add(10.5);
		myList.add("Sonu");
		myList.add(true);

		System.out.println(myList);
		System.out.println(myList.size());

	}

}
