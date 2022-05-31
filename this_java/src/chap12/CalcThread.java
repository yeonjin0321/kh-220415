package chap12;

public class CalcThread extends Thread{

	public CalcThread(String name) {
		setName(name); //스레드 이름을 변경
	}
	
	public void run() {
		for (int i =0; i<=200000000;i++) {
			
		}//스레드가 실행할 내용이다.
		System.out.println(getName());
	}
}
