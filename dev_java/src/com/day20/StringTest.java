package com.day20;

public class StringTest {

	public static void main(String[] args) {
		String s = "이순신";
		s ="Hello World";
		System.out.println(s.length()); //문자열의 길이를 출력한다.
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.substring(0, 3));
		System.out.println(s.substring(7, 9));
		s = "java";
		s = s.replace('j','h' ); //스트링은 원본이 절대 바뀌지 않음.
		System.out.println(s); //s = 안쓰면 원본이 바뀌지 않고 있음. java or hava
		
	}

}
