package com.day10;

public class X4 {

	public static void main(String[] args) {

		// 이때 true는 논리연산자가 아니다.
		Boolean s1 = new Boolean(true);

		Boolean b1 = new Boolean(true);
		System.out.println(s1+","+b1);
		if (s1.equals(b1)) { // 둘이 같다면
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		if (s1 == b1) {
			System.out.println("주소번지가 같다.");
		} else if(s1!=b1) {
			System.out.println("주소번지가 다르다.");
		}

	}

}
