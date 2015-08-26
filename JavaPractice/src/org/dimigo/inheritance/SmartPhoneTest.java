package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		
		IPhone i = new IPhone("iPhone 6", "애플", 700000);
		Galaxy g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useSpecialFunction();
		i.turnOff();
		
		System.out.println();
		
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction();
		g.turnOff();
		
	}

}
