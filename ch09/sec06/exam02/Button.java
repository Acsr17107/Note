package ch09.sec06.exam02;

public class Button {
	//���� ��� �������̽�
	public static interface ClickListener {
		//�߻� �޼ҵ�
		void onClick(); }
	
	//�ʵ�
	private ClickListener clickListener;
	
	//�޼ҵ�
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
}