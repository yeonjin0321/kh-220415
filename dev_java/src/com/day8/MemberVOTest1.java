package com.day8;

import com.method.MemberVO;

public class MemberVOTest1 {

	public static void main(String[] args) {
		// 변수를 선언할 때 타입이 먼저이다.
		MemberVO mVO = new MemberVO();
		mVO.setName("이순신");
		System.out.println(mVO.getName());
		// 파라미터에 입력한 문자열 상수는 어디에 저장되어 있을까요?
		// mVO 클래스의 전역변수인 name 변수에 들어와있다.
		// 출력해보세요
		// 변수 선언시 접근제한자가 private으로 되어 있어서 그렇다.

		// 그럼 어떻게 가져올까요?
		// 같은 타입의 클래스라 하더라도 new를 통해서 인스턴스화를 여러번 하면,
		// 타입은 같지만 다른 객체가 여러개 만들어지는 것이다.
		mVO = new MemberVO(); // 8번의 mVO와 19번은 주소번지가 다르다.
		//타입을 적게 되면 (9번) 또 중복하여 똑같이 적게되면 같은 이름의 변수가 생겨 중복.
		mVO.setName("강감찬");
		System.out.println(mVO.getName());
	}

}
