package practice.practice24;

import java.util.ArrayList;

public class Kitchen {
	//주방공간
	//- 공간이 몇평인지
	//- 벽지색상이 어떤지
	//- 층고가 얼마나 되는지

	int pyeong;
	String wallColor;
	int height;
	
	Refrigerator refri;
	GasRange gasRange;
	
	Cup[] cups;
	
	ArrayList<Cup> cupList;
	ArrayList<TrashCan> trashCanList;

}

//냉장고
//- 어느 브랜드인지
//- 몇리터 짜리인지
//- 전원을 켤수 있다
//- 온도조절을할수있다(온도 up 또는 온도 down)
//- 문이 몇개인지
class Refrigerator {
	String brand;
	int liter;
	boolean isPowerOn;
	int doorCount;
	int temperature;
	
	IceTray iceTray;
	ArrayList<IceTray> iceTrayList;
	
	// 온도 : -5 ~ 4
	int maxTemperature;
	int minTemperature;
	
	public Refrigerator() {
		maxTemperature = 4;
		minTemperature = -5;
	}
	
	public void powerOn() {
		isPowerOn = true;
	}
	
	public void tempUp() {	//온도 1도 올리기
		if(temperature + 1 <= maxTemperature) {
			this.temperature += 1;
		}
	}
	public int tempDown() {	//온도 1도 내리고, 최종 온도 반환
		this.temperature -= 1;
		return temperature;
	}
	// modifyTemp(1);
	// modifyTemp(-2);
	public void modifyTemp(int tempValue) {	//온도조절
		this.temperature += tempValue;
	}

	// modifyTemp(true); 1도증가
	// modifyTemp(false); 1도감소
	public void modifyTemp(boolean isUp) {
		if(isUp) {
			this.temperature += 1;
		} else {
			this.temperature -= 1;
		}
	}
}

//냉동실안에 얼음 트레이
//- 몇구짜리인지
//- 얼마인지
class IceTray {
	int IceCount;
	int price;
}

//가스렌지
//- 화구가 몇인지
//- 어디 브랜드인지
//- 가격이 얼마인지
//- 불을 켠다
//- 불을 끈다
//- 불세기르 조절한다.
class GasRange {
	int fireCount;
	String brand;
	int price;
	int fireLevel;	// 불단계( 0 ~ 10 )
	
	public void fireOn() {
		fireLevel = 1;
	}
	public void fireOff() {
		fireLevel = 0;
	}
	
	public void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
}

//싱크대
//- 가로, 세로, 깊이 사이즈
//- 색상
//- 재질
class Sink {
	int width;
	int height;
	int depth;
	String color;
	String material;
	
	public int getWidth() {	//mm
		return width;
	}
	public double getWidthAsCm() {	//cm
		return width/10.0;
	}
}

//쓰레기통
//(*주방에 여러개가 있다)
//- 몇리터
//- 색상
//- 용량이 몇퍼센트나 찼는지
//- 쓰레기를 채운다
//- 쓰레기통을 연다
//- 쓰레기통을 닫는다
//- 쓰레기통을 비운다
class TrashCan {
	
	int liter;
	String color;
	int percent;
	boolean isCoverOpened;
	
	public void openCover() {
		isCoverOpened = true;
	}
	public void closeCover() {
		isCoverOpened = false;
	}
	
	public void cleanTrashCan() {
		percent = 0;
	}
	
	public void insertTrash(int percent) {
		this.percent += percent;
	}
	public void insertTrashLiter(int liter) {
		percent += (liter/this.liter) * 100;
	}
	
}

//컵
//(*주방에 여러개가 있다)
//- 용량
//- 재질
//- 색상
class Cup {
	int mililiter;
	String material;
	String color;
}


