package ex0923;

import java.util.Scanner;

public class IfText01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("num 입력:");
		
		int num=sc.nextInt();//값을 입력받음
		
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		System.out.println("end");

	}

}
