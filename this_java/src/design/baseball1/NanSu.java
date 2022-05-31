package design.baseball1;

public class NanSu {

	// 컴퓨터가 난수발생으로 얻어낸 값 저장
	int[] com = new int[3]; //3개의 배열 생성

	public void NanSu(){ //난수 매서드 실행
	      com[0] = (int)(Math.random()*10);//0~9사이
	      do{
	         com[1] = (int)(Math.random()*10);
	      }while(com[0]==com[1]);
	      do{
	         com[2] = (int)(Math.random()*10);
	      }while((com[0]==com[2])&&(com[1]==com[2]));
	   }

	public static void main(String[] args) {
		NanSu ns = new NanSu();
		for (int i = 0; i < 10; i++) {
			ns.NanSu();
			System.out.println(ns.com[0] + "" + ns.com[1] + "" + ns.com[2]);
		}
	}
}
