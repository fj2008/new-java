package chapter3;

public class Ex22 {

	public static void main(String[] args) {
//		Numbers number = new Numbers();
//		//1,000,000
//		number.num1 = 1_000_000;
//		number.num2 = number.num1;
		
		//1�鸸 * 1�鸸 = 1,000,000,000,000,000,(1��)
//		int var = number.num1 *number.num2;
//		System.out.println(var);
		
		//���Ͱ��� ��Ȳ�� �����÷ο��� ��
		//ǥ���Ҽ��ִ� ���� ������ �Ѿ��
		//����÷ο�� ������ ���ǹ����� ��������
		
		double pi = 3.141592;
		
		System.out.println((double)pi);
		
		//�Ҽ��� 3° �ڸ����� ���
		
		double pi_1 = pi * 1000;
		System.out.println(pi_1);
		
		double pi_2 =(double) (pi* 100);
		System.out.println(pi_2);
		
		double pi_3 =(double) (pi* 100) + 0.5;
		System.out.println(pi_3);
		
		//�Ҽ��� 3° �ڸ����� �ݿø� �� ���
		

}
