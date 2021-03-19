package chapter3;

import java.util.Arrays;

public class Ex20 {

	public static void main(String[] args) {
		int num1 = 10;
		int [] arr1 = new int[2];
		arr1[0] = num1;
		//num1이 가지고있는값이 복사되어 arr1로 감
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		num1++;
		
		System.out.println(num1);
		System.out.println(Arrays.toString(arr1));
		
		Ex14 student = new Ex14();
		student.name = "김철수";
		
		Ex14[] studentList = new Ex14[2];
		studentList[0] = student;
		//객체를 저장을하면 객체가 가지고있는 메모리 주소가 연결되어있기때문에
		//서로 연관되어있음
		System.out.println(student.name);
		System.out.println(studentList[0].name);
		
		
	}

}
