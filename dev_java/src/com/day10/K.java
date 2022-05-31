package com.day10;

public class K {
	
	public static int switchIt(int x) { 
		int j = 1;
		switch (x) { 
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4: //여기
			j++;
			break;
		case 5:
			j++;
			break;
		default:
			j++;
		}
		return j + x;
	}

	public static void main(String[] args) {
//스테틱이 붙어서 인스턴스화 필요 없음K k =new K();
		System.out.println(switchIt(1));
	}

}
