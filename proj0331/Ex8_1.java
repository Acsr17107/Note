package proj0331;

import java.io.*;

public class Ex8_1 {

	public static void main(String[] args) {
		//When I Get Old Ly.txt 읽기
		
		try {
			FileReader fin = new FileReader("C:\\Users\\313\\Test\\When I Get Old Ly.txt");
			int ch;
			
			while ( (ch = fin.read() ) != - 1 ) {	// 글자 하나씩 읽는 반복문
				System.out.print( (char)ch );
			}
			fin.close();	// 끝난 후 닫기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();	// catch 문에 필수로 삽입해야 함.
			System.out.println("파일이 없음, 파일경로나 파일명 재확인.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("읽기 에러");
		}
	}
}
