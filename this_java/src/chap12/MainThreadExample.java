package chap12;

public class MainThreadExample {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); // 스레드 시작.
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start(); // 스레드 시작.
	}

}
