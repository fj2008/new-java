package chapter3;

import java.util.Arrays;

public class Ex20 {

	public static void main(String[] args) {
		int num1 = 10;
		int [] arr1 = new int[2];
		arr1[0] = num1;
		//num1�� �������ִ°��� ����Ǿ� arr1�� ��
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		num1++;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		Ex14 student = new Ex14();
		student.name = "��ö��";
		
		Ex14[] studentList = new Ex14[2];
		studentList[0] = student;
		//��ü�� �������ϸ� ��ü�� �������ִ� �޸� �ּҰ� ����Ǿ��ֱ⶧����
		//���� �����Ǿ�����
		System.out.println(student.name);
		System.out.println(studentList[0].name);
		
		
	}

}
