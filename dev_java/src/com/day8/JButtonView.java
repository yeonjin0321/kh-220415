package com.day8;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonView {
	//선언부
	JFrame jf = new JFrame();
	JButton jbtn_north = new JButton("조회");
	//생성자 파라미터의 this는 자기 자신을 가리키는 예약어이다.
	//제이버튼뷰클래스를 말하는것이다.
	//그런데 아래 코드에서 컴파일 에러가 발생하는 이유는 파라미터가 JButtonView
	//타입인 생성자가 선언되어 있지 않아서 발생한 오류이다.
	JButtonEventHandler event = new JButtonEventHandler(this); //this 재사용할수있다. 원본을 공유하는과정.
	
	public void initDisplay() { // 메소드
		System.out.println("initDisplay 호출 성공!!");
		// 이코드가 있어야 콜백메소드가 호출됨.
		// 언제? 버튼이 눌려졌을때
		jbtn_north.addActionListener(event); // this 나자신 제이버튼클래스1 (컨벤션)
		jf.add("North", jbtn_north);
		jf.setSize(400, 300); // 무조건 인트값을 줘야함.
		jf.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		JButtonView jbt = new JButtonView(); // 인스턴스화
		jbt.initDisplay(); // 메소드 실행
	}

}
