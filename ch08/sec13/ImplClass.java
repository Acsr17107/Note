package ch08.sec13;

public class ImplClass implements InterfaceC {
	public void methodA() {
		System.out.println("methodA() ����");
	}
	
	public void methodB() {
		System.out.println("methodB() ����");
	}
	
	@Override
	public void methodC() {
		System.out.println("methodC() ����");
	}
}