package com.day9;
//변수가 몇 개 필요하니? -3개
//변수의 위치는?

public class Shuffle_Quiz_2 {
	int i = 21;
	int j = 45;
	int imsi = 0;
	//생성자 넣어보기
	public Shuffle_Quiz_2() {

		imsi = i;
		i = j; 
		j = imsi; 
		System.out.println("i=" + i + " ,j=" + j); //문법적인 문제가 일어나지 않음.
		
	}
	
	public static void main(String[] args) {

		Shuffle_Quiz_2 sf2 = new Shuffle_Quiz_2();// 위의 생성자 셔플퀴즈2와 연결되어있음 컨트롤해서 확인
		

	}

}
