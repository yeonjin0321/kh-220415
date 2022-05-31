package chap12;

public class BeepPrintExample3 {

	public static void main(String[] args) {

		Thread thread = new Thread();
		thread.start();// 비프스레드 실행
		
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}
