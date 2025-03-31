package proj0331;

import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		// ���� 8-9 : �ؽ�Ʈ ���� ����
		File src = new File("C:\\Users\\313\\Test\\When I Get Old Ly.txt");	// ���� ���� ���
		File dest = new File("C:\\Users\\313\\Test\\Copy.txt");	// ���� ���� ���
		
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c = fr.read()) != -1) {	// ���� �ϳ� ����
				fw.write((char)c);	// ���� �ϳ� ��
			}
			fr.close();
			fw.close();	// ���� �� �ݱ�
			
			System.out.println(src.getPath()+ "�� " + dest.getPath()+ "�� �����Ͽ����ϴ�.");	// ���� ����

		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}
