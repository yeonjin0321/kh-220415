package com.day9;

public class P38 {
//캐스팅 연산자
	//자동형변환, 강제형변환
	public static void main(String[] args) {
		int i = 10;
		double d = 3.14;
		String s =null;
		boolean isOk = false;
		// 크기 때문에 안됨. i = d;
		i= (int)d;
		d = i;
	//바꿀 수 있는 타입이 아님	 s = (String)d;
		// isOk = (boolean)i; 안됨
	System.out.println(i);
	}

}
