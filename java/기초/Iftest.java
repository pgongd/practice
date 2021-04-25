package ex0923;

import java.util.Scanner;

public class Iftest {

	public static void main(String[] args) {
		
		/*
		 * 369게임을 간단하게 작성. 1-99까지 정수를 입력하고 3,6,9 중 하나가 있는 경우 ‘박수짝’ 을 출력하고, 두 개 있는 경우 ‘박수짝짝’을 출력하는 프로그램을 작성하라.

		 * */
		int num, count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-99 사이의 정수를 입력하시오>>");
		num = scanner.nextInt();
		if(num>=1 && num <= 99) {
			int a, b;
			a= num /10; //10의 자리에서 3,6,9 검사
			b= num % 10;// 1의 자리에서 3,6,9 검사
			if(a!=0 && a%3==0)
				count++;
			if(b!=0 && b%3 ==0)
				count++; //1의 자리 정수에 3.6.9중 하나가 있는 경우 numberOf369증가
			if(b!=0 && b%3==0)
				count++; //1의 자리 정수에 3,6,9중
		}
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("지불할 금액을 입력하세요");
		num = scanner.nextInt();
		
		

		
	}

}
