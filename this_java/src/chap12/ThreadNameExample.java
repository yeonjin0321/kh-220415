package chap12;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체를 얻기.
		System.out.println("프로그램 시작 스레드 이름: "+mainThread.getName()); //메인스레드
		
		ThreadA threadA = new ThreadA();
		threadA.start(); //  스레드 이름설정
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: "+threadB.getName());
		threadB.start();
	}

}
