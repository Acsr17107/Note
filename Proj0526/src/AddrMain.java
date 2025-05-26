import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();
	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 전체 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("메뉴를 입력하세요: ");
			int in = sc.nextInt(); 
			
			//선택한 메뉴별로 메소드 실행 추가 
			switch(in) {
			case 1:
				addrInput();
				break;
				
			case 2:
				addrSearch();
				break;
				
			case 3:
				addrJohoi();
				break;
				
			case 4:
				addrUpdate();
				break;
				
			case 5:
				addrDelete();
				break;
				
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
				
			default:
				System.out.println(" 다시 입력하세요.");	
				break;
			}
		}
	}
	
	//입력 
	public static void addrInput() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("전화번호를 입력하세요. : ");
		String tel = sc.next();
		System.out.println("회사 이름을 입력하세요. : ");
		String com = sc.next();
		
		LocalDateTime createDate = LocalDateTime.now();		// 현재 시간 저장함
		addlist.add(new Addr(name, tel, com, createDate));
		System.out.println("주소록 저장 완료");
	}
	
	//검색 
	static private void addrSearch() {
		System.out.println("검색할 이름을 입력하시오.");
		String name = sc.next();
		
		boolean found = false;					// for 문 제어 용도

		for (Addr a : addlist) {
			if (a.getName().contains(name)) {	// 이름이 포함되는 항목을 찾음
				System.out.println(a);
				found = true;
			}
		}
		if (!found) {
			System.out.println("주소록 존재 X");
		}
	}

	
	//전체 조회 
	static void addrJohoi() {
		if (addlist.isEmpty()) {					// 주소록이 비어있을 경우
			System.out.println("주소록이 비어 있습니다.");
		} else {									// 주소록이 존재 할 경우
			System.out.println(" 주소록 전체 목록 ");
			for (Addr a : addlist) {
				System.out.println(a);				// 각각의 주소록 출력함
			}
		}
	}
	
	//수정
	static void addrUpdate() {
		System.out.println("수정할 사람의 이름을 입력하세요 : ");
		String name = sc.next();
		boolean found = false;						// for 문 제어 용도

		for (Addr a : addlist) {
			if (a.getName().equals(name)) {			// 수정할 사람 이름이 맞는지 확인
				System.out.print("새 전화번호를 입력하세요 : ");
				String newTel = sc.next();
				System.out.print("새 회사명을 입력하세요 : ");
				String newCom = sc.next();

				a.setTel(newTel);					// 전화번호 수정
				a.setCom(newCom);					// 회사명 수정
				System.out.println("주소록이 수정되었습니다.");
				found = true;
				break;
			}
		}

		if (!found) {								// 이름이 없을 경우
			System.out.println("해당 이름의 주소록이 없습니다.");
		}
	}
	
		
	//삭제
	static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오 : ");
		String name = sc.next();
		boolean deleted = false;					// for 문 제어 용도

		for (int i = 0; i < addlist.size(); i++) {
			if (addlist.get(i).getName().equals(name)) {	// 이름이 일치하는지 확인
				addlist.remove(i);							// 해당하는 주소록 삭제
				System.out.println("주소록이 삭제되었습니다.");
				deleted = true;
				break;
			}
		}

		if (!deleted) {										// 이름이 없을 경우
			System.out.println("해당 이름의 주소록이 없습니다.");
		}
	}
}
