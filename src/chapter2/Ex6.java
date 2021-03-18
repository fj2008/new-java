package chapter2;

public class Ex6 {

	public static void main(String[] args) {
			/*다차원 배열
			 * 기존에 배열이 램에 가로방만 얻는 형식이라면
			 * 다차원배열은 새로로 넘어감 쉽게생각하면 엑셀처럼 배열을 하는것임
			 * 
			 * 
			 * 
			 * */
		int [][] arr1 = new int[2][2];
		
		System.out.println();
		
		double [][] arr2 = new double [3][2];
		//한줄에 두칸씩 새줄이 있음
			
		char[][] arr3 = new char[2][3] ;
		
		char[][] arr4 = new char[3][3];
		
		double[][]arr5 = new double[4][1];
		
		int[][] study = {
				{89,45,36},
				{49,56,43},
				{34,78,76},
				{34,68,76}};
		
		System.out.println(study[0][0]);
		System.out.println(study[2][1]);
		System.out.println(study[0][2]);
		//횡번호만 사용했을때 적절한 타입의 변수에 저장하세요
		
		int[][] studentInfo = new int[3][];
		studentInfo[0] = new int[3];
		studentInfo[1] = new int[5];
		studentInfo[2] = new int[1];
		
		//자바는 위와같이 2차원배열을 유연하게 생성 할 수가 있다
		
		//이렇게 다차원 배열은 중괄호를 늘려서 만들수 있다
		//그래서 첫번째괄호에들어가는 수는 새로의 크기를 말하는거
		//두번째 괄호에 들어가는 수는 가로의 크기를 말하는거
		
 		
		
	}

}
