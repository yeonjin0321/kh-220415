package com.baekjoon;

import java.util.Scanner;

public class VsAB {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		in.close();
        
		System.out.println((A>B) ? ">" : ((A<B) ? "<" : "==" ));
	}
 
}