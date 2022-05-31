package com.day15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//ActionListener가 인터페이스다.
// 이떄 추상메서드인 액션퍼폼드를 오버라이딩 해야한다!!
public class A_2 extends JFrame implements ActionListener {// 임포트

	B_2 b = new B_2(); // 초기화 생성을 한번에 한 경우이다.
	JButton jbtn_insert = new JButton("입력"); // 임포트문 자동생성

	public void initDisplay() {
		System.out.println("initDisplay 호출 성공!");
		this.setLayout(new FlowLayout()); // 플로우레이아웃API를 이용해서 배치할때는 동서남북중앙 배치 불가하다.
		jbtn_insert.addActionListener(this);
		this.add(jbtn_insert); //인서트 버튼 추가
		this.setSize(400, 500);
		this.setVisible(true);
	} // end of initDisplay

	public static void main(String[] args) {
		// 이것을 예외처리라고 한다.
		// TRY+컨트롤+스페이스바.-자동완성 기능 사용하기
		try {// 예외가 발생할 가능성이 있는 코드 집어 넣기.
			A_2 a = new A_2(); // 타입만 정해졌다. 콜백 메소드
			a.initDisplay(); // NullPointException이 발생하면 그 뒤에 어떤 코드도 실행기회를 갖지 못한다.

		} catch (Exception e) {
			System.out.println("NullPointerException 발생함."); // 오류 발생시 나오는 문구
		}
		System.out.println("initDisplay 호출 후"); // 그대로 진행함.(예외처리를 하는 이유)
	}

// JVM이 정의하고 있는 객체중에 JVM이 대신 인스턴스화 해주는 클래스가 있다.
// 의존성 주입이라고 한다. -너가 필요할 때 알아서 해줌.
	@Override
	public void actionPerformed(ActionEvent e) { // 컨벤션 반드시 구현체 클래스가 있어야 한다. (ActionEvent e)선언만.
		// 버튼을 누르는건 사용자 이지만 느끼는건 JVM이다.
		// JVM이 느낀 버튼의 주소번지를 가져오는 메소드가 있다.
		Object obj = e.getSource(); // 강제 형변환. 캐스팅
		// 왜 널포인트 익셉션이 발생하지 않지?
		//@abc123456 == @abc123456
		if(obj==jbtn_insert) { // jvm이 감지한 주소번지와 개발자가 선언한 주소번지가 같니? 네.
			System.out.println("입력 버튼 눌렸다."); //입력버튼 누르면 콘솔창에 찍힘.
		}

	}
}
