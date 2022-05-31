package com.day9;
//변수가 몇 개 필요하니? -3개
//변수의 위치는?

public class Shuffle_Quiz_1 {
	int i = 2;
	int j = 4;
	int imsi = 0;
	public static void main(String[] args) {

		Shuffle_Quiz_1 sf1 = new Shuffle_Quiz_1();
		
		sf1.imsi = sf1.i;
		sf1.i = sf1.j; // 2이라는 값이 4으로 바뀐다.
		sf1.j = sf1.imsi; // 임시의3을 j로 넣어서 바꿔치기한다.

		System.out.println("i=" + sf1.i + " ,j=" + sf1.j);

	}

}
