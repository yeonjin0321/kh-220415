package com.mini;



import java.util.Scanner;

import com.mini.GradeDao;

public class mainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeDao gradeDao = new GradeDao();
		while (true) {
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 삭제");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 학생의 총점및 평균 조회 (1명)");
			System.out.println("6. 학생성적 총점");
			System.out.println("7. 학생성적 평균");
			System.out.println("8. 학생성적순 출력 (총점에 대한)");
			int choice = scanner.nextInt();
			if (choice == 1) {
				gradeDao.insert();
			} else if (choice == 2) {
				gradeDao.delete();
			} else if (choice == 3) {
				gradeDao.select();
			} else if (choice == 4) {
				gradeDao.update();
			} else if (choice == 5) {
				gradeDao.selectOneScore();
			} else if (choice == 6) {
				System.out.println("학생의 총점은 " + gradeDao.allScore() + " 입니다");
			} else if (choice == 7) {
				gradeDao.allAverage();
			} else if (choice == 8) {
				gradeDao.sort();
			}
		}
	}
}