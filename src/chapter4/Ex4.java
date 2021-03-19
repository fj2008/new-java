package chapter4;

public class Ex4 {

	public static void main(String[] args) {
		//elseif는 여러조건을 걸어서 프로그램에 명령할때 사용한다
//		int num = 4;
//		if(num ==1 ) {
//			System.out.println("1입니다/");
//			
//		}else if (num==2) {
//			System.out.println("2입니다");
//		}else if (num==3) {
//			System.out.println("3입니다");
//		}else if (num==4) {
//			System.out.println("4입니다");
//		}
		int age = 1995;
		int nia =  2021 -age;
		if(nia >=1&&nia<=7) {
			System.out.println("미취학 유아동입니다");
		}else if(nia>=8 &&nia<=13) {
			System.out.println("초딩입니다");
		}else if(nia>=14 &&nia<=16) {
			System.out.println("중딩입니다");
		}else if(nia<=17 &&nia>19) {
			System.out.println("성인입니다");
		}
		//클레스맴버변수로 age를 저장하면 더 좋은 코딩이 된다
		
				
		
		
	}

}
