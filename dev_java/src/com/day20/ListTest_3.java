package com.day20;

import java.util.List;
import java.util.ArrayList;

public class ListTest_3 {

	public static void main(String[] args) {

		List nameList = new ArrayList(); //네임리스트 어레이리스트
		nameList.add("나신입");
		System.out.println("사이즈"+nameList.size());
		String name = (String) nameList.get(0);
		//제네릭을 추가한 인스턴스화의 경우 타입체크 필요 없음.
		System.out.println(name);//나신입을 불러옴.
		
		List nameList2 =new ArrayList<>();
		nameList2.add("나초보");
		//제네릭에서 스트링 타입을 명시하였으므로 캐스팅 연산자가 필요없다.
		String name2 = (String) nameList2.get(0);
		System.out.println(nameList2.size());
		System.out.println(name2);//나초보
		
		List nameList3 = new ArrayList();
		nameList3.add("이사무");
		System.out.println(nameList3.size());
		String name3 = (String) nameList3.get(0);
		System.out.println(name3);
	}

}
