package com.day21;

public class BinDoTemplate {
      public BinDoTemplate() {
         int nanSus[] = new int[100]; //첫번째 배열 100개 필요
         int pCount[] = new int[10]; //두번쨰 배열 10개 필요 (카운트값을 담는다)
         //insert here
         initArray(nanSus, nanSus.length);
         numberCount(nanSus, nanSus.length,pCount);
         print10PerLine(nanSus, nanSus.length);
         printResult(pCount,10);
      }
      // 배열의 초기화
      void initArray(int nanSus[], int size) {
         //insert here
         //System.out.println(nanSus+","+size);
         for(int i=0; i<nanSus.length;i++) {
            //0.0~ 10.0 실수 채번한다. 0.0포함, 10.0 미포함
            nanSus[i] = (int) (Math.random()*10);
      }
      }
      // 빈도 검사  nanSus에 들어 있는 숫자의 빈도를 pCount에 저장함
      void numberCount(int nanSus[], int size, int pCount[]) {
         //insert here
    	  int nIndex = 0;
    	  //채번된 100가지의 숫자에 대해 판정을 해야 한다.
    	  for(int i=0; i<size;i++) {
    		  //카운트 하기 위해서 일단 배열의 값을 담았다.
    		  //채번된 숫자가 배열(pCount)의 인덱스 변수에 담는다.
    		  nIndex = nanSus[i];
    		  //pCount는 100개의 숫자에 대한 빈도수를 관리하는 1차배열이다.
    	  pCount[nIndex]++; // 그숫자가 들어있는 카테고리 인덱스를 1씩 증가 시켜 빈도수 누적.
    	  }
         
      }
      // 배열 출력 한 줄에 10개씩 출력하고 줄바꿈 하기
      void print10PerLine(int nanSus[], int size) {
         System.out.printf("원본:");
         for(int i=0;i<size;i++) {
            System.out.printf("%3d", nanSus[i]);
            if(i%10 == 9) System.out.printf("\n   ");
         }
      }
      // 빈도 출력 빈도 배열과 인덱스를 함께 출력
      void printResult(int pCount[], int size) {
         //insert here
    	  System.out.println("\n ");//개행처리하기
         System.out.printf("숫자:");
         for(int i=0;i<size;i++) {
        //	 System.out.print("  "+i); //3자리를 확보하고 d에 i를 넣어주세요.
        	 System.out.printf("%3d", i); //3자리를 확보하고 d에 i를 넣어주세요.
         }
         System.out.println("\n "); //개행 처리하기
         System.out.printf("개수:");
         for(int i=0;i<size;i++) {
        	 System.out.printf("%3d", pCount[i]);
         }
      }
      public static void main(String[] args) {
         new BinDoTemplate();
      }

   

   }
