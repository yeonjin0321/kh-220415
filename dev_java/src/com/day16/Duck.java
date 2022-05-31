package com.day16;
//추상클래스
public abstract class Duck {
//고무 오리와 나무오리와 청동오리는 외모가 각기 다르다.
	//서로 다른 외모를 구현하려면 구현체 클래스가 필요하다.
	   FlyBehavior flyBehavior = null; //변수 선언
	   QuackBehavior quackBehavior= null; //변수 선언
	   
	   public Duck(){
		   //추상클래스에서는 구현체 클래스를 결정할 수 없다.
		   //왜냐하면 구체적인 클래스가 정해지지 않았다. WoodDuck인지 RubberDuck인지 아니면 MallarDuck인지가
		   // 추상클래스에서 쓸 수 없다.(미정이기때문에) flyBehavior = new FlyWithWings();
	   } //생성자를 가질 수 있다.
	   
	   public abstract void display(); //추상 매소드
	   
	   public void performFly(){ //바로 이코드로 인해 결합도가 낮아지게 된다.
	      flyBehavior.fly();
	   }
	   public void performQuack(){
	      quackBehavior.quack();
	   }
	   public void swimming(){
	      System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	   }
	}
