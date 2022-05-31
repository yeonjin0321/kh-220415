package com.day10; //알프 시프트 a 정리하기 16번

class Banana {
	public int x; // 초기화 생략됨
	private static int nth;

	Banana() {
		nth = nth + 1;
		x = nth;
	}

	Banana(int x) {
		this.x = x;

	}
}

public class BananaSimulation {
	public static void main(String[] args) {

		Banana b1 = new Banana();
		Banana b2 = new Banana();
		Banana b3 = new Banana(1);
		Banana b4 = b3;
		Banana b5 = new Banana();
		System.out.println(b1 + "," + b2 + ",\n" + b3 + "," + b4);
		System.out.println("b1.x=>" + b1.x);
		System.out.println("b2.x=>" + b2.x);
		System.out.println("b3.x=>" + b3.x);//3과 4는 값이 같음 . int 1넣은것
		System.out.println("b4.x=>" + b4.x);
		System.out.println("b5.x=>" + b5.x);//1,2,3 이어감.
	}
}
