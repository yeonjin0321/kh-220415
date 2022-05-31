package com.basic;

public class StaticTest_1 {
	// 선언부
	
	// 사용자 정의 메소드
	void methodA() { //static이 안붙어 있으므로 밑에서 인스턴스화를 하고 써야함
		System.out.println("methodA 호출 성공");
	}
	// 메인메소드
	public static void main(String[] args) {
		StaticTest_1 st1 = new StaticTest_1();
	// 내 안에 있는 메소드라 하더라도 메소드 선언시 static이 붙어 있지 않으면
	// 인스턴스화를 해야 호출할 수 있다	
		st1.methodA();
	}

}
