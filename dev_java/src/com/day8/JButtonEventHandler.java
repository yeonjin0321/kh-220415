package com.day8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonEventHandler implements ActionListener {
//선언부 에서 전역변수 만들어줘야함
	JButtonView jButtonView =null; //복제본 사용할수 없기 때문에
	
	public JButtonEventHandler(JButtonView jButtonView) { //변수이기떄문에 앞에j
		this.jButtonView = jButtonView;
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jButtonView.jbtn_north) {
			System.out.println("조회 버튼 클릭 성공"); // 오브젝트 겟소스 와 북쪽버튼이 일치하면 조회버튼 클릭성공 나옴
	}

	}
}
