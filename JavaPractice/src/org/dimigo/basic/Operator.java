package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9, b= 10;
		double h1 = 5.8, h2 = 5.4;
		double S1 = (double)(a+b)*h1 /2;
		double S2 = (double)a * h2;
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : " + S1);
		System.out.println("평행사변형 넓이 : " + S2);
		
		if(S1>S2) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (S1-S2) + "더 큽니다." );
		}
		if(S2>S1) {
			System.out.println("평행사변형이 사다리꼴 보다 " + (S2-S1) + "더 큽니다." );
		}

	}

}
