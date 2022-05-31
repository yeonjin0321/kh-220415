package com.day16;

public class IntArray_2 {
	// 부서번호를 담을 배열 선언
	int deptnos[] = null;

//아래 디폴트 생성자는 언제 호출되나요? -28
	public IntArray_2() {
		deptnos = new int[3];//배열 생성 - 어떤 장애를 갖고 있나? 오직 인트만 담을 수 있다. 해결점:컬렉션프레임워크 공부하면 된다. 
		initArray();
		arrayPrint();
	}

	public void initArray() {
		deptnos[0] = 10;
		deptnos[1] = 20;
		deptnos[2] = 30;
	}

	public void arrayPrint() {
		for (int deptno : deptnos) {
			System.out.println(deptno);
		}
	}

	public static void main(String[] args) {
		// 인스턴스 변수를 재사용하지 않는 경우라면 아래처럼 해도 괜찮아.
		new IntArray_2();
	}

}
