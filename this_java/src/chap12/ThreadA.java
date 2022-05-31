package chap12;

public class ThreadA extends Thread {

	public ThreadA() {
		setName("ThreadA"); // 스레드의 이름을 설정
	}

	public void run() {
		for (int i=0; i<1; i++) {
			System.out.println(getName()+"가 출력한 내용"); // 스레드a 실행내용 
		}
	}
	
}
