package com.day15;

import javax.swing.JDialog;

//클래스 분할
//어떤 클래스 이던지 main 가질 수 있다.
public class B_4 extends JDialog { // 서브창. 따라서 A_3이 주도권을 갖고 있는것임.
	
	String title = null;
	boolean isView = false; //선언문

	public B_4() { //생성자
		System.out.println("B_3()생성자 호출 ");
		initDisplay(); 
	}

	public void set(String title, boolean isView) { //set 매서드
		this.setTitle(title);
		this.setVisible(isView);

	}

	public void initDisplay() { //initDisplay 매서드
		System.out.println("initDisplay 호출");
		this.setTitle("자손창-다이얼로그");
		this.setSize(300, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		B_4 b = new B_4();
		System.out.println("before ===>" + b);
		b.initDisplay();

		b = new B_4(); // 생성자에서 1번만 호출이기떄문에 1번만 나옴.
		System.out.println("after ===>" + b);
	}

}
