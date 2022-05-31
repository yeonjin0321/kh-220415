package com.day8;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//액션리스너 임포트해줘야함.
public class JTextAreaTest1 extends JFrame implements ActionListener{
	//제이텍스트에어리아테스트1 추상메서드 선언해줘야함 오버라이드해야함. (빨간거 뜨면 첫번째거)
	//선언부
	JTextArea jta_display = new JTextArea(); //메세지 내용칸
	//제이텍스트에 오늘 스터디할까 엔터 쳤을때 제이텍스트필드에는 문자열을 지우고
	//제이텍스트에어리어에는 방금 입력한 메세지를 출력해 본다.
	JTextField jf_msg = new JTextField(); //메세지를 쓰는곳.

	//메소드 선언
	public void initDisplay() {
		
		jf_msg.addActionListener(this);// 메세지 쓰는 부분을 이용하니까 msg.
		jta_display.setBackground(Color.orange);
		jf_msg.setBackground(Color.lightGray);
		this.add("Center",jta_display);
		this.add("South",jf_msg);
		this.setSize(300, 400); //JFrame 상속을 받았기 때문에 this
		this.setVisible(true); // false이면 비활성화
	}

	public static void main(String[] args) {
		JTextAreaTest1 jtt = new JTextAreaTest1(); //인스턴스화
		jtt.initDisplay();
		
	}
@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); //주소번지 가져오고
		//이벤트 소스가 msg와 같니? ->엔터를 쳤다는 뜻
		if(obj == jf_msg) {
			jta_display.append(jf_msg.getText()+"\n");//입력한 값을 가져와서 txtarea에 넣어줌 역슬래시 줄 바꿈
			jf_msg.setText(""); //치고 나서는 지워야지 공백으로!
		}
	}
	
	
}
