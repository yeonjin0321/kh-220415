package com.day19;

public class Test_1 {
	// 필드 선언할것, 배열, 음수 ,양수 합
	int arr[] = new int[10];
	int sum1;
	int sum2; // 배열 크기 양수 음수 선언해보기

	public Test_1() { // 생성자 순서대로 호출시 진행?..
		this.sum1 = sum1;
		this.sum2 = sum2;
		Random();
	}

	public void Random() { // 랜덤 난수 추출 메서드
		for (int i = 0; i < arr.length; i++) { // for문 배열 크기만큼 돌리기.
			arr[i] = (int) (Math.random() * 21) - 10; // 범위설정 (-10~10)까지.
			System.out.print(arr[i] + " "); // 10개의 랜덤값을 출력.

			// 조건문 설정하기
			if (arr[i] >= 0) { // 배열에서 양수인지 확인후 합 구하기
				sum1 += arr[i];
			} else { // 음수의 합 구하기
				sum2 += arr[i];
			}
		}
		System.out.println();// 개행
		System.out.println("양수합: " + sum1);
		System.out.println("음수합: " + sum2);
	}

	public static void main(String[] args) {
		Test_1 t1 = new Test_1();
	}
}