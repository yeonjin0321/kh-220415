package com.day16;

public class MallardDuck extends Duck {

	public MallardDuck() { // 생성자
		flyBehavior = new FlyWithWings();
		//quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("저는 청동오리입니다.");
	}

}
