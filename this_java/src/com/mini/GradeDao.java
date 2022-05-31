package com.mini;

import java.util.ArrayList;
import java.util.Scanner;
import com.mini.GradeDto;

public class GradeDao {
	ArrayList<GradeDto> list = new ArrayList<GradeDto>();
	Scanner scanner = new Scanner(System.in); //스캐너에 입력받음.

	public GradeDao() { //생성자 번호 나이 이름 점수1 점수2 점수3
		GradeDto gradeDto1 = new GradeDto(0, 24, "마크", 80, 70, 60);
		GradeDto gradeDto2 = new GradeDto(1, 26, "제노", 90, 50, 60);
		GradeDto gradeDto3 = new GradeDto(2, 27, "지성", 80, 80, 60);
		list.add(gradeDto1);
		list.add(gradeDto2);
		list.add(gradeDto3);
	}

	public void insert() { //INSERT 매서드 선언
		System.out.println("번호");
		int number = list.get(list.size() - 1).getNumber() + 1;

		System.out.println("나이");
		int age = scanner.nextInt();

		System.out.println("이름");
		String name = scanner.next();

		System.out.println("국어");
		int kor = scanner.nextInt();

		System.out.println("영어");
		int eng = scanner.nextInt();

		System.out.println("수학");
		int jpn = scanner.nextInt();

		GradeDto dto = new GradeDto(number, age, name, kor, eng, jpn);
		list.add(dto);
	}

	public int findIndex(String name) {
		int findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				findIndex = i;
				break;
			}
		}
		return findIndex;
	}

	public void delete() {
		System.out.println("삭제할 대상의 이름을 입력해주세요");
		String name = scanner.next();
		int findIndex = findIndex(name);
		if (findIndex == -1) {
			System.out.println("삭제할 대상을 찾을 수 없습니다.");
		} else {
			list.remove(findIndex);
			System.out.println("삭제가 완료 되었습니다.");
		}
	}

	public void select() {
		System.out.println("검색할 대상의 이름을 입력해주세요");
		String name = scanner.next();
		int findIndex = findIndex(name);
		if (findIndex == -1) {
			System.out.println("검색할 대상을 찾을 수 없습니다.");
		} else {
			System.out.println("대상의 정보 = " + list.get(findIndex).toString());
		}
	}

	public void update() {
		System.out.println("업데이트할 대상의 이름을 입력해주세요");
		String name = scanner.next();
		int findIndex = findIndex(name);
		if (findIndex == -1) {
			System.out.println("업데이트 할 대상을 찾을 수 없습니다.");
		} else {
			System.out.print("변경할 국어 점수: ");
			list.get(findIndex).setKor(scanner.nextInt());
			System.out.print("변경할 영어 점수: ");
			list.get(findIndex).setEng(scanner.nextInt());
			System.out.print("변경할 수학 점수: ");
			list.get(findIndex).setJpn(scanner.nextInt());
		}
	}

	public void selectOneScore() {
		System.out.println("학생의 총점및 평균 조회하기");
		String name = scanner.next();
		int findIndex = findIndex(name);
		if (findIndex == -1) {
			System.out.println("조회할 대상을 찾을 수 없습니다.");
		} else {
			int korScore = list.get(findIndex).getKor();
			int engScore = list.get(findIndex).getEng();
			int jpnScore = list.get(findIndex).getJpn();
			int sub = korScore + engScore + jpnScore;
			double average = (double) sub / 3;

			System.out.println(list.get(findIndex).getName() + " 님의 총점 : " + sub);
			System.out.println(list.get(findIndex).getName() + " 님의 평균 : " + average);
		}
	}

	public int allScore() {
		int sub = 0;
		for (int i = 0; i < list.size(); i++) {
			int korScore = list.get(i).getKor();
			int engScore = list.get(i).getEng();
			int jpnScore = list.get(i).getJpn();
			sub = sub + korScore + engScore + jpnScore;
		}

		return sub;
	}

	public void allAverage() {
		double average = (double) (allScore() / (3 * list.size()));
		System.out.println("학생 총점의 평균은 " + average + " 입니다.");
	}

	public void sort() {
		int sub[] = new int[list.size()];
		GradeDto temp;
		for (int i = 0; i < list.size(); i++) {
			int korScore = list.get(i).getKor();
			int engScore = list.get(i).getEng();
			int jpnScore = list.get(i).getJpn();
			sub[i] = korScore + engScore + jpnScore;
		}
		for (int i = 0; i < sub.length - 1; i++) {
			for (int j = i + 1; j < sub.length; j++) {
				if (sub[i] < sub[j]) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}