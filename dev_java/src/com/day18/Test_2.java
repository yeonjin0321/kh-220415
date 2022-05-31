package com.day18;
//구구단 중에서 시작단과 끝단을 입력받아서  출력하는 프로그램을 작성하시오.
//whlie문 사용 하여 구구단 출력해보기.

public class Test_2 {
	public static void main(String[] args) {

		int i = 2; //단부분
		int j = 1;
		while (i <= 9) {
			// i를 2단~9단부터 반복 작업, 이중 while문 사용
			while (j <= 9) {
				System.out.println(i + " X " + j + " = " + (i * j));
				j++;
				// while 내문에서 단과 곱하는 j를 1씩 증가시켜준다
			}
			System.out.println();
			j = 1; // j를 1로 초기화 시켜주어 다시 단*1부터 돌아갈 수 있도록 해준다.
			i++; // 단부분도 증가시킴
			
		}
	}
}