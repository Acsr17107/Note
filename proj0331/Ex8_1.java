package proj0331;

import java.io.*;

public class Ex8_1 {

	public static void main(String[] args) {
		//When I Get Old Ly.txt �б�
		
		try {
			FileReader fin = new FileReader("C:\\Users\\313\\Test\\When I Get Old Ly.txt");
			int ch;
			
			while ( (ch = fin.read() ) != - 1 ) {	// ���� �ϳ��� �д� �ݺ���
				System.out.print( (char)ch );
			}
			fin.close();	// ���� �� �ݱ�
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();	// catch ���� �ʼ��� �����ؾ� ��.
			System.out.println("������ ����, ���ϰ�γ� ���ϸ� ��Ȯ��.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�б� ����");
		}
	}
}
