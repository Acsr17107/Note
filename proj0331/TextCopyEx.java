package proj0331;

import java.io.*;

public class TextCopyEx {

	public static void main(String[] args) {
		// 예제 8-9 : 텍스트 파일 복사
		File src = new File("C:\\Users\\313\\Test\\When I Get Old Ly.txt");	// 원본 파일 경로
		File dest = new File("C:\\Users\\313\\Test\\Copy.txt");	// 복사 파일 경로
		
		int c;
		
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			
			while((c = fr.read()) != -1) {	// 문자 하나 읽음
				fw.write((char)c);	// 문자 하나 씀
			}
			fr.close();
			fw.close();	// 끝난 후 닫기
			
			System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");	// 복사 성공

		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
