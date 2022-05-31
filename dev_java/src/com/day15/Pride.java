package com.day15;
//추상클래스는 인터페이스와 다르게 일반 메소드를 가질 수 있다.
//일반 메소드 앞에는 abstract 가 없다.

//이때 pride를 무브비헤비어의 인터페이스의 구현체 클래스라고 말한다.
public class Pride extends Car implements MoveBehavior {
	// run이라는 메소드는 좌중, 우중괄호가 있는것 만으로도 구현이다.
	@Override
	public void run() { //MoveBehavior 인터페이스 안에 선언된 추상 매소드를 재정의하였다.
		// 내안에서 선언된 변수가 아닌데 어떻게 사용이 가능하지?
		// Car를 상속받았으므로. 그래서 가능함.
		// 원래 Car 에서는 엑셀을 밟을때마다 1씩 증가였는데 -> 자손클래스에서는 2씩 증가나는 것으로 재정의되었다.
		// 상속에서 쓰인 오버라이딩이다.
		speed = speed + 2;
	}

	@Override
	public int stop() {
		return 0;
	}

	@Override
	public void display() {

	}
}
