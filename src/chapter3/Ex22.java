package chapter3;

public class Ex22 {

	public static void main(String[] args) {
//		Numbers number = new Numbers();
//		//1,000,000
//		number.num1 = 1_000_000;
//		number.num2 = number.num1;
		
		//1백만 * 1백만 = 1,000,000,000,000,000,(1조)
//		int var = number.num1 *number.num2;
//		System.out.println(var);
		
		//위와같은 상황을 오버플로우라고 함
		//표현할수있는 값의 범위를 넘어갈때
		//언더플로우는 음수로 값의범위를 내려갈때
		
		double pi = 3.141592;
		
		System.out.println((double)pi);
		
		//소수점 3째 자리까지 출력
		
		double pi_1 = pi * 1000;
		System.out.println(pi_1);
		
		double pi_2 =(double) (pi* 100);
		System.out.println(pi_2);
		
		double pi_3 =(double) (pi* 100) + 0.5;
		System.out.println(pi_3);
		
		//소수점 3째 자리에서 반올림 후 출력
		

}
