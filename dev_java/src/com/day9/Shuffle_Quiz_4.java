package com.day9;
//변수가 몇 개 필요하니? -3개

//변수의 위치는?

public class Shuffle_Quiz_4 {

//메소드 사용하여 표현하기(A.B)
	public boolean methodA(int i, int j) {
		int imsi; // 임시는 지변으로 해도 ok
		imsi = i;
		i = j;
		j = imsi;
		System.out.println("i=" + i + " ,j=" + j);
		return true; // 셔플이 성공하면 트루 아니면 폴스
	}
	public void methodB() {}
	
	public static void main(String[] args) {

		Shuffle_Quiz_4 sf4 =new Shuffle_Quiz_4();
	
		boolean isOk = sf4.methodA(3, 6);
		if(isOk) {
			System.out.println("참 잘했어요!");
			
		}
		sf4.methodB(); // 메소드값이 없어서 .
	}

}
