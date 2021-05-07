package ex0923;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		String str="";
		
		/*
		  while(true) {

			System.out.println("영어 소문자 입력");
			str=sc.next();
			if(str.contentEquals("quit")) {
				break;
			}
			char ch=str.charAt(0);
			System.out.println((char)(ch-32));
		}
		sc.close();
		System.out.println("End");
		이런식으로도 가능 break문 사용
		*/

		
		while(!str.equals("quit")) {
			System.out.println("영어 소문자 입력");
			str=sc.next();
			char ch=str.charAt(0);
			System.out.println((char)(ch-32));
		}
		sc.close();
		System.out.println("End");
	}

}// 소문자를 대문자로 변경한다 quit가 나올때까지
