package com.accolite.factory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice="";
		do {
			System.out.println("enter ur choice");
			choice=sc.nextLine();
			Coffe coffe= CoffeFactory.getCoffe(choice);
			if(coffe!= null) {
				coffe.deliver();
			}
		} while (!choice.equalsIgnoreCase("No"));
		sc.close();
	}
}
