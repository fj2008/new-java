package chapter3;

public class Ex19 {

	public static void main(String[] args) {
		/*배열과 클래스
		 * 클래스로 데이터들을 묶어도 자료가많아지면 코드가 복잡해짐
		 * 객체들을 배열로묶어서 하나의 공간에 부여를함
		 * */
		
		Ex14 student1 = new Ex14();
		student1.name = "고영희";
		student1.addr = "부산광역시 부산진구 중앙대로";
		
		Ex14 student2 = new Ex14();
		student2.name = "이철수";
		student2.name = "부산광역시 수영구 중동";
		
		
		
		
		Ex14[] studentList = new Ex14[5];
		
		studentList[0] = new Ex14();
		studentList[1] = student1 ;
		studentList[2] = new Ex14();
		studentList[3] = student2;
		studentList[4] = new Ex14();
		
		studentList[3].addr = "부산광역시 해운대구 중동";
		System.out.println("이사전");
		System.out.println(studentList[3].addr);
		
		studentList[3].addr = "부산광역시 부산진구 범천동";
		System.out.println("이사후");
		System.out.println(studentList[3].addr);
		
		
		/*		RAM
		 * 주소 		값
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
