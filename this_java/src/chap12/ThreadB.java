package chap12;

public class ThreadB extends Thread {


	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println(getName()+"가 출력한 내용"); // 스레드B 실행내용
		}
	}
	
}
