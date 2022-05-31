package F_Test;

public class Num6 {

	public static void main(String[] args) {

		int score = 89;
		char grade = ' ';
		
		if(score >= 90) { // 90점 이상일 경우 A학점
		grade = 'A';
		} else if(score >= 80) { // 90점 미안 80점 이상일 경우 B학점
		grade = 'B';
		} else if(score >= 70) { // 80점 미만 70점 이상일 경우 C학점
		grade = 'C';
		} else { // 70점 미만일 경우 F학점
		grade = 'F';
		}
		System.out.println("점수 :" + score + ", 학점 : " + grade);
		
		System.out.println();
		
		//중첩 if 문에 횟수 제한은 없다.
		
		int score1 = 92;
		String grade1 = "";
		if(score >= 90) { // 90 점 이상일 경우 ‘A’ 대입
		grade1 = "A";
		if(score1 >= 98) { // 90 점 이상인 값 중 98점 이상일 경우 ‘+’ 추가
		grade1 += "+"; //=grade1+
		}
		} else if(score1 >= 80) { // 80 점 이상일 경우 ‘B’ 대입
		grade1 = "B";
		if(score1 >= 88) { // 80 점 이상인 값 중 88점 이상일 경우 ‘+’ 추가
		grade1 += "+";
		}
		} else if(score1 >= 70) { // 70 점 이상일 경우 ‘C’ 대입
		grade1 = "C";
		if(score1 >= 78) { // 70 점 이상인 값 중 78점 이상일 경우 ‘+’ 추가
		grade1 += "+";
		}
		} else { // 그 이하 점수일 경우 ‘F’ 대입
		grade1 = "F";
		}
		System.out.println("점수 :"  + score1 + ", 학점 :"  + grade1);
	
			 }
			
	
	
	}


