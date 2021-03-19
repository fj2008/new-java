package chapter4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
//		String a = "+";
//		//next 메서드 -> 사용자가 입력한 값을 문자열로 가져옴
//		String b = scanf.next();
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		
//		if(a==b) {
//			System.out.println("a와  b가 같습니다");
//		}else {
//			System.out.println("a와 b는 다르다");
//		}
		
		System.out.print("첫 번째 수를 입력하세요 :");
		int num1 = scanf.nextInt();
		System.out.print("두 번째 수를 입력하세요 :");
		int num2 = scanf.nextInt();
		System.out.println("연산자를 입력하세요 :");
		String num3 = scanf.next();
		
		if (num3.equals("+")) {
			System.out.println(num1 + num2);
		}else if(num3.equals("-")){
			System.out.println(num1 - num2);
			
		}else if(num3.equals("*")){
			System.out.println(num1 * num2);
		}else if(num3.equals("/")){
			System.out.println(num1 / num2);
		}else {
			System.out.println("연산자가 아닙니다.");
		}
		
	}

}
