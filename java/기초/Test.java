package ex0923;


public class Test {
	public static void main(String args[]) {
		
		
		int a=5; //000~ 101
		int b=6; //000~ 110
		int c=10;
		
		System.out.println(a>b?a:b); //삼항연산자
		System.out.println(c>>2);
		System.out.println(c>>>2);
		System.out.println(a&b);
		System.out.println(a|b); //둘중 하나만 1이여도 1 그래서 7이나옴
		System.out.println(a^b);
		System.out.println(a>>>1); 
		System.out.println(a>>1); //오른쪽으로 1비트 밀어버림 5를 2로 나누는것과 같음 //1이 나울것 
		System.out.println(a<<2); //왼쪽5 곱하기 4하는 것과 같음 쉬프트 연산자라고함 소수점 없어짐
	}
}
