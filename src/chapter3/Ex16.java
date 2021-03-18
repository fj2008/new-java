package chapter3;

public class Ex16 {

	public static void main(String[] args) {
		//클래스멤버변수는 인스턴스멤버변수와 구별하기 위해 클래스네임을사용한다
		
		//인스턴스 멤버변수는 인스턴스변수가 생성 될때 같이 만들어지고
		//사라지는시기는 인스턴스가 소속된 코드 블록의 끝을 만났을때
		
		//클래스 멤버변수는 클래스가 로드될때 생성됐다가
		//프로그램이 종료될때 사라진다
		
		//클래스변수가 인스턴스 멤버변수보다 먼저 생겼다가 마지막에 끝난다
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
