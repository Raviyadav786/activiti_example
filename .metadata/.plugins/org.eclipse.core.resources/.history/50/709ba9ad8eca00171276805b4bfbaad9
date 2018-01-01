package com.test.behaviour_param_chapter2;

import java.util.ArrayList;
import java.util.List;

public class AppleTestForNormalDesignApproach {

	public static void main(String[] args) {
		// Getting inventory
		List<Apple> inventory = getAppleInventory();
		// 1st way :: filter green apple
		// System.out.println(filteringGreenApple(inventory));
		
		// 2nd way :: requirement change : green apple is not fixed he can look for
		// searching of any color..
		System.out.println(filteringAppleByColor(inventory, "Red"));
		
		
		//3rd Attempt :: requirement to filter apple on the basis of weight, sometimes on the basis
		// of color, means condition changing
		
		

	}
	
	public static List<Apple> filteringAppleByWeightAndColor(List<Apple> inventory,String color,String weight,boolean isByColor) {
		// here we have to write several condition to check on what basis the farmer want to 
		// filter the apple and on that basis we will write the code.
		
		
	// not good solution, so terrible to understand, if farmer change requirement on the basis
		// of filter the apple on the basis of shape, size, origin than need to change the code
		// either we have to right several dulplicate method or one method giant.
		
		
		return null;
	}
	
	

	public static List<Apple> filteringGreenApple(List<Apple> inventory) {
		List<Apple> greenAppleList = new ArrayList<>();
		for (Apple apple : inventory)
			if ("Green".equalsIgnoreCase(apple.getColor()))
				greenAppleList.add(apple);
		return greenAppleList;
	}

	public static List<Apple> filteringAppleByColor(List<Apple> inventory, String color) {
		List<Apple> greenAppleList = new ArrayList<>();
		for (Apple apple : inventory)
			if (color.equalsIgnoreCase(apple.getColor()))
				greenAppleList.add(apple);
		return greenAppleList;
	}

	public static List<Apple> getAppleInventory() {
		Apple apple = new Apple("Green", 120);
		Apple apple1 = new Apple("Green", 150);
		Apple apple2 = new Apple("Green", 90);
		Apple apple3 = new Apple("Green", 180);
		Apple apple4 = new Apple("Red", 120);
		Apple apple5 = new Apple("Red", 90);
		Apple apple6 = new Apple("Red", 150);
		Apple apple7 = new Apple("Red", 180);
		Apple apple8 = new Apple("Red", 10);
		List<Apple> inventory = new ArrayList<>();
		inventory.add(apple8);
		inventory.add(apple7);
		inventory.add(apple6);
		inventory.add(apple5);
		inventory.add(apple4);
		inventory.add(apple3);
		inventory.add(apple2);
		inventory.add(apple1);
		inventory.add(apple);
		return inventory;

	}
}
