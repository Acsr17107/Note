package ch05.sec06;

public class ArrayCreateByValueListExample {
	public static void main(String[] args) {
		//�迭 ���� ����� �迭 ����
		String[] season = { "Spring", "Summer", "Fall", "winter" };
		
		//�迭�� �׸� �б�
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		//�ε��� 1�� �׸��� �� ����
		season[1] = "����";
		System.out.println("season[1] : " + season[1]);
		System.out.println();
		
		//�迭 ���� ����� �迭 ����
		int[] scores = { 83, 90, 87 };
		
		//���հ� ��� ���ϱ�
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);
	}
}