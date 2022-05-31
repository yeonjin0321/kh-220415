package com.day16;

public class StringArray {

	public static void main(String[] args) {
		String names[] = { "이순신", "강감찬", "이성계" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		for (String name : names) { // 향상된 for문
			System.out.println(name);
		}

	}

}
