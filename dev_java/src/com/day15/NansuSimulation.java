package com.day15;

public class NansuSimulation {

	public static void main(String[] args) {
		//내가 다른 클래스의 메인메소드를 호출 할 수 있나?
		//사용자 정의 메소드와 콜백메소드 차이
		NansuJumsu nj = new NansuJumsu();
		int j[] = {5,6,7,8,9};
		nj.totalSum(j,0); //call by value 값에 의한 호출.
		
	}

}
