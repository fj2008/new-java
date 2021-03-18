package chapter3;

public class Ex15 {

	public static void main(String[] args) {
		// 클래스라고 하는 나만으 ㅣ데이터 타입 선언
		// 클래스를 사용해서 인스턴스를 생성
		// 인스턴스 안에 데이터를 저장
		// 저장된 데이터를 출력
		
		//우리가 만든 Ex11타입의 데이터 타입을 obj1라는 공간(변수)을만들어서 선언을했다.
		
		//1.Ex11 타입의 인스턴스(new Ex11();)를 생성
		//2.obj1 객체(obj1)에 저장
		Ex11 obj1 = new Ex11();
		obj1.var1 =10;
		obj1.var2 =3.14;
		obj1.var3 = 'a';
		obj1.var4 = "Hello World~!";
		
		//obj2 객체에 100, 50 정수를 저장하세요.
		
		
		
		//1.Ex12 타입의 인스턴스를 생성.
		//2.obj2 객체에 저장
		Ex12 obj2 = new Ex12();
		obj2.num1 = 100;
		obj2.num2 = 50;
		//1.Ex13 타입의 인스턴스를 생성
		//2.obj3 객체에 저장
		Ex13 obj3 = new Ex13();
		obj3.num1 = 32;
		obj3.num2 = 156.3;
		obj3.var1 = 'a';
		obj3.var2 = "나이키";
		obj3.var3 = "삼성";
		
		System.out.println(obj3.num1);
		System.out.println(obj3.num2);
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		
				
		
		//1.Ex14 타입의 인스턴스를 생성
		//2.obj4 객체에 저장
		Ex14 obj4 = new Ex14();
		
		obj4.name = "이철수";
		obj4.age = 16;
		System.out.println(obj4.name);
		System.out.println(obj4.age);
		
		
				
		
		//예제1. Ex13 클래스의 인스턴스를 만들고 ex13 객체에 저장하세요
		Ex13 ex13 = new Ex13();
		/*클래스 변수의 종류
		 * 인스턴스 멤버 변수
		 * 
		 * 클래스 멤버 변수 : 인스턴스를 사용하지않아도 클래스 이름만 접근해서 사용할 수 있음
		 * 
		 * 저장하고 있는값의 변경이 가능한 변수
		 * 저장하고 있는값의 변경이 불가능한 변수
		 * 
		 * */
		
		
		
		
		
		
		
		
		
	}

}
