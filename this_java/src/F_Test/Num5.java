package F_Test;

public class Num5 {

	public static void main(String[] args) {

		
		int data = 10;
		
		System.out.println("data : " + data); //10
		System.out.println("10의 1의 보수 : " + ~data); // ~비트 반전 연산자 정수일 경우 부호가 반대로 변경
		 System.out.println(" 10의 0의 보수 :"+ (~data + 1)); // -11+1 =-10
		
		
		//삼항 연산자 조건식 ? 값1 : 값2
		 
	
			 int value = 123;
			 String result = (value % 2 == 0)? "짝수": "홀수"; // true이면 짝수, 아니면 홀수
			 System.out.println( value + "는"  + result + "이다.");
		
			 }
			

	
	}


