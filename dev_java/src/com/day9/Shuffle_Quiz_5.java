package com.day9;
//변수가 몇 개 필요하니? -3개

//변수의 위치는?

public class Shuffle_Quiz_5 {

	int i = 3; // 초기화
	int j = 6;

	public boolean methodA() {
		boolean isOk = false;

		i = j;
		j = 1;
		System.out.println("i=" + i + " ,j=" + j);
		if (i != 3 && j != 6) isOk = true;
		return isOk; // 셔플이 성공하면 트루 아니면 폴스
	}

	public void methodB() {}

	public static void main(String[] args) {

		Shuffle_Quiz_5 sf4 = new Shuffle_Quiz_5();

		boolean isOk = sf4.methodA();
		if (isOk) {
			System.out.println("참 잘했어요!");
		} else {
			System.out.println("다시 한 번 생각해보세요!");

		}
		sf4.methodB(); // 메소드값이 없어서 .
	}

}
