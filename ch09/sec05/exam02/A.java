package ch09.sec05.exam02;

public class A {
	//A �ν��Ͻ� �ʵ�
	String field = "A-field";
	
	//A �ν��Ͻ� �޼ҵ�
	void method() {
		System.out.println("A-method");
	}
	
	//�ν��Ͻ� ��� Ŭ����
	class B {
		//B �ν��Ͻ� �ʵ�
		String field = "B-field";
		
		//B �ν��Ͻ� �޼ҵ�
		void method() {
			System.out.println("B-method");
		}
		
		//B �ν��Ͻ� �޼ҵ�
		void print() {
			//B ��ü�� �ʵ�� �޼ҵ� ���
			System.out.println(this.field);
			this.method();
			
			//A ��ü�� �ʵ�� �޼ҵ� ���
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	//A�� �ν��Ͻ� �޼ҵ�
	void useB() {
		B b = new B();
		b.print();
	}
}