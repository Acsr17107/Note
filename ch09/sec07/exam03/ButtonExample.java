package ch09.sec07.exam03;

import ch09.sec06.exam03.Button;

public class ButtonExample {

	public static void main(String[] args) {
		//Ok ��ư ��ü ����
		Button btnOk = new Button();
		
		//Ok ��ư ��ü�� ClickListener ���� ��ü ����
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");
			}
		});
		
		//Ok ��ư Ŭ���ϱ�
		btnOk.click();
		
		//-----------------------------------------------------------------
		
		//Cancel ��ư ��ü ����
		Button btnCancel = new Button();
		
		//Cancel ��ư ��ü�� ClickListener ���� ��ü ����
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel ��ư�� Ŭ���߽��ϴ�.");
			}
		});
		
		//Cancel ��ư Ŭ���ϱ�
		btnCancel.click();
	}
}