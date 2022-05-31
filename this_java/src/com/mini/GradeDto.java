package com.mini;

public class GradeDto {
	int number;
	String name;
	int age;
	int kor;
	int eng;
	int jpn;

	public GradeDto() {
	} // 기본생성자

	public GradeDto(int number, int age, String name, int kor, int eng, int jpn) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.jpn = jpn;
	}

	// 게터세터로 캡슐화.

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getJpn() {
		return jpn;
	}

	public void setJpn(int jpn) {
		this.jpn = jpn;
	}

	@Override //상속 오버라이드
	public String toString() {
		return "GradeDto [number=" + number + ", name=" + name + ", age=" + age + ", kor=" + kor + ", jpn=" + jpn
				+ ", eng=" + eng + "]";
	}
}