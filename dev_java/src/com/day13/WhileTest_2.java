
package com.day13;


public class WhileTest_2 {
	int hap = -1; // 초기화 -1은  end of file.
	
   public int account() { //리턴타입에 인트를 추가하여 처리
      int i = 1;
      int hap = 0;
      while(i<6) {
         hap = hap + i;
         System.out.println("i : "+i);
         System.out.println("hap : "+hap);
         i++;
      }
      System.out.println("1부터 5까지의 합은 "+hap);  
      return hap;
   }
   public static void main(String[] args) {
      WhileTest_2 w = new WhileTest_2();
      int hap = w.account();
      //인스턴스변수 : 변수명으로 호출하면 그것은 전역변수를 호출하는 것이다.
      //따라서 아래엔 -1이 출력되는 것이다.
      System.out.println("main 메소드에서 출력하기: "+w.hap); //전변
      System.out.println("지역 변수 hap에서 출력하기: "+hap); //지변
   }

}

