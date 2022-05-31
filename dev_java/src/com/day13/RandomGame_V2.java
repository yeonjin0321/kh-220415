package com.day13;

import java.util.Random;
import java.util.Scanner;

public class RandomGame_V2 {
	//컴퓨터가 채번하는 일을 전담하는 메소드 구현
	public void randomNumber() {
		
	}
	//사용자가 입력하는 값을 받아서 판정하는 메소드에 전달하기 구현.
	public void userInput() {
		
	}
	public static void gameStart() {
		
		int cnt = 5; // 게임 유저들에게 회차 정보 제공, 선언
		Random r = new Random();
		int dap = r.nextInt(10);
		Scanner scan = new Scanner(System.in);
		System.out.println("0부터 9까지의 숫자를 입력하시오."); //실행 후 먼저 출력
		String str = null;
		
//만일 i가 6이라면 for문 안에 실행문이 진행될 수 있을까?
		for (int i = 1; i < 6; i++) {
			str=scan.next();
			if (i == 5) {
				System.out.println("다섯번의 기회를 다 소진하셨습니다.");
				System.out.println("답은 " + dap + "입니다");
				break;
				
			}
			if (Integer.parseInt(str) == dap) {
				System.out.println("마따~");
				break;
			} else if (Integer.parseInt(str) > dap) {
				cnt--; //기회 낮춤
				System.out.println("나차라~");
				
			} else if (Integer.parseInt(str) < dap) {
				cnt--;
				System.out.println("노피라~");
				
			} 
	}
		}
	public static void main(String[] args) {

		RandomGame_V2 rv = new RandomGame_V2();
		RandomGame_V2.gameStart();

	}

}
