package com.day16;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck myDuck = new MallardDuck();
		//말라드덕은 플리이비헤이비어의 구현체 클래스가 아니다.
		//직접 오버라이딩 하지 않았기 때문에.
		myDuck.performFly();
		myDuck.display();
		myDuck = null;
		
		myDuck = new RubberDuck();
		myDuck.display();
		myDuck.performFly();
		WoodDuck herDuck = new WoodDuck();
		herDuck.performFly();
		herDuck = (WoodDuck)myDuck; //강제 형변환!
		herDuck.display(); //ClassCastException
		//myDuck = herDuck;
		
		//mallard.performQuack();
		//mallard.performFly();
	}
}
