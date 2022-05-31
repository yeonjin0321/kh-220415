package com.day8;

public class B {

	public static void main(String[] args) {
		// INSERT HERE = A클래스의 변수 i 호출하기

		A a = new A();
		// 변수 호출은 선언이 먼저이다.
		// B클래서 i가 선언되지 않았다.
		// 아래와 같이 호출할 수 있는것은 변수 i 가 전역변수이기 때문이다.
		System.out.println(a.i);
		a.i = 10; // A클래스의 a라는 변수의 i값을 재지정 5->10으로
		// 10이 출력되었을것이다.
		System.out.println(a.i); //10으로 바뀌었으므로 여기선 10. 그러나 c클래스에서 똑같이 호출해도
		// 다른 주소번지이기 때문에 다시 5인것이다.
	}

}
