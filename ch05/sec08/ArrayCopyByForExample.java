package ch05.sec08;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//���� 3�� �迭
		int[] oldIntArray = { 1, 2, 3 };
		//���� 5�� �迭�� ���� ����
		int[] newIntArray = new int[5];
		//�迭 �׸� ����
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//�迭 �׸� ���
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}