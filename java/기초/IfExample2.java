package ex0923;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력");
		int age = sc.nextInt();
		
		if(age>=8 && age<=13) {
			System.out.println("초등학생");
		} else if (age>=14 && age<=16) {
			System.out.println("중학생");
		}else if (age>=17 && age<=19) {
			System.out.println("고등학생");
		}else if (age>=20 && age<=26) {
			System.out.println("대학생");
		}else {
			System.out.println("학생이 아닙니다.");
		}
		
		if(age<8 || age>26) {
			System.out.println("학생이 아닙니다.");
		}else if(age<=13) {
			System.out.println("초등학생");
		}
		else if(age<=16) {
			System.out.println("중학생");
		}
		else if(age<=19) {
			System.out.println("고등학생");
		}
		else {
			System.out.println("대학생");
		}
		
		
		sc.close();
		
	}

}
