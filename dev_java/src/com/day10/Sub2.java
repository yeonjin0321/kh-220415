package com.day10;

class Super2 {
	public float getNum() {
		return 3.0f;
	}
}

public class Sub2 extends Super2 {
	@Override

	public float getNum() {
		return 4.0f; // 리턴 타입이 달라져서 가능
	} 
	// 왜 되는건가요? 메소드 오버로딩의 조건을 수렴하여서.
	public double getNum(int i) {
		return 4.0f; // b가 답. 가능하게 바꿔보면 인트로 바꿔야함.
	} 
	public double getNum(double d) {
		return 4.0f; // 가능
}
		public double getNum(float f) {
			return 4.0f; // 가능
	}
		public double getNum(float f, String name) { //파라미터의 개수 달라짐 OK
			return 4.0f; // 가능
	}
}