package pro0324;

public class Exam10 {

	public static void main(String[] args) {
		Tiger tiger1 = new Tiger();
		System.out.println(tiger1.getName() + ", " + tiger1.getAge());
		
		Tiger tiger2 = new Tiger("ȣ����", 2);
		System.out.println(tiger2.getName() + ", " + tiger2.getAge());
		tiger2.move();
		
		Eagle eagle1 = new Eagle("������", "����");
		System.out.println(eagle1.getName() + ", " + eagle1.getHome() + ", ");
		eagle1.move();
			
	}
}