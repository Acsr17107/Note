package ch09.sec03.exam01;

public class A {
	//���� ��� Ŭ����
	static class B {
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
		
		//���� �޼ҵ�
		static void method2() {
			System.out.println("B-method2 ����");
		}
	}
}