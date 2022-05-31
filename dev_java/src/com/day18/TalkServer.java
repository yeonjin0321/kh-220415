package com.day18;


import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class TalkServer extends JFrame implements Runnable { // 제이프레임 상속, 러너블 구현.
	//서버에 접속한 사용자를 관리하는 그림자가 있어야 해.
	List<TalkServerThread> globalList = null; //타입에 상관없이 모두 담을 수 있다.
	
	ServerSocket server = null;
	Socket client = null; // 소켓이 2개가 필요하다고 하였음

	JTextArea jta_log = new JTextArea(10, 30);
	JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

	public TalkServer() { // 생성자 정의

	}

	@Override
	public void run() {
		globalList = new Vector<>(); //숫자 줘도 되지만, 디폴트로 두면 늘어남 
		//자료구조 , 컬렉션프레임워크 다이아몬드연산자 -제네릭
		boolean isStop = false;

		try {
			// 서버측 컴터에 서버를 기동하기 위한 객체 생성하기이다. - 클라이언트의 접속만 받아준다.
			// 동시에 많은 유저가 접속하더라도 , 튕기지 않고 모두 안전하게 접속을 허용하기 위해서
			// 그 일만 전담하는 서버소켓이 있는 것이다. -클라이언트측에는 필요가 없다는 것이다.(서버에서 처리)
			server = new ServerSocket(6003);
			jta_log.append("Server READY...........\n");
			while (!isStop) {
				client = server.accept();
				// 들어온 아이피 <- 찍힘
				jta_log.append("client info" + client.getInetAddress() + "\n"); //ip수집할수 있는 것.
				TalkServerThread tst = new TalkServerThread(this); //this 는 톡서버를 가리킴. 
				//스레드의 start();가 호출되어야 run호출함.
				tst.start();
			}
		} catch (Exception e) {
			
		}

	}

	public void initDisplay() {
		this.add("Center", jsp_log);
		this.setTitle("서버 로그창");
		this.setSize(500, 400);
		this.setVisible(true);

	}

	public static void main(String[] args) { // 메인매소드
		// 톡서버 인스턴스화 ->클라이언트의 아이피 주소를 받을수 있는 창 (32번줄)
		TalkServer ts = new TalkServer();
		ts.initDisplay();
		Thread th = new Thread(ts);
		//스레드를 동작시키려면 , run메소드를 직접 호출하는게 아니라  start()호출하면
		//내부적으로 run() 메소드를 호출 해줌.
		th.start();
	}

}
