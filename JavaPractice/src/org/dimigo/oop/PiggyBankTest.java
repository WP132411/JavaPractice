package org.dimigo.oop;

public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember father = new FamilyMember("아빠");
		FamilyMember mother = new FamilyMember("엄마");
		FamilyMember i = new FamilyMember("나");
		FamilyMember brother = new FamilyMember("남동생");
		
	      
	      FamilyMember.printMemberCnt();
	      
	      PiggyBank.putMoney(father,10000);
	      PiggyBank.putMoney(mother,5000);
	      PiggyBank.putMoney(i,2000);
	      PiggyBank.putMoney(brother,1000);
	      
	      PiggyBank.printBalance();
	      
	      PiggyBank.putMoney(i, 1000);
	      
	      PiggyBank.printBalance();
	      
	      PiggyBank.outMoney(brother, 3000);
	      
	      PiggyBank.printBalance();
	   
	}

}

