package ch09.sec03.exam02;

public class AExample {
	public static void main(String[] args) {
		//B ��ü ���� �� �ν��Ͻ� �ʵ� �� �޼ҵ� ���
		A.B b = new A.B();
		System.out.println(b.field1);
		b.method1();
		
		//B Ŭ������ ���� �ʵ� �� �޼ҵ� ���
		System.out.println(A.B.field2);
		A.B.method2();
	}
}