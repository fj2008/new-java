package chapter3;

public class Ex16 {

	public static void main(String[] args) {
		//Ŭ������������� �ν��Ͻ���������� �����ϱ� ���� Ŭ��������������Ѵ�
		
		//�ν��Ͻ� ��������� �ν��Ͻ������� ���� �ɶ� ���� ���������
		//������½ñ�� �ν��Ͻ��� �Ҽӵ� �ڵ� ����� ���� ��������
		
		//Ŭ���� ��������� Ŭ������ �ε�ɶ� �����ƴٰ�
		//���α׷��� ����ɶ� �������
		
		//Ŭ���������� �ν��Ͻ� ����������� ���� ����ٰ� �������� ������
		SimpleType1 type1 = new SimpleType1();
		type1.num1 = 10;
		SimpleType1.num2 = 11;
		
		SimpleType1 type2 = new SimpleType1();
		type2.num1 = 20;
		SimpleType1.num2 = 21;
		System.out.println(type1.num1);
		System.out.println(type2.num1);
		System.out.println(type1.num2);
		System.out.println(type2.num2);
		
	}

}
