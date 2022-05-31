package com.day18;
//구구단 중에서 시작단과 끝단을 입력받아서  출력하는 프로그램을 작성하시오.


//스캐너 없이 이중포문만을 사용.

public class Test_1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) { //중첩 for문 i와j를 이용함.
			for (int j = 1; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
