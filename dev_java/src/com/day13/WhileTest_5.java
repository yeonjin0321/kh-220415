
package com.day13;

public class WhileTest_5 {
   int i;
   int hap;   
   //파라미터를 갖는 생성자 선언 및 구현하기. -파라미터가 2개.
   public WhileTest_5(int i, int hap) { //void 있으면 메소드이므로, 쓰면 안됨. 생성자 선언이므로.
      this.i = i;
      this.hap = hap;
   }
   public void account() {
      while(i<6) {
         hap = hap + i;
         System.out.println("i : "+i); //1부터 5까지 실행
         System.out.println("hap : "+hap); // 1~5까지 누적 합계 출력
         i++;
      }
   }
   public static void main(String[] args) {
      int i = 1;
      int hap = 0;
      WhileTest_5 w = new WhileTest_5(i,hap);
      w.account();
      System.out.println("1부터 5까지의 합은 "+w.hap); // 총합계 출력.  w. 안붙이면 0이 출력됨. 반드시 인스턴스 변수 붙일것   
   }

}