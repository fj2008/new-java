package chapter4;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanf =new Scanner(System.in);
		System.out.print("¼ö : " );
		int num = scanf.nextInt();
		System.out.print("¼ö : " );
		int num1 = scanf.nextInt();
		if ((num>0 &&num>=100)&&(num1>0 &&num1>=100)) {
			System.out.println(num1);
		}else {
			System.out.println(num);
		} 
		
		
//		int jum = scanf.nextInt();
//		
//		if(jum >= 90) {
//			System.out.println("A");
//		} else if(jum >= 80) {
//			System.out.println("B");
//			
//		}else if(jum >= 60) {
//			System.out.println("C");
//		}else if(jum >= 40) {
//			System.out.println("D");
//		}
				
	}

}
