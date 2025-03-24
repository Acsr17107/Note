package proj0324;

interface ClickList {
	void print(); // abstract
}

//

public class Exam13 {
	public static void main(String[] args) {
		ClickList object1 = new ClickList() {
			
			@Override
			public void print() {
				System.out.println("클릭 리스너입니다. ");
			}
		};
		
		object1.print();
		int a = Integer.parseInt("100");
		double b = Double.parseDouble("100.123");
		
		System.out.println("정수형 " + a + ", 실수형 " + b);
	}
}

