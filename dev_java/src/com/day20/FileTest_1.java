package com.day20;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest_1 {

	public static void main(String[] args) {

		FileWriter fw = null;
		try { // 바탕화면에 있는 dev자바 com20의 주소 끌고와서 입력.
			fw = new FileWriter(
					"C:\\Users\\yeonc\\eGovFrameDev-4.0.0-64bit\\JAVA_WORKSPACE\\dev_java\\src\\com\\day20\\log.txt");
			fw.write(65); // 아스키코드 65->A
			fw.write(97); // 아스키코드 97->a

		} catch (FileNotFoundException fe) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		} catch (Exception e) {
			// 예외가 발생했을때 에러 상황을 기록해두는 stack메모리 영역에 있는
			// 에러메시지를 라인번호와 함께 출력해주는 메소드 입니다.
			// 주의:절대로 프린트 메소드 안에서 사용하지 말것.
			e.printStackTrace(); // 에러 발생시 좀 더 자세한 힌트문을 수집할 때 사용함.
		} finally {
			// 예외가 발생하든 발생하지 않던 간에 반드시 처리해야하는 코드를 작성함.
			try {
				// 입출력의 경우 악의적인 목적으로 접근하여 외부에 노출될 수 있으므로,
				// 사용한 객체는 반드시 닫아야하는 컨벤션이 있다.
				fw.close(); // 사용한 자원을 닫아줘야한다. 반드시.
			} catch (Exception e2) {
				// TODO: handle exception
			}

		} /// end of finally

	}/// end of main

}/// end of filetest
