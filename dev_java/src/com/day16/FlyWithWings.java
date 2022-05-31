package com.day16;

// 플라이윗윙은 플라이비헤이비어의 인터페이스와 구현체 클래스이다.
// 플라이비헤이비어에 있는 추상메소드를 내가 오버라이딩 하고 있다.
//아래 클래스는 고무오리와 청동오리 중에 누구와 구현체 클래스가 되어야 하나요?

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() { //오버라이드
		System.out.println("날고 있어요");
	}

}
