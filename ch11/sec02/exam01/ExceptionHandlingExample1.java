package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int.result = data.length();
		System.out.println("���� ��: " + result);
		}

	public static void main(String[] args) {
		System.out.println("[���α׷� ����]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[���α׷� ����]");
	}
}