package ex0923;

import java.util.Scanner;

public class IfSwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("num1, num2, 연산자 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String op = sc.next(); //문자열은 바로 못온다
		
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("연산자 오류");
			break;
		}
		
		
//		char ch=op.charAt(0); //그래서 이렇게 바꿔줘야한다. //스위치문은 이거 없이 바로 op써도된다.
//		
//		
//		if(ch=="+") { //if(op.equals("+")) 문자열일 경우 이렇게 써야한다.
//			System.out.println(num1+num2);
//		}else if(ch=="-") {
//			System.out.println(num1-num2);
//		}else if(ch=="*") {
//			System.out.println(num1*num2);
//		}else if(ch=="/") {
//			System.out.println(num1/num2);
//		}else {
//			System.out.println("연산자 오류");
//		}
		
	}

}
