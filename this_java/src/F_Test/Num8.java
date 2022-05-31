package F_Test;

public class Num8 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 1000 ; i++) { //정수 i타입, 1000까지, 1씩증가
		 sum += i; //sum= sum+i
		}
		System.out.println("1부터 1000까지 정수들의 합계 :" + sum);
		
		
		int i = 1; // 초기식
		sum = 0;
		while(i <= 100) { // 조건식
		 sum += i;
		 i++; // 증감식
		}
		System.out.println("1부터 100까지 정수들의 합 : " + sum);
		
			 }
			
	
	
	}


