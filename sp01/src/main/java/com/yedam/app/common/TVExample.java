package com.yedam.app.common;

public class TVExample {

	public static void main(String[] args) {
		System.out.println("자바의 일반적인 방식");
		//TV tv = new SamsungTV();
		TV tv = new LGTV();
		tv.powerOn();
		tv.volumeUp();
		tv.powerOff();

	}

}
