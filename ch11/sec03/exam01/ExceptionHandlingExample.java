package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭 �ε����� �ʰ���: " +e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����: " + e.getMessage());
			}
		}
	}
}