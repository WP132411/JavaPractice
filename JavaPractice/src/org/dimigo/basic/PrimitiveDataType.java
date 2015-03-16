package org.dimigo.basic;

/**
 * << 첫번째 수행평가 과제 >>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author teacher
 * @version 1.0
 */

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		String name = "아이유";
		boolean gen = true;
		int i1 = 23;
		double d1 = 161.8;
		float f1 = 44.3f;
		char c1 = 'A';
		
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name);
		
		if(gen) {
			System.out.println("성별 : 여자");
		} else{
			System.out.println("성별 : 남자");
		}
		
		System.out.println("나이 : " + i1 + "살");
		System.out.println("키 : " + d1 + "cm");
		System.out.println("몸무게 : " + f1 + "kg");
		System.out.println("혈액형 : " + c1 + "형");

		
	}

}
