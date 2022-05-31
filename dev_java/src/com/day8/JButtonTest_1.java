package com.day8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


/*
 * 이벤트 처리 순서
 * 1.해당 콤퍼넌트가 지원하는 이벤트 리스너 선정하기 - ActionListener -인터페이스 -추상메소드-메소드 오버라이딩(빨간거뜨는이유)
 * 2.이벤트 소스와 이벤트 처리 핸들러 클래스는 매핑한다.
 * 3.이벤트 처리를 담당하는 메소드 구현하기 = 콜백메소드
 */
//ActionListener를 임플리먼츠하는 클래스를 이벤트 처리를 담당하는 이벤트 핸들러 클래스라고 부른다.
// 제이버튼테스트_1은 액션리스너의 구현체 클래스이다.
//인터페이스 단독으로 인스턴스화 할 수 없다.
//인터페이스를 메모리에 로딩할 떄는 선언ㅇ부와 생성부의 이름이 다르다.
public class JButtonTest_1 implements ActionListener {
	// 선언부
	JFrame jf = new JFrame(); // 임포트문 자동생성
	JButton jbtn_north = new JButton("조회");

	// 생성자 - 리턴타입을 쓰면 안된다. 컨벤션 클래스뒤에 괄호
	// 생성자 선언할 때 리턴타입을 사용하면 메소드가 된다.
	// 생성자가 있어서 전역변수는 초기화를 생략할 수 있는 것이다.
	// 생성자도 호출이 된다. (밑에 생성자 호출 성공 프린트ln)
	public JButtonTest_1() {
		System.out.println("JButtonTest_1 생성자 호출 성공!!"); // 생성자
	}

	// 화면처리부-사용자 정의 메소드
	// 사용자 정의 메소드는 자동으로 실행되지 않는다.(자동x 내가 부르는것임)
	// 콜백메소드 - 시스템에서 자동으로 호출함 - main()
	// static이 붙은 변수는 클래스 급이다. (인스턴스화를 해야 쓸 수 있음)
	public void initDisplay() { // 메소드
		System.out.println("initDisplay 호출 성공!!");
		// 이코드가 있어야 콜백메소드가 호출됨.
		// 언제? 버튼이 눌려졌을때
		jbtn_north.addActionListener(this); // this 나자신 제이버튼테스트클래스1 (컨벤션)
		jf.add("North", jbtn_north); //북쪽에. 조회라는 버튼을 추가
		jf.setSize(400, 300); // 무조건 인트값을 줘야함.
		jf.setVisible(true); //화면 보이게
	}

//메인메소드 -exe 파일로 만들때만 필요한 부분이다.
	public static void main(String[] args) {
		// 생성부의 이름으로 객체가 만들어진다.
		// 메모리에 로딩이 일어난다.
		// 메소드와 변수를 누릴 수(호출) 있다.
		// 변수를 호출하면 값이 나온다. -원시형 타입
		// 참조형변수 (주소번지 ,ram 휘발성)
		// 인스턴스화에서 생성부는 생성자를 호출해주는 코드이다.
		JButtonTest_1 jbt = new JButtonTest_1(); // 인스턴스화
		jbt.initDisplay(); // 메소드 실행
	}

	@Override // 어노테이션 콜백메소드이다.
	public void actionPerformed(ActionEvent e) {
		//getSource() 호출하면 어떤 콤포넌트에 갑자기 되었는지 알수있다.
		//println 메소드는 메소드 오버로딩의 대표적인 예이다.
		//System.out.println(e.getSource());
		Object obj = e.getSource();
		if(obj == jbtn_north) {
			System.out.println("조회 버튼 클릭 성공");
		}
	}

}