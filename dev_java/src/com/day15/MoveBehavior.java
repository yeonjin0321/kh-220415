package com.day15; //인터페이스 클래스

//단독으로 인스턴스화가 불가능
//내안에 선언된 메소드는 모두 추상메소드이다.
public interface MoveBehavior {

	public abstract void run();
	// 추상메서드 세미콜론으로 끝났기 떄문에. 리턴타입,보이드,인트 올수 있다.
	// 인터페이스에서 선언된 모든 메소드가 추상메소드 이므로
	// abstract 예약어는 생략이 가능하다.
	// 인터페이스에서 선언된 메소드의 리턴타입이 있더라도,좌중괄호와 우중괄호를 쓸 수 없으므로 return예약어를
	// 쓰지 않아도 된다.

	public abstract int stop();

}
