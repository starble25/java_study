package quiz;

public class Quiz10 {

	public static void main(String[] args) {
		
		OddNum odd = new OddNum();
		EvenNum even = new EvenNum();
//		odd.start();
//		even.start();
		
		EvenRunnable er = new EvenRunnable();
		Thread t1 = new Thread(er);
		Thread t2 = new Thread(new OddRunnable());
		
		t1.start();
		t2.start();
		
	}

}

class OddNum extends Thread {
	public void run() {
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
}

class EvenNum extends Thread {
	public void run() {
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class EvenRunnable implements Runnable {

	public void run() {
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class OddRunnable implements Runnable {

	public void run() {
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
}