package ex0923;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("영어 소문자 입력");
			str=sc.next();
			char ch=str.charAt(0);
			System.out.println((char)(ch-32));
		}while(!str.contentEquals("quit"));
		sc.close();
		System.out.println("end");
	}

}
