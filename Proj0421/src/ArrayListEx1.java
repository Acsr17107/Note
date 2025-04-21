import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("홍길동");
		nameList.add("동미래");
		nameList.add("이순신");
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
	        // ageList.add("25살");
	        
	        for (Integer age : ageList) {
	        	System.out.println(age);
	        }
	        //-------------------------------------------
	        ArrayList<Student> studentList = new ArrayList<Student>();
	        Student st1 = new Student("홍길동", "2024001", "인공지능소프트웨어학과", "자바1");
	        // studentList.add("홍길동");
	        studentList.add(st1);
	        studentList.add(new Student("동미래", "1965001", "컴퓨터학부", "자바2"));
	        studentList.add(new Student("이순신", "1800001", "해양학과", "지도력향상"));
	        
	        for	 (Student one : studentList) {
	        	System.out.println(one);
	        }
	}
}
