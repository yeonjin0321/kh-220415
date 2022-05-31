package com.test1;

public class Exercise07 {
//중첩 for문을 이용하여 4x+5y=60d의 모든 해를 구해서 (x,y)의 형태로 출력해 보세요.
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j =1;j<=10; j++) {
				if((4*i)+(5*j) == 60) {
					System.out.println("(" + i + "," + j + ")");
					
				}
			}
		}
	}

}
