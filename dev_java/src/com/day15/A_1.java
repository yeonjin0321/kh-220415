package com.day15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class A_1 extends JFrame implements ActionListener {//임포트
	//인스턴스화는 초기화와 생성하기를 나누어 작성할 수도 있다.
	//그러나 메서드 안이나 생성자 안에서는 가능하다!
	//선언부에서 이렇게 두줄로 나누어 쓰는것은 안된다는것.
	/*B_1 b1 = null;
	b1= new B_1();*/
	
	//인터페이스는 단독으로 인스턴스화가 불가하다.
	//위의 이유로 하여 인터페이스 안에는 추상메소드만 올 수 있다.
	//추상 메소드란 선언부 뒤에 세미 콜론으로 끝나는 경우를 말한다.(구현은 좌우중괄호{})
	//아래 있는 initDisplay 메소드의 경우, 좌중괄호와 우중괄호가 있으니까 추상메소드가 아닌것이다.
	//메소드 이름 뒤에 세미콜론으로 끝나면 메소드 호출이라고 했는데,?
	//추상메소드에는 리턴타입이 올 수 있고, 접근제한자도 올 수 있다.
	//생성부에는 반드시 구현체 클래스 이름이 와야 한다.
	
	//ActionListener al = new A_1();
	// 오류 ActionListener a2 = new ActionListener ();
	B_1 b = new B_1(); //초기화 생성을 한번에 한 경우이다.
	JButton jbtn_insert = new JButton("입력"); //임포트문 자동생성
	
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공!");
		//입력버튼이 눌러졌을떄 이벤트를 감지하고 롤백메소드를 호출하는 코드추가
		//현재 클래스 안에 액션퍼폼드라는 메소드가 재정의 안되서 오류
		//이벤트 처리를 담당하는 클래스를 외부에 둘 수도 있다.
		this.setLayout(new FlowLayout()); //플로우레이아웃API를 이용해서 배치할때는 동서남북중앙 배치 불가하다.
		//그럼 아까는 왜 되었던 것일까? -> 디폴트라서. 보더레이아웃이 기본이라서.생략이 가능해
		jbtn_insert.addActionListener(this);
		//this에 무엇을 붙일 것인가는 파라미터를 통해서 결정할 수 없다.
		//this 는 A_1클래스를 의미하고, add매소드는 JFrame창의 버튼을 붙이는 기능으로 호출.
		this.add(jbtn_insert); 
		this.setSize(400,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		//A_1 a = new A_1(); //새로운 A객체.
		//시스템이 중지하는 원인은 어느 라인일까? 
		A_1 a = null; // 타입만 정해졌다.
		a= new A_1();
		//A_1클래스에 대해서 선언만 되어 있고, 생성이 되지 않은 상태에서 메소드 호출이 일어났다.
		a.initDisplay(); //NullPointException이 발생하면 그 뒤에 어떤 코드도 실행기회를 갖지 못한다.
	}

// 아래 메소드는 액션리스너라는 인터페이스에 선언되어 있는 추상메소드 이다. (세미콜론으로 끝남) 
	@Override
	public void actionPerformed(ActionEvent e) { //컨벤션 반드시 구현체 클래스가 있어야 한다. (ActionEvent e)선언만.
		
	}
}
