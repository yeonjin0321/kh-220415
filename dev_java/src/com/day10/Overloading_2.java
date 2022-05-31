package com.day10;

// 두개의 클래스가 A is a B관계에 있을때,
// 객체 지향 언어에서는 상속관계로 설계한다.
// 전변은 초기화를 생략할 수 있다.
// 전변의 경우 생성자를 통해서 초기화를 대신 지원 받는다.
class Super1 { // 부모
	public int i = 0;

	// 필요가 없는 생성자라고 하더라도, 상속관계에 있을 떄는
	// 반드시 상위 클래스의 디폴트 생성자를 정의해야 합니다.
	Super1() {
		System.out.println("Super1 디폴트 생성자 호출");
	}// 디폴트 생성자

	Super1(String text) { // 생성자
		System.out.println("Super1 (text) 생성자 호출");
		this.i = 1; // 8번라인
	}
}

class Sub1 extends Super1 {// 자식
	Sub1(String text) {
		// 내안에 변수 i가 선언되지 않았는데 왜 에러가 발생하지 않나요?
		super("Hello"); // 부모클래스를 가르키는 수정자이다. 그 수정자 뒤의 괄호는 생성자를 호출한다.
		i = 2; // 상속 받았기 때문이다. 부모에게서 받은 변수 사용. (부모+자식)
	}
}

public class Overloading_2 {

	public static void main(String[] args) {
		// 자녀 클래스를 인스턴스화 하더라도 부모클래스의 생성자를
		// 먼저 호출하게 되는데 이떄 선언된 생성자가 하나라도 존재하면
		// 디폴트 생성자라 하더라도 JVM 이 제공하지 않는다.
		Sub1 sub = new Sub1("Hello");
		System.out.println(sub.i);

	}

}
