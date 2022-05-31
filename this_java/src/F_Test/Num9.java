package F_Test;

import java.util.Scanner;

public class Num9 {

	public static void main(String[] args) {

		int n, or = 1, sum = 0; // 입력받을 정수, 순서, 합

		Scanner sc = new Scanner(System.in);

		do

		{

			System.out.print(or + "번째 정수 입력(-1 종료) : ");

			n = sc.nextInt();

			sum += n;

			or++;

		}

		while (n != -1);

		sum += 1;

		System.out.println("\n>> 현재까지 입력된 정수의 합 : " + sum);

	}

}
