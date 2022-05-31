package com.day13;

public class SwitchTset_1 {

	public static void main(String[] args) {
	
		int i = 1,j = -1;
		switch(i) {
		case 0: case 1:
			j = 1; //j=1 저장, break 예약어가 없어서 계속 아래로 진행됨.
		break;
		case 2:
			j = 2;
		default:
			j = 0;
		}
		System.out.println("j =" +j);
		
		/*What is the result?
		A. j = -1
		B. j = 0
		C. j = 1
		D. j = 2
		E. Compilation fails.
		Answer: E*/
	}

}
