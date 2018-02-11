package main;

import java.util.ArrayList;
import java.util.List;

import lists.ListDemo;

public class Main {
	
	public static void main(String[] args) {
		
		// create the ArrayList
		List<Integer> list = new ArrayList<>();
		
		// instantiate ListDemo class
		ListDemo listDemo = new ListDemo(50, 1);
		listDemo.setMax(80);
		
		// invoke the method getNumbers on listDemo
		listDemo.getNumbers(20, list);
		
		// enhanced for loop, used with Collections
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("The smallest value is: " + listDemo.getSmallest(list));
		
	}

}
