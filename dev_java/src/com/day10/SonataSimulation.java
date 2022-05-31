package com.day10;

import javax.swing.JButton;

//가능하면 main 메소드에 코딩하지 않고 클래스로 나누어서 코딩하기!
public class SonataSimulation {

	public static void main(String[] args) {
		Sonata myCar = new Sonata(65,"자주색",4); // 직접 대입
		Sonata herCar = new Sonata("핑크");

		System.out.println(myCar+", "+ herCar); 
		System.out.println(myCar.toString()+", "+herCar.toString()); //오버라이드 to스트링
		
		JButton jbtn = new JButton("전송");
		System.out.println(jbtn);
	}

}
