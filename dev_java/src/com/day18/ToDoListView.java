package com.day18;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;

public class ToDoListView extends JFrame {
	javax.swing.JLabel jlb_timer = new javax.swing.JLabel("현재 시간: ");
	Font f =new Font("궁서체",Font.BOLD,40);
	
	public ToDoListView() { //디폴트 생성자
		//화면을 그리는 메소드를 디폴트 생성자에서 호출해 보기.-표현력을 키운다. 위치를 다양하게 표현하기.
		//생성자 안에서 호출할때는 인스턴스화가 필요 없다!!! 직접호출이 가능하다.
		initDisplay(); //생성자에서 매소드 실행
		//객체주입
		TimeClient tc = new TimeClient(jlb_timer); //ui가 실행된 후에.
		tc.start(); //run()호출이 된다. -Thread검색 start()
	}
	
	public void initDisplay() { //매소드
		jlb_timer.setFont(f);
		this.setTitle("TODO VER1.0");
		this.setLayout(new FlowLayout());
		this.add(jlb_timer);
		this.setSize(500,300);
		this.setVisible(true);
		//jlb_timer.setText(null);
	}
	public static void main(String[] args) {
		ToDoListView tv = new ToDoListView();
		//tv.initDisplay(); 하면 두번 불러와지는것임
	}

}
