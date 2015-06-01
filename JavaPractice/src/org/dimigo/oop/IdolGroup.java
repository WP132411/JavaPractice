package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		String[] idolGroup = {"샤이니", "방탄소년단", "걸스데이"};
		String[][] members = {
				{"진기","종현","기범","민호","태민"},
				{"석진","윤기","남준","호석","태형","지민","정국"},
				{"유라","혜리","소진","민아"}
		};
		
		for(int i=0; i<idolGroup.length; i++) {
			System.out.println("<<" +  idolGroup[i] + "맴버 >>");
			for(String value : members[i]) {
				System.out.println(value);
			}
			System.out.println();
			
		}

				

	}

}
