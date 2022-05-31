package F_Test;
//사용자에게 문자열을 입력 받아 그 문자열의 길이를 출력하고, 입력한 문자열이 "exit"면 본 프로그램을 종료하도록 만들고 싶다. 

//하지만 코드의 일부분 때문에 본 의도대로 프로그램이 제대로 돌지 않는다. 아래의 코드를 보고 문제점이 
//있는 부분을 찾아 파악된 문제점을 [원인](15점)에 기술하고, 각 문제 점에 대한 해결 방안을 [조치내용](15점)에 작성하시오. (30점)

import java.util.Scanner;

public class Test111 {

		public static void main(String[] args) {  //메인매소드 사용

			Scanner sc = new Scanner(System.in);

			while(true) { //false를 true로 바꿔준다.

				System.out.println("문자열을 입력해주세요: ");
				String str = sc.nextLine(); //문자열 값을 받기
				if(sc.next().equals("exit")) { // ==이 아니라 equals로 비교해야한다. ==은 주소번지의 비교이기 때문에 쓸 수 없다.
					break; // exit을 입력하면 프로그램을 종료합니다.
				} else{
	            System.out.println(str.length()+"글자입니다.");
			}//////end of while
			System.out.println("프로그램을 종료합니다.");
		}
	
	}
}