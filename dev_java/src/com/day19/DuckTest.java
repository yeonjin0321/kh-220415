package com.day19;

import com.day16.Duck;//다른 패키지에 있는것을 임포트함
import com.day16.MallardDuck;
import com.day16.RubberDuck;
// 생성부와 선언부의 이름이 다르면 안된다. -상속관계, 인터페이스를 implements
public class DuckTest {
	//파라미터에 더 상위 클래스 타입을 적어주면 다양한 구현체 클래스를 받을 수 있다. -다형성
	//같은 이름의 매소드가 호출되더라도 기능이 서로 다르게 동작된다.
	//선언부와 생성부의 이름이 다를때 가능하다.
	//이것이 가능하려면 상속관계이거나 인터페이스 구현체 클래스 이라면 가능하다.
	public void methodA(Duck duck) {
		System.out.println("methodA(Duck)");
		if(duck instanceof RubberDuck) {
			System.out.println("나는 루버덕 타입입니다.");
		}else if(duck instanceof MallardDuck){
		System.out.println("나는 몰라드덕 타입입니다.");
			
		}else { //조건문 없음
			System.out.println("나는 기타 덕 타입입니다.");
		}
		System.out.println(duck);
	}
	public void methodA(MallardDuck duck) {
		System.out.println("methodA(MallardDuck)");
		System.out.println(duck);
	}
	public void methodC(int i) {
		System.out.println(i);
	};
	// 메소드의 파라미터 자리는 선언만, 초기화는 불가하다. - 그 변수의 값을 정할 수 없다.
	public static void main(String[] args) {
		DuckTest dt = new DuckTest();
		Duck myDuck = new RubberDuck(); // 다형성 com.16에서 가져옴
		Duck herDuck = new MallardDuck(); // 다형성 com.16에서 가져옴
		// 인스턴스 변수가 있으면 다른 변수나 다른 메소드 호출시 재사용 가능하다.
		// new RubberDuck(); 한번만 사용가능함. - 재사용불가.
		dt.methodA(new RubberDuck()); // 10번 duck 타입 루버덕의 상위클래스 Duck
		dt.methodA(herDuck); // 
		dt.methodA(myDuck); // pass by value(주소번지 원본) <-> call by value(복사본)
		//dt.methodB(new MallardDuck());
		dt.methodC(7); // call by value
		// dt.methodA(5); 안되는이유: 타입이 다르다. 차라리 null(참조형타입)을 넣는것은 괜찮음
	}

}
