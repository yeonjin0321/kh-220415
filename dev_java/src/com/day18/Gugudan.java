package com.day18;
//구구단 중에서 시작단과 끝단을 입력받아서  출력하는 프로그램을 작성하시오.
// 클래스 분할해 보기
public class Gugudan {

	public void makeGugudan() { //매소드 생성,외부 파라미터값 받아오기
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
			System.out.println(i + "단 : " + i + " x " + j + " = " + (i * j));
		}
	}
	}
}