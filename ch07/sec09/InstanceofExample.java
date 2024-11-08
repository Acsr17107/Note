package ch07.sec09;

public class InstanceofExample {
	//main() �޼ҵ忡�� �ٷ� ȣ���ϱ� ���� ���� �޼ҵ� ����
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		//person�� �����ϴ� ��ü�� Student Ÿ������ Ȯ��
		/*if (person instanceof Student) {
		  //Student ��ü�� ��� ���� Ÿ�� ��ȯ
		  Student student = (Student) person;
		  //Student ��ü�� ������ �ִ� �ʵ� �� �޼ҵ� ���
		  System.out.println("studentNo: " + student.studentNo);
		  student.study();
		)*/
		
		//person�� �����ϴ� ��ü�� Student Ÿ���� ���
		//student ������ ����(Ÿ�� ��ȯ �߻�)
		if(person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		//Person ��ü�� �Ű������� �����ϰ� personInfo() �޼ҵ� ȣ��
		Person p1 = new Person("ȫ�浿");
		personInfo(p1);
		
		System.out.println();
		
		//Student ��ü�� �Ű������� �����ϰ� personInfo() �޼ҵ� ȣ��
		Person p2 = new Student("��浿", 10);
		personInfo(p2);
	}
}