package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//���� 3�� �迭
		String[] oldStrArray = { "java", "array", "copy" };
		//���� 5�� �迭�� ���� ����
		String[] newStrArray = new String[5];
		//�迭 �׸� ����
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//�迭 �׸� ���
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}