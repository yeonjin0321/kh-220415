package Self_Test;

import java.util.Scanner;

public class TestGame2 {
	public static void main(String[] args) {

		// 선언
		int count = 5; //기회 5번 선언
		int randNum = (int) (Math.random() * 9) + 1; //난수 1~9
		int userNum; //사용자가 입력한 숫자
		Scanner scanner = new Scanner(System.in);
		// 판정

		// for문으로 구현
		for (int i = 0; i < 5; i++) {
			System.out.println("남은 횟수 : " + count + "회");
			userNum = scanner.nextInt();
			if (userNum < 1 || userNum > 9) {
				System.out.println("값을 다시 입력하세요");
				i = i++;
			} else {

				if (userNum == randNum) {
					System.out.println("답은 " + randNum + "입니다");
					System.out.println("축하합니다 " + (6 - count) + " 회 만에  맞추셨습니다");
					break;
				} else if (userNum > randNum) {
					System.out.println("DOWN");
					count--;
				} else if (userNum < randNum) {
					System.out.println("UP");
					count--;
				}

				if (count == 0) {
					System.out.println("다섯번의 기회를 다 소진하셨습니다.");
					System.out.println("답은 " + randNum + "입니다");
					break;
				}
			}
		}
	}
}