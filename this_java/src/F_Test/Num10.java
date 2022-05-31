package F_Test;

import java.util.Scanner;

public class Num10 {

	public static void main(String[] args) {


		
		String strArr[ ] = { "Apple", "Banana", "Orange" };
		System.out.println("배열의 길이는" + strArr.length + "입니다");
		for(int i= 0; i < strArr.length; i++)
		System.out.println(strArr[i]);
		
		System.out.println();
		//배열카피 함수를 통한 복사
		
		String originArr[ ] = { "Apple", "Banana", "Orange" };
		String destArr[ ] = new String [originArr.length];
		 System.arraycopy(originArr, 0, destArr, 0, originArr.length);
		for(int i = 0; i < destArr.length; i++)
		System.out.println(i + " : " + originArr[i] + ", " + destArr[i]);
		
	}

}
