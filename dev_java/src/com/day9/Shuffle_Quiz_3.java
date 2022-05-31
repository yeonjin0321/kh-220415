package com.day9;
//변수가 몇 개 필요하니? -3개
//변수의 위치는?

public class Shuffle_Quiz_3 {
	static int i = 21;
	static int j = 45;
	static int imsi = 0;
	
	public static void main(String[] args) {

		imsi = i;
		i = j;
		j = imsi; 

		System.out.println("i=" + i + " ,j=" + j);

	}

}
