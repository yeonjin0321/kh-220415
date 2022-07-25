package com.mvc.step1;

public class Pattern {

	public static void main(String[] args) {
		String uri = "/pay/payManager.gym";
		String uri2 = "/dev_web/pay/payManager.gym";
		String context = "";
		String context2 = "dev_web/";
		
		String command = uri.substring((context.length()+1));
		int end = command.lastIndexOf(".");
		command = command.substring(0,end);
		String upmu[] = null;
		upmu = command.split("/");
		//pay까지는 업무이름이다. - CRUD공통사항
		//메소드 이름 지정 다르게 처리하는것이 가능할것.
		for(String imsi:upmu) {
			System.out.println(imsi); // 두번출력 pay, payManager
		}
		
	}

}
