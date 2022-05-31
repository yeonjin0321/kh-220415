package Self_Test;

import java.util.Random;
import java.util.Scanner;
 
public class TsetGame {
 
    public static void main(String[] args) {
        Random random = new Random();// 랜덤 수 만드는 객체 생성
        int answer = random.nextInt(8)+1; // 정답 인트 정수 선언. 100까지의 수만 랜덤 0부터라 1더함.
       System.out.println("정답 미리보기: " + answer);
        int input_number; //입력한 숫자
        int repeat_count = 0; //시도 횟수 알려주기
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~9사이의 숫자중 하나로 배정된 숫자를 맞추시오.");
       
        //do while로 실행
        do {
            System.out.print("정답: ");
            input_number = scanner.nextInt(); // 정답: 옆에 숫자 쓸 수 있도록함.
            repeat_count++; //횟수 1회씩 증가
            if (input_number > answer) {
                System.out.println("좀 더 낮은 수를 입력하세요.");
            }
            if (input_number < answer) {
                System.out.println("좀 더 높은 수를 입력하세요.");
            }
        }// do
        while (input_number != answer); //정답이 아닌동안. 맞다면 빠져나와서 정답.
        
        System.out.printf("정답입니다. 총 시도횟수는 %d회 입니다.\n", repeat_count);
 
    }//메인
 
}//클래스