package com.sec06;

public class Ex6_4 {
// 두점 (x,y) 와 (x1,y1) 간의 거리를 구한다.
//제곱근의 공식은 Math.sqrt를 사용하면 된다.
		static double getDistance(int x, int y, int x1, int y1) { //알맞은 코드를 입력하세요.
			
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); // x와y는 지역변수이다.
		}
		
		public static void main(String[] args) {
			System.out.println(getDistance(1,1,2,2));
	}

}
