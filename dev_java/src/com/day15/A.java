package com.day15;

import javax.swing.JFrame;

//부모를 상속 받으면 부모가 정의하고 있는 변수와 메소드를 누릴 수 있다.
// 부모보다 자손이 더 많은 변수와 메소드를 누릴 수 있다.
public class A extends JFrame {
	B b = new B();

	public void initDisplay() {
		this.setSize(400, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		A a = new A(); //새로운 A객체. 
		a.initDisplay(); //8번때문에? B클래스 끌고와서. B의 initDisplay와 A의 initDisplay 같이 호출됨.
	}

}
