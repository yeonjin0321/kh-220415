package com.day15;

import javax.swing.JDialog;

public class B_2 extends JDialog {

	public B_2() {
		initDisplay(); // 왜 앞에 b. 안붙지??
	}

	public void initDisplay() {
		this.setTitle("자손창-다이얼로그");
		this.setSize(300, 500);
		this.setVisible(true);
	}

}
