package ch05.sec06;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		//2���� �迭 ����
		int[][] scores = {
				{ 80, 90, 96 }, 
				{ 76, 88 }
		};
		
		//�迭�� ����
		System.out.println("1���� �迭 ����(���� ��): " + scores.length);
		System.out.println("2���� �迭 ����(ù ��° ���� �л� ��): " + scores[0].length);
		System.out.println("2���� �迭 ����(�� ��° ���� �л� ��): " + scores[1].length);
		
		//ù ��° ���� �� ��° �л��� ���� �б�
		System.out.println("scores[0][2]: " + scores[0][2]);
		
		//�� ��° ���� �� ��° �л��� ���� �б�
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		//ù ��° ���� ��� ���� ���ϱ�
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("ù ��° ���� ��� ����: " + class1Avg);
		
		//ù ��° ���� ��� ���� ���ϱ�
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("�� ��° ���� ��� ����: " + class2Avg);
		
		//��ü �л��� ��� ���� ���ϱ�
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("��ü �л��� ��� ����: " + totalAvg);
	}
}
