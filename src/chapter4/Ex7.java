package chapter4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
//		String a = "+";
//		//next �޼��� -> ����ڰ� �Է��� ���� ���ڿ��� ������
//		String b = scanf.next();
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
//		
//		if(a==b) {
//			System.out.println("a��  b�� �����ϴ�");
//		}else {
//			System.out.println("a�� b�� �ٸ���");
//		}
		
		System.out.print("ù ��° ���� �Է��ϼ��� :");
		int num1 = scanf.nextInt();
		System.out.print("�� ��° ���� �Է��ϼ��� :");
		int num2 = scanf.nextInt();
		System.out.println("�����ڸ� �Է��ϼ��� :");
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
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
		
	}

}
