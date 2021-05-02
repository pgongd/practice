package ex0923;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름:");
		String name=sc.next();
		
		System.out.println("나이:");
		int age=sc.nextInt();
		
		System.out.println(name+","+age);
		sc.close();
	}

}
