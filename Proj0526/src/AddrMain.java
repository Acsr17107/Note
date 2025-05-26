import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();
	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------");
			System.out.println("1. �ּҷ� �Է�");
			System.out.println("2. �ּҷ� �˻�");
			System.out.println("3. �ּҷ� ��ü ��ȸ");
			System.out.println("4. �ּҷ� ����");
			System.out.println("5. �ּҷ� ����");
			System.out.println("0. ����");
			System.out.println("-------------");
			System.out.println("�޴��� �Է��ϼ���: ");
			int in = sc.nextInt(); 
			
			//������ �޴����� �޼ҵ� ���� �߰� 
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
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				return;
				
			default:
				System.out.println(" �ٽ� �Է��ϼ���.");	
				break;
			}
		}
	}
	
	//�Է� 
	public static void addrInput() {
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���. : ");
		String tel = sc.next();
		System.out.println("ȸ�� �̸��� �Է��ϼ���. : ");
		String com = sc.next();
		
		LocalDateTime createDate = LocalDateTime.now();		// ���� �ð� ������
		addlist.add(new Addr(name, tel, com, createDate));
		System.out.println("�ּҷ� ���� �Ϸ�");
	}
	
	//�˻� 
	static private void addrSearch() {
		System.out.println("�˻��� �̸��� �Է��Ͻÿ�.");
		String name = sc.next();
		
		boolean found = false;					// for �� ���� �뵵

		for (Addr a : addlist) {
			if (a.getName().contains(name)) {	// �̸��� ���ԵǴ� �׸��� ã��
				System.out.println(a);
				found = true;
			}
		}
		if (!found) {
			System.out.println("�ּҷ� ���� X");
		}
	}

	
	//��ü ��ȸ 
	static void addrJohoi() {
		if (addlist.isEmpty()) {					// �ּҷ��� ������� ���
			System.out.println("�ּҷ��� ��� �ֽ��ϴ�.");
		} else {									// �ּҷ��� ���� �� ���
			System.out.println(" �ּҷ� ��ü ��� ");
			for (Addr a : addlist) {
				System.out.println(a);				// ������ �ּҷ� �����
			}
		}
	}
	
	//����
	static void addrUpdate() {
		System.out.println("������ ����� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		boolean found = false;						// for �� ���� �뵵

		for (Addr a : addlist) {
			if (a.getName().equals(name)) {			// ������ ��� �̸��� �´��� Ȯ��
				System.out.print("�� ��ȭ��ȣ�� �Է��ϼ��� : ");
				String newTel = sc.next();
				System.out.print("�� ȸ����� �Է��ϼ��� : ");
				String newCom = sc.next();

				a.setTel(newTel);					// ��ȭ��ȣ ����
				a.setCom(newCom);					// ȸ��� ����
				System.out.println("�ּҷ��� �����Ǿ����ϴ�.");
				found = true;
				break;
			}
		}

		if (!found) {								// �̸��� ���� ���
			System.out.println("�ش� �̸��� �ּҷ��� �����ϴ�.");
		}
	}
	
		
	//����
	static void addrDelete() {
		System.out.println("������ �̸��� �Է��Ͻÿ� : ");
		String name = sc.next();
		boolean deleted = false;					// for �� ���� �뵵

		for (int i = 0; i < addlist.size(); i++) {
			if (addlist.get(i).getName().equals(name)) {	// �̸��� ��ġ�ϴ��� Ȯ��
				addlist.remove(i);							// �ش��ϴ� �ּҷ� ����
				System.out.println("�ּҷ��� �����Ǿ����ϴ�.");
				deleted = true;
				break;
			}
		}

		if (!deleted) {										// �̸��� ���� ���
			System.out.println("�ش� �̸��� �ּҷ��� �����ϴ�.");
		}
	}
}
