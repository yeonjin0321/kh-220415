package com.day18;
//구구단 중에서 시작단과 끝단을 입력받아서  출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("원하는 구구단을 입력해주세요");
		Scanner sc = new Scanner(System.in); // 구구단 숫자를 입력받음
		int dan = sc.nextInt(); // 입력받은 값을 dan이라는 변수에 넣어줌
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
		sc.close(); // scanner을 사용을 마침
	}
}