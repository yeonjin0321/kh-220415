package com.day10;

public class Y {

	public static void main(String[] args) {
		
		int i =1;
		int j =i++;
		System.out.println(i+","+j);
		if((i==++j) | (i++ == j)) { // 시프트 \
			// 실행문 진행
			i +=j; //i= i+j 3+2
		
		}
		System.out.println(i);
		
	}

}
