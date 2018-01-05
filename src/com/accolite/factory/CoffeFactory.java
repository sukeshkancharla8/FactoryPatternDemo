package com.accolite.factory;
public class CoffeFactory {
	public static Coffe getCoffe(String type) {
		if(type.equals("a")) {
			return (new Cappucino());
		}else if(type.equals("b")) {
			return (new Latte());
		}else if(type.equals("c")) {
			return (new Mocha());
		}
		return null;
	}
}
