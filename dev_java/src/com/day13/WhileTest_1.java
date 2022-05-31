
package com.day13;


public class WhileTest_1 {
   
   public static void main(String[] args) {
      int i = 1;
      int hap = 0;
      for(;i<6;) {
    	  
    	 //for문 안에서 1번 초기화와 3번 증감연산자를 생략할 수 있다.
    	  //대신 밑에 i++로 선언되어 있다는 가정하에.
         hap = hap + i;
         System.out.println("i : "+i);
         System.out.println("hap : "+hap);
         i++;
      }
      System.out.println("1부터 5까지의 합은 "+hap);
   }

}
