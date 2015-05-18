package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		int i=math+kor+eng;
		double  avg = i/3.0;
		
		System.out.println("<<점수 출력>>");
		StringBuilder sb = new StringBuilder();
		sb.append("국어 점수 : ")
				.append(kor + "점\n");
		sb.append("수학 점수 : ")
				.append(math + "점\n");
		sb.append("영어 점수 : ")
				.append(eng + "점\n");
		sb.append("총점 : ")
				.append(i+"점\n");
		sb.append("평균 : ")
				.append(String.format("%.1f",avg) +"점\n");
		
		System.out.println(sb);
		
		

	}

}
