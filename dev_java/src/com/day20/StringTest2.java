package com.day20;

import java.util.StringTokenizer;

public class StringTest2 {

	public static void main(String[] args) {

		String insa = "Have,a,good,time!!!";
		
		StringTokenizer st = new StringTokenizer(insa,","); //인사와 쉼표로 구분하는
		int count = st.countTokens();
		String words[] = new String[count];
		int i = 0;
		while(st.hasMoreElements()) {
			words[i]=st.nextToken();
			i++;
		}
	for(int j=0 ; j<words.length; j++) {
		System.out.println(words[j]);
	}
	for(int j=words.length-1;j>=0; j--) { //리버스
		System.out.println(words[j]);
	}
	}
}
