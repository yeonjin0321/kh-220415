package com.day19;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest_1 {
	// 제네릭
	Map<String, Object> map = new HashMap<>();
	public MapTest_1() {
		//Map계열은 값을 담을 때 put메소드를 사용한다.
		// 파라미터가 두 개 필요한데, 첫번째는 키값이고 두번째는 value 값이다.
		
		map.put("mem_id", "scott"); // 스트링 키+ 오브젝트 밸류
		map.put("mem_pw", "tiger");
		map.put("mem_name", "나신입");
		printMap();
	}
	public void printMap() {
		//키값만을 추출할 때 사용한다.
		Set<String> set = map.keySet(); //키셋만 가져옴.
		//키값이 3가지 이니까(id, pw ,name)이니까 배열에 담을 수 있다.
		//프론트엔드 개발자- 배열에 집중. 3차원배열은 제외, 다차원 배열은 제외
		Object obj[] = set.toArray();
		for(int i =0; i<obj.length;i++) {
			String key = (String)obj[i];
			System.out.println(key+": "+map.get(key)); //순서대로 안찍혀나옴. 그래서 빠르다.
		}
	}
	public static void main(String[] args) {
		new MapTest_1();
		//System.out.println();
	}
}
