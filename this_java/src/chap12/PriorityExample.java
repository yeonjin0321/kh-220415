package chap12;

public class PriorityExample {

	public static void main(String[] args) {

		for(int i =1; i<=10; i++) {
			Thread thread = new CalcThread("thread"+i); //파라미터에 스레드 이름
			
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY); // 가장낮은 우선순위 설정.
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
