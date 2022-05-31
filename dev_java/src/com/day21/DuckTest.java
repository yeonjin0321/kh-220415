package com.day21;
//자바+스프링 (객체주입,의존성주입,제어역전)
import com.day16.MallardDuck;

public class DuckTest {

	MallardDuck myDuck = null;

	MallardDuck getInstance() {
		// 중급으로 가는 길 = 싱글톤 패턴 검색. -도깨비-공유
		if (myDuck == null) {
			myDuck = new MallardDuck();
		}

		return myDuck;
	}

	void test() {
		getInstance().display(); // 널포인터익셉션발생함.
	}
	
	public static void main(String[] args) {
		// insert here
		DuckTest dt =new DuckTest();
		dt.test();
	}

}
