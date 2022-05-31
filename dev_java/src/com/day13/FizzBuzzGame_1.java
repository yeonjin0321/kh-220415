package com.day13;

public class FizzBuzzGame_1 {
// 1부터 100까지 센다
	public static void main(String[] args) {
		// for(int i=1;i<101;i++) {
		// 변수 선언만
		int i;
		// 변수 초기화 함.
		i = 1;
		while (i < 101) { // while문은 변수 초기화x 증감연산자x
			if(i%35==0) {
				System.out.println("fizzbuzz");
			} else {
			System.out.println(i);
			}
			++i; //출력후 증가이므로.

		} // end of while
	}// end of main
}// end of fizzbuzzgame_1