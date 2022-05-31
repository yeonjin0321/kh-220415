package com.test1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		
		boolean run =true; //불리언 타입 run 실행되는동안.
		int balance =0; //잔고의 초기값은0
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			//작성 위치
		
			int num = scanner.nextInt(); // 스캐너 입력받는 값
			int money =0;
			
			if(num==1) {
				System.out.println("예금액> ");
				money = scanner.nextInt(); //예금액 입력받는 값.
				balance += money;
			} else if(num==2){
				System.out.println("출금액> ");
				money = scanner.nextInt(); //출금액 입력받는 값.
				balance -= money;
			}else if(num==3){
				System.out.println("잔고> " + balance); //잔고 나타내기
			}else {
			run=false;	//운행하지 않을때는 종료함.
				}
		}
			System.out.println("프로그램을 종료합니다.");
	
		}
}
