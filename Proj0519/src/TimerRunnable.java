public class TimerRunnable implements Runnable {
	
	int n = 0; 							// 초기값 설정
	
	@Override
	public void run() {
		
		while(true) {					// 스레드가 시작되면 run()메서드 실행
			System.out.println(n);		// 숫자 출력
			n++; 						// 숫자 증가
			
			try {
				Thread.sleep(1000); 	// 1초 동안 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace(); 	// 예외 출력
				return; 				// 스레드 종료
			}
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread(new TimerRunnable());	// 객체 생성
		th.start(); 									// 스레드 시작
	}
}
