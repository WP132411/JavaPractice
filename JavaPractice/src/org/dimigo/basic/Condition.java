package org.dimigo.basic;

public class Condition {

   public static void main(String[] args) {

      //      int light = 300;
      //      String ext = "그외"
      
      String h1 = "고속버스";
      int distance = 32;
      int pay = 850;   //고속버스
      
      switch((distance-1) / 10){
      case 1:
         pay += 300;
         break;
      case 2:
         pay += 600;
         break;
      case 3:
         pay += 900;
         break;
      }
      
      System.out.println("<< 고속도로 통행료 계산 >>");
      System.out.println("거리 : " + distance + "km");
      System.out.println("차종 : " + h1);
      System.out.println("통행료 : " + pay + "원");
   }

}