package com.sec06;

//매개 변수로 받는 생성자를 추가하고, 학생의 정보를 출력한 info()메서드를 정의하는 문제이다.
public class Exercise6_3 {

	public static void main(String[] args) {

		Student s2 = new Student();
				s2.name= "홍길동";
		s2.ban=1;
		s2.num=1;
		s2.kor=100;
		s2.eng=60;
		s2.math=76;
System.out.println("이름"+s2.name);
System.out.println("총점"+s2.getTotal());
System.out.println("평균"+s2.getAverage());

	}

}
// 두 개의 메서드 겟토탈,겟에버리지를 추가하시오.
class Student { //insert here

	
	String name ;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	
	Student(){} //기본생성자
		
	Student (String name, int ban, int num, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.eng = eng;
		this.kor = kor;
		this.math = math; // 생성자

	}
	int getTotal () {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)(getTotal()/3f*10*0.5f)/10f;
	}
	public String info() {
		return name +
				"," + ban
				+","+num
				+","+kor
				+ ","+eng
				+ ","+math
				+ ","+(kor+eng+math)
				+ ","+((int)((kor+eng+math)/3f*10*0.5f)/10f);
	}
}
