package com.day18;

import java.util.StringTokenizer;

public class MessageParser {

	public static void main(String[] args) {

		
		String msg = "200#tomato#banana#오늘 스터디할까?"; // 토마토님이 입장하였습니다.
		StringTokenizer  st = new StringTokenizer(msg,"#");
		
		/*String protocol = st.nextToken();
		String nickName = st.nextToken();
		String toName = st.nextToken();
		String message = st.nextToken();
	
		System.out.println(protocol);
		System.out.println(nickName);	
		System.out.println(toName);	
		System.out.println(message);	*/
		
		while(st.hasMoreTokens()) {
			String imsi = st.nextToken();
			System.out.println(imsi);
		}
	}

}
