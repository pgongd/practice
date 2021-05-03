package ex0923;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((char)('a'-32));
		
		
		scanner.close();//scanner닫기
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("이름 도시 나이 체중 독식 여부를 빈칸으로 분리하여 입력하세요");
		String name=sc.next();
		String city=sc.next();
		int age=sc.nextInt();
		double weight=sc.nextDouble();
		boolean single=sc.nextBoolean();
		
		System.out.println("이름은"+name+", 도시는"+city+",나이는"+age+"살, 체중은"+weight+"kg, 독신여부는"+single+"입니다");
		
		sc.close();//scanner닫기
	}
}
