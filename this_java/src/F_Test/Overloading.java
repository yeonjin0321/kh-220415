package F_Test;

public class Overloading {
	public void test() {} 
	public void test(String str, double b) {} 
	public void test(int i) {} 
	public void test(String s ) {} // 오버로딩 6번과 겹침
	public void test(char ch) {} 
	public void test(String str,int i ) {} 
	public void test(int i,String str) {} 
	private void test(double b) {} 
	public int test1() {
		return 0;
	} 

}
