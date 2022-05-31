package com.day17;

//1부터 100까지 세면서 3의 배수의 합을 구하는 프로그램을 작성하시오.
//요구사항
//for문을 이용해서 풀어보고 나서 while문으로 바꾸어서도 풀어보는게 좋습니다.
public class Test {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}

		}
		System.out.println("1부터 100까지의 숫자중 3의 배수의 합은: " + sum);
		System.out.println();

		int sum1 = 0, i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				sum1 += i;
			}
			i++;
		}
		System.out.println("while문을 이용한 합계 " + sum1);

	}

}
