public class TimerRunnable implements Runnable {
	
	int n = 0; 							// �ʱⰪ ����
	
	@Override
	public void run() {
		
		while(true) {					// �����尡 ���۵Ǹ� run()�޼��� ����
			System.out.println(n);		// ���� ���
			n++; 						// ���� ����
			
			try {
				Thread.sleep(1000); 	// 1�� ���� ����
			} catch (InterruptedException e) {
				e.printStackTrace(); 	// ���� ���
				return; 				// ������ ����
			}
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread(new TimerRunnable());	// ��ü ����
		th.start(); 									// ������ ����
	}
}
