package com.day10;
// 두개의 클래스가 A is a B관계에 있을때,
// 객체 지향 언어에서는 상속관계로 설계한다.
// 전변은 초기화를 생략할 수 있다.
// 전변의 경우 생성자를 통해서 초기화를 대신 지원 받는다.
class Super{ //부모
	Super(){ //생성자
		//파라미터가 아무것도 없으니까 생략하면 JVM이 대신 로딩해준다.(컨벤션)
		System.out.println("Super() 호출 성공");
	}
	public void methoaA() {//매소드
		System.out.println("Super - methodA 호출 성공!");
	}
}
class Sub extends Super {//자식
	Sub(){
		//파라미터가 아무것도 없으니까 생략하면 JVM이 대신 로딩해준다.(컨벤션)
		System.out.println("Sub() 호출 성공");
	}
	@Override
	public void methoaA() {
		System.out.println("Sub - methodA 호출 성공!"); //Sub - methodA 호출 성공! 출력
	}
} 
public class Overloading_1 {

	public static void main(String[] args) {

		Super sup = new Super();
		sup.methoaA(); // 슈퍼 소유 메소드 출력
		Sub sub =new Sub();
		sub.methoaA(); // 서브 소유 메소드 출력
		
		//선언부와 생성부의 클래스 타입이 다를 수 있다. - 다형성
		Super sup1 = new Sub(); //새로운 서브 객체 생성
		sup1.methoaA(); //Sub - methodA 호출 성공! 출력
		//자바에서는 선언부의 이름으로 생성? 생성부의 이름으로 생성? -> 생성부의 이름으로
	}
}
