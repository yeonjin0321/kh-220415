package chap12;

public class User2 extends Thread {
	private Calculator calculator; // 필드선언
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
		
	}
	public void run() {
		calculator.setMemory(100);
	}
	
}
