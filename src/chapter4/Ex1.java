package chapter4;

public class Ex1 {

	public static void main(String[] args) {
		/*조건문
		 * 상황에 따라서 다른 동작을 수행해야할 때 프로그램이 수행되는 흐름을 바꿀 수 있다.
		 * 조건을 비교하여 특정 코드 블록의 실행 여부를 결정할 수 이싿.
		 * if,else
		 * switch,case,break
		 * 
		 * 
		 * */
		
//		System.out.println("코드시작 ");
//		if (true) {
//			System.out.println("이 if문은");
//			System.out.println("참이므로");
//			System.out.println("코드가 실행됩니다.");
//			
//		}
//		
//		if (false) {
//			System.out.println("이 if문은");
//			System.out.println("거짓이므로");
//			System.out.println("코드가 실행됩니다.");
//			
//		}
//		System.out.println("코드끝");
		
		int score = 60;
		if(score >= 60) {
			System.out.println("통과");
		}
		if(score < 60) {
			System.out.println("불합");
		}
	}

}
