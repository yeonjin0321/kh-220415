package com.day17;

public class BaseBallGameDemo1 {

	// 사용자가 입력한 숫자를 받는 코드
	public int userInput(String input) {
		int my = 0;
		//예외가 발생할 가능성이 있는부분.
		try {
			my = Integer.parseInt(input);
		
		} catch (NumberFormatException e) {
			System.out.println("제발 숫자만 입력하세요.");
		}
		System.out.println("요기");
		return my;
	}
	
	public static void main(String[] args) {
		BaseBallGameDemo1 bbg = new BaseBallGameDemo1();
		int result = bbg.userInput("123");
		
		System.out.println("사용자가 입력한 값은 " + result);
	}

}
