package ex0923;

import java.util.Scanner;

public class ScannerEx02 {
	public static void main(String args[]) {
		
		
		
		
		int a=10;
		int b=3;
		int c=5;
		int d=a%b;
		
		System.out.println(~a);
		
		a=a+5;
		a+=5;
		a*=5;
		a-=5;
		a/=5;
		a%=5;
		
		System.out.println((a<b) && (a>c));
		System.out.println((a>b) || (a<c));
		System.out.println(!(a>b));
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		
		System.out.println(c);	
		System.out.println(a++); //a=a+1 11 작업한 후에 증가 후위연산자
		System.out.println(++a); //전위연산자
		System.out.println(a--);//11 a=a-1
		System.out.println(--a);//10
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 소문자 입력:");
		String str = sc.next();
		char ch=str.charAt(0);
		System.out.println((char)(ch-32));	
		
		System.out.println("주소입력");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println(address);
		
		
	}
}
