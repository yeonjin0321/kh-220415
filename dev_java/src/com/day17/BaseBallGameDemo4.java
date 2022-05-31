package com.day17;

import java.util.Scanner;

public class BaseBallGameDemo4 {
	
		int my[] = new int[3];
		
		public String account(String input) {
			System.out.println("사용자가 입력한 값 받아오기:"+input);
			
			if (input.length() != 3) {
				// 반복문을 탈출할 때는 break;
				// 조건문을 탈출시는 return이다.
				return "세자리 숫자를 입력하세요";
		
		}
		
		int temp = 0;
		try {
			temp = Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			return "숫자만 입력하세요.";
		}
		
		my[0]= temp/100;
		my[1]=(temp%100)/10;
		my[2]=temp%10;
		for(int val : my) { //향상된 for문
			System.out.println(val);
		}
		
		return "1스 0볼";
	}

	public static void main(String[] args) {
		BaseBallGameDemo4 bbg = new BaseBallGameDemo4();
		Scanner scan = new Scanner(System.in);
		System.out.println("0부터 9까지 세자리 숫자를 입력하세요."); 
		String result = bbg.account(scan.next());
		System.out.println("판정 결과:" + result);
	}

}
