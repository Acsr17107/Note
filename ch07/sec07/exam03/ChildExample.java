package ch07.sec07.exam03;

public class ChildExample {
	public static void main(String[] args) {
		//��ü ���� �� �ڵ� Ÿ�� ��ȯ
		Parent parent = new Child();
		
		//Parent Ÿ������ �ʵ�� �޼ҵ� ���
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.field2 = "data2"   //(�Ұ���)
		parent.method3();         //(�Ұ���)
		*/
		
		//���� Ÿ�� ��ȯ
		Child child = (Child) parent;
		
		//Child Ÿ������ �ʵ�� �޼ҵ� ���
		child.field2 = "data2";    //(����)
		child.method3();           //(����)
	}
}