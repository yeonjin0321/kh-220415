package com.day20;

import java.util.ArrayList;
import java.util.List;

//어떤 값에 더블쿼테이션을 붙이면 스트링타입이다.
public class ListTest_4 {

	public static void main(String[] args) {
		//지네릭타입
		List<Integer> numberList = new ArrayList<>();
		numberList.add(5);
		numberList.add(7);

		Integer num = numberList.get(0);
		int num2 = numberList.get(1); // 원시형도 가능
		
		System.out.println(num);// 5
		System.out.println(num2);// 7출력.
	}

}
