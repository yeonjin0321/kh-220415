package F_Test;

public class Num7 {

	public static void main(String[] args) {

	int score = 30;
	char grade = ' ';
	
	
		switch(score/10) {
			case 10:
			
			case 9: 
			grade = 'A';
			break; //
			
			case 8: 
			grade = 'B';
			break; //89점 여기서 빠져나옴.
			
			case 7: 
			grade = 'C';
			break;
			
			default: //다 해당이 안된다면.
			grade = 'F';
			
		}
	System.out.println("점수: "+ score+ "학점: "+ grade);
			 }
			
	
	
	}


