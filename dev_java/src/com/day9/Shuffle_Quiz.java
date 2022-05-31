package com.day9;
//변수가 몇 개 필요하니? -3개

//변수의 위치는?

public class Shuffle_Quiz {

	public static void main(String[] args) {

		int i = 3;
		int j = 6;
		int imsi = 0;
		imsi = i;
		i = j; // 3이라는 값이 6으로 바뀐다.
		j = imsi; // 임시의3을 j로 넣어서 바꿔치기한다.

		System.out.println("i=" + i + " ,j=" + j);

	}

}
