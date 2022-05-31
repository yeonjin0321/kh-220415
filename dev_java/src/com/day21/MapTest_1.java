package com.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 자바 자료 구조 - 랜덤하게 쓰기가 된다.
 * List보다 읽기와 쓰기가 빠르다.
 * List 구조는 인덱스로 접근하고
 * 그리고 순차적이다.(정렬- 2차 가공이 필요하다. 속도가 느리다.) 0.0001
 * 1초가 넘는 메시지를 서버가 매초마다 밀어낸다.
 */
public class MapTest_1 extends Object {

	public static void main(String[] args) {

		Map<String, Object> pmap = new HashMap<>();
		pmap.put("one", 1);
		pmap.put("two", 2);
		pmap.put("three", 2);
		pmap.put("three", 3);
		Set<String> set = pmap.keySet(); //키값 
		//insert here
	
		Object keys[] = set.toArray(); // 리턴타입이 참조형
		for(Object key :keys) { // 오브젝트로 받아준다.
			System.out.println(key+", "+pmap.get(key));
			
		}
		
		/*LinkedList<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
*/

		
	}

}
