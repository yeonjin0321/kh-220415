package com.day10;

class TestSuper{
	//파라미터가 있는 생성자가 하나라도 있다면, 디폴트 생성자 자동으로 제공이 안됨 
	TestSuper(){}; // 디폴트 생성자 설정해줘야 오류가 안난다.
	TestSuper(int i){
		System.out.println("TestSuper int i 호출 성공");
	}
	
}

class TestSub extends TestSuper{
	
}

public class TestAll {

	public static void main(String[] args) {

	}

}
