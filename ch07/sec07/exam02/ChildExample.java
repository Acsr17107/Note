package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//�ڽ� ��ü ����
		Child child = new Child();
		
		//�ڵ� Ÿ�� ��ȯ
		Parent parent = child;
		
		//�޼ҵ� ȣ��
		parent.method1();
		parent.method2();
		//parent.method3(); (ȣ�� �Ұ���)
	}
}