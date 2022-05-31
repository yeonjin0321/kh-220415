package chap12;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how1
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); // 런메소드 실행
		thread.start();*/
		// 띵 문자열을 5번 출력하는 작업.
		
		/*ow2 익명객체
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
				}
				try {
					Thread.sleep(500); //0.5초 일시정지
				} catch (Exception e) {
				}
			}
		});
		thread.start();*/
		
		//람다식 사용
		Thread thread = new Thread( ()->{
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
			}
			try {
				Thread.sleep(500); //0.5초 일시정지
			} catch (Exception e) {
			}

		});
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500); // 0.5초 일시정지
		} catch (Exception e) {
		}
	}
}
