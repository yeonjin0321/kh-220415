package com.sec06;

class MyPoint {
// 두점 (x,y) 와 (x1,y1) 간의 거리를 구한다.
//제곱근의 공식은 Math.sqrt를 사용하면 된다.

	int x; //인스턴스 변수
	int y;

	MyPoint(int x, int y){
		this.x=x;
	     this.y=y;
	} //생성자

	double getDistance(int x1, int y1) {

		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1)); // x와y는 인스턴스변수이다.
	}
	static class Ex6_6 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1); //x,y는 1
			System.out.println(p.getDistance(2,2)); 
	}
	}
}
