import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("ȫ�浿");
		nameList.add("���̷�");
		nameList.add("�̼���");
		nameList.add("100");
		
		for (String name : nameList) {
			System.out.println(name);
		}
		//--------------------------------------------
		 ArrayList<Integer> ageList = new ArrayList<Integer>();
	        ageList.add(20);
	        ageList.add(21);
	        ageList.add(22);
	        ageList.add(23);
	        // ageList.add("25��");
	        
	        for (Integer age : ageList) {
	        	System.out.println(age);
	        }
	        //-------------------------------------------
	        ArrayList<Student> studentList = new ArrayList<Student>();
	        Student st1 = new Student("ȫ�浿", "2024001", "�ΰ����ɼ���Ʈ�����а�", "�ڹ�1");
	        // studentList.add("ȫ�浿");
	        studentList.add(st1);
	        studentList.add(new Student("���̷�", "1965001", "��ǻ���к�", "�ڹ�2"));
	        studentList.add(new Student("�̼���", "1800001", "�ؾ��а�", "���������"));
	        
	        for	 (Student one : studentList) {
	        	System.out.println(one);
	        }
	}
}
