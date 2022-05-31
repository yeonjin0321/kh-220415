package com.day13;

import java.util.Scanner;

public class FizzBuzzGame {
	void FizzFor() // for문을 이용한 메소드

	{
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz ");
			} else if (i % 3 == 0) {
				System.out.print("Fizz ");
			} else if (i % 5 == 0) {
				System.out.print("Buzz ");
			} else {
				System.out.print(i + " ");
			}
		}
	}
}