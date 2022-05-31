package F_Test;

public class Num2 {

	public static void main(String[] args) {

		
		int intVal =100;
		double doubleintVal = intVal; // 100이 100.0으로 타입변환 된 후 대입됨.
		System.out.println("intVal: "+intVal+" dounleintVal: "+intVal);
		
		char chVal ='A';
		int uniCode = chVal; //문자 A의 유니코드 65, 즉 정수로 자동 타입변환이 된 후 출력
		System.out.println("chVal: "+chVal+" uniCode: "+uniCode);
		
	}

}
