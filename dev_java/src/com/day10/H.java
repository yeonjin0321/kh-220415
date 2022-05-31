package com.day10; //28번문제

public class H {

	public static void main(String[] args) {
		 int i = 0, j = 1; //변수 선언 및 초기화
		 
		 if((i++ == 0) | (j++ == 2)) { //OR연산자 0과0이 같니? i=1 / 1은 2와 같니? 아니/ 하지만 앞에조건이 맞으므로 TRUE
		 i = 42;
		 }
		 System.out.println("i = " + i + ", j = " + j);


	}

}
