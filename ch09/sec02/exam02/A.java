package ch09.sec02.exam02;

public class A {
	//�ν��Ͻ� ��� Ŭ����
	class B {
		//�ν��Ͻ� �ʵ�
		int field1 = 1;
		
		//���� �ʵ�(Java 17���� ���)
		static int field2 = 2;
		
		//������
		B() {
			System.out.println("B-������ ����");
		}
		
		//�ν��Ͻ� �޼ҵ�
		void method1() {
			System.out.println("B-method1 ����");
		}
		
		//���� �޼ҵ�(Java 17���� ���)
		static void method2() {
			System.out.println("B-method2 ����");
		}
	}
	
	//�ν��Ͻ� �޼ҵ�
	void useB() {
		//B ��ü ���� �� �ν��Ͻ� �ʵ� �� �޼ҵ� ���
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		//B Ŭ������ ���� �ʵ� �� �޼ҵ� ���
		System.out.println(B.field2);
		B.method2();
	}
}