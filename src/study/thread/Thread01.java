package study.thread;

public class Thread01 extends Thread {
	
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
