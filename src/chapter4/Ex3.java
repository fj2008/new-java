package chapter4;

public class Ex3 {

	public static void main(String[] args) {
		//if else
		//조건식이 참일 경우 if의 코드 블록이
		//조건식이 거짓일 경우 else의 코드블록이 실행
		//두코드블록이 반듯이 실행되는 구조
		
		System.out.println("코드시작");
		
		if(false) {
			System.out.println("이 if 문은");
			System.out.println("참이므로");
			System.out.println("코드가 실행 됩니다.");
		}else {
			System.out.println("이 else문은");
			System.out.println("거짓이므로");
			System.out.println("코드가 실행되지 않습니다.");
			
		}
		
		System.out.println("코드종료");
		
		
		System.out.println("코드시작");
		
		int num = 1;
		if(num == 0) {
			System.out.println("변수 num에 들어있는 값은 0입니다.");
			
			
		}else {
			System.out.println("변수 num에 들어있는 값은 0이 아닙니다.");
		}
	
		
		System.out.println("코드종료");
int num1 = 50;
		
		if (num1 >=50) {
			System.out.println("50이상으 ㅣ값이 들어있습니다.");
		}else { 
			System.out.println("50미만의 값이 들어있습니다.");
		}
		double height = 150.1;
		if(height > 150) {
			System.out.println("탑승가능");
			
		}else {
			System.out.println("탑승안됨");
		}
		
	}
	
	

}
