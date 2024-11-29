package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("���� ��: " + result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
				
				
		} finally {
			System.out.println("[������ ����]\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("[���α׷� ����]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[���α׷� ����]");
	}
}