package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//Ok ��ư ��ü ����
		Button btnOk = new Button();
		
		//Ok ��ư Ŭ�� �̺�Ʈ�� ó���� ClickListener ���� Ŭ����(���� Ŭ����)
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		//Ok ��ư ��ü�� ClickLsitener ���� ��ü ����
		btnOk.setClickListener(new OkListener());
		
		//Ok ��ư Ŭ���ϱ�
		btnOk.click();
		
		//-----------------------------------------------------------
		
		//Cancel ��ư ��ü ����
		Button btnCancel = new Button();
		
		//Cancel ��ư Ŭ�� �̺�Ʈ�� ó���� ClickListener ���� Ŭ����(���� Ŭ����)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick() {
				Systme.out.println("Cancel ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		//Cancel ��ư ��ü�� ClickListener ���� ��ü ����
		btnCancel.setClickListener(new CancelListener());
		
		//Cancel ��ư Ŭ���ϱ�
		btnCancel.click();
	}
}