package study.inter.inter02;

public class IPhone implements Callable {
	int callStatus;

	@Override
	public void call() {
		System.out.println("아이폰 전화 검");
		callStatus = Callable.CALL_ON;
	}

}
