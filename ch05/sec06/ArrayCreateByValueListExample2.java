package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		//�迭 ���� ����
		int[] scores;
		//�迭 ������ �迭�� ����
		scores = new int[] { 83, 90, 87 };
		//�迭 �׸��� ������ ���ϰ� ���
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		
		//�迭�� �Ű������� �ְ�, printItem() �޼ҵ� ȣ��
		printItem( new int[] { 83, 90, 87 } );
	}
	
	//printItem() �޼ҵ� ����
	public static void printItem( int[] scores ) {
		//�Ű������� �����ϴ� �迭�� �׸��� ���
		for(int i=0; i<3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}
	}
}