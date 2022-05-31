package com.test1;

public class ArrayLengthExample {

	public static void main(String[] args) {

		//선언부
		int scores[] = {83,90,68}; 
		int sum =0 ; //총합 초기화
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합:" + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("평균:" + avg);
		
	}

}
