package Self_Test;

public class Shuffle {

	public static void main(String[] args) {
		int i =3 , j =6 ;
		
		int tmp; //임시 변수 
		
	
		System.out.println("i:"+i + " , " + "j:"+j);
		
		tmp = i; //i를 임시 변수 tmp에 넣고
		i = j; // j의 6을 i로 집어 넣어 i가 6이되게 한다.
		j = tmp; // tmp에 저장되어 있는 3을 j에 다시 돌려주면, 교환이 된다.
		
		System.out.println("i:"+i + " , " + "j:"+j);
		
		
	}

}
