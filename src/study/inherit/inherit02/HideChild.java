package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HideChild extends Parent {

	public HideChild(int money) {
		super(money);
		// TODO Auto-generated constructor stub
	}
	
	public void printInfo() {
		System.out.println(money);
	}
}