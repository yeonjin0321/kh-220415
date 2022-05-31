package com.day9;

class OCJP_pq1 {
	public byte getNumber() { // 클래스A
		return 1;
	}//end of getNumber
} // end of ocjp_pq1

public class OCJP_q1 extends OCJP_pq1  { // 클래스B
	
	public short getNumber(int x) { //오버로딩때문에 가능한 구조
		return 2;
	}////end of getNumber

	public static void main(String[] args) {

		OCJP_q1 b = new OCJP_q1();
		System.out.println(b.getNumber()); //2가 출력됨.
	}
}//// end of OCJP_q1
