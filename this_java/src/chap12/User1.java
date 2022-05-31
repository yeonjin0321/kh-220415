package chap12;

public class User1 extends Thread {

	private Calculator calculator; // 필드선언

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // 스레드 이름을 유저1으로 저장
		this.calculator = calculator; // 공유 객체인 칼큘레이터를 필드에 저장한다.
	} // 매소드 호출

	public void run() {
		calculator.setMemory(100);
	}
}