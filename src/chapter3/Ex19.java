package chapter3;

public class Ex19 {

	public static void main(String[] args) {
		/*�迭�� Ŭ����
		 * Ŭ������ �����͵��� ��� �ڷᰡ�������� �ڵ尡 ��������
		 * ��ü���� �迭�ι�� �ϳ��� ������ �ο�����
		 * */
		
		Ex14 student1 = new Ex14();
		student1.name = "����";
		student1.addr = "�λ걤���� �λ����� �߾Ӵ��";
		
		Ex14 student2 = new Ex14();
		student2.name = "��ö��";
		student2.name = "�λ걤���� ������ �ߵ�";
		
		
		
		
		Ex14[] studentList = new Ex14[5];
		
		studentList[0] = new Ex14();
		studentList[1] = student1 ;
		studentList[2] = new Ex14();
		studentList[3] = student2;
		studentList[4] = new Ex14();
		
		studentList[3].addr = "�λ걤���� �ؿ�뱸 �ߵ�";
		System.out.println("�̻���");
		System.out.println(studentList[3].addr);
		
		studentList[3].addr = "�λ걤���� �λ����� ��õ��";
		System.out.println("�̻���");
		System.out.println(studentList[3].addr);
		
		
		/*		RAM
		 * �ּ� 		��
		 * ----------------
		 * #1 		eX14
		 * #2		eX14
		 * #3		eX14
		 * #4		eX14
		 * #5		eX14
		 * (studentList)
		 * #6		#1
		 * #7		#2
		 * #8		#3
		 * #9		#4
		 * #10		#5
		 *
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
