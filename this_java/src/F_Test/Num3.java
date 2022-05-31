package F_Test;

public class Num3 {

	public static void main(String[] args) {

		
		long longVal = 100L;
		int intVal = (int)longVal; // 8바이트 100이 4바이트 int 100으로 변환
		System.out.println(intVal);
		
		
		double dValue = 123.5;
		int iValue = (int)dValue;
		System.out.println(dValue);
		
		int maxValue = Integer.MAX_VALUE;
		long result = (long)maxValue*maxValue;
		System.out.println("result="+result);
		
	
	}

}
