package com.day21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest_2 extends Object {

	public static void main(String[] args) {

		Map<String, Object> pmap = new HashMap<>();
		pmap.put("mem_id","tomato");
		pmap.put("mem_pw", "111");
		pmap.put("mem_name", "토마토");
		
		//메소드 호출의 리턴값으로 객체를 주입받을 수 있다.
		Set<String> set = pmap.keySet(); //키값 
	
		Object keys[] = pmap.keySet().toArray();// 한문장으로 연결. 자유자재로 다룰 수 있어야함.
		for(Object key :keys) { // 객체배열  오브젝트로 받아준다.
			System.out.println(key+", "+pmap.get(key));
			
		}
		

		
	}

}
