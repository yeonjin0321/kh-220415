package com.day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 회원가입
 * 아이디:입력하세요
 * <input type="text" name="mem_id">
 * 비번:입력하세요
 * <input type="text" name="mem_pw">
 * 이름:입력하세요
 * <input type="text" name="mem_name">
 * 이메일:입력하세요
 * <input type="text" name="mem_email">
 * */
public class MapTest_3 {
	// 제네릭
	Map<String, String> map = new HashMap<>();

	public MapTest_3() {
		// Map계열은 값을 담을 때 put메소드를 사용한다.
		// 파라미터가 두 개 필요한데, 첫번째는 키값이고 두번째는 value 값이다.

		map.put("mem_id", "scott"); // 스트링 키+ 오브젝트 밸류
		map.put("mem_pw", "tiger");
		map.put("mem_name", "나신입");
		// 선언이 먼저, 호출이 나중.
		printMap();
	} // end of 디폴트 생성자

	public void printMap() { // 매소드 호출! 엔트리셋 사용하여 처리하기.
		//20번에서 정의된 클래스를 사용하므로 제네릭 타입이 변하면 아래에서도 동일하게 바꿔야 한다.
		System.out.println(map.size()); //키값에 대한 원소의 수이다. 3개.
		for (Map.Entry<String, String> et : map.entrySet()) {
			System.out.println(" [key] : " + et.getKey() + ", [value] :" + et.getValue());
		}

	}

	public static void main(String[] args) {
		new MapTest_3();
		
	}

}
