package com.day19;

import java.util.ArrayList;
import java.util.List;

public class ListTest_2 {
	List<String> list = new ArrayList<>();

	public void setList() {
		list.add("수박");
		list.add("토마토");
		list.add("사과");
	}
	public void printList() {
		setList(); //->수박 토마토 사과
		String ele = list.remove(1);
		boolean isFail = list.remove("사과"); // ""객체면 불리언타입이니 isFail새로운 변수로 해줌.
		//list.remove(1); //삭제가 잘 됨.
		list.add("바나나"); //맨 뒤에 저장될 것이다.
		// 배열처럼 첫번째 인덱스가 0이므로 두번째를 삭제할 경우 1을준다.
		//boolean isContain = list.contains("바나나");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // 3개중 토마토가 삭제되어 배열은 2개
		
		}
		System.out.println("삭제된 요소는 >" + ele + "<입니다.");
		System.out.println("응답 결과 값: " + isFail);
		System.out.println("바나나 있니? 응답 결과 값: " + list.contains("바나나")+", "+list.contains("키위"));
		if(list.contains("바나나")){
			System.out.println("바나나 있습니다. 드릴까요?");
				}
		
		System.out.println(list.isEmpty()); //비어있는지 확인
		System.out.println(list.set(1, ele));
		System.out.println(list.get(0));
	}
	public static void main(String[] args) {
		ListTest_2 lt = new ListTest_2(); // 디폴트 생성자 호출
		lt.printList(); //(삭제, 삭제 확인)결과값 불러오는 매소드 호출.
	}
}
