package com.test1;

import java.util.Scanner;

public class Exercise09{
	public static void main(String[] args){
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);

		while(run){
			System.out.println("-------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------");
			System.out.print("선택> ");

			int selectNo = scan.nextInt();

			if(selectNo == 1){
				System.out.print("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum]; //학생들의 점수 배열
			
			}else if(selectNo == 2){
				for(int i = 0; i < studentNum; i++){
					System.out.print("scores[" + i + "]> ");
					scores[i] = scan.nextInt(); //for문 돌려서 점수값 받기
				}
			}else if(selectNo == 3){
				for(int i = 0; i < studentNum; i++){
					System.out.println("scores[" + i + "]: " + scores[i]);//점수리스트 보여주기
				}
			}else if(selectNo == 4){
				int max = 0;
				int min =0;
				int sum = 0;

				for(int i = 0; i < studentNum; i++){
					if(scores[i] > max) max = scores[i];{
						if(scores[i] < min) min = scores[i];{
					}
					sum += scores[i];
					}
				} //최고 값 평균값
				System.out.println("최고 점수: " + max);
				System.out.println("최하 점수: " + min);
				System.out.println("평균 점수: " + (double)sum/studentNum);
			}else if(selectNo == 5){
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}