package ex0923;

import java.util.Scanner;

public class Iftest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		
		if(score>90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}else if(score>70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
			
		
//		if(score>=70) {
//			System.out.println("축하합니다.");
//			System.out.println("합격입니다");
//		}else {
//			System.out.println("아쉽군요");
//			System.out.println("불합격입니다");
//		}
	}

}
