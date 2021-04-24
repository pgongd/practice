package ex0923;

import java.util.Scanner;

public class IfSwitchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int score=sc.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;		
		
		}
		

		
	}

}
