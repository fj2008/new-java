package chapter4;

public class Ex2 {

	public static void main(String[] args) {
		double weight = 71.0;
		double hight = 173.0;
		
		double bmi = (weight  / (hight *hight)) * 10000;
		if(bmi <18.5) {
			System.out.println("��ü��");
			
		}
		if(bmi >=18.5 && bmi<=22 ) {
			System.out.println("����");
			
		}
		
		if(bmi > 23.0 && bmi< 24.0) {
			
			System.out.println("��ü�� �ǽ�");
		}
		
		if(bmi > 25.0 && bmi< 29.0) {
			
			System.out.println("��");
		}
		if(bmi > 30.0) {
			
			System.out.println("����");
		}
		
		
	}

}
