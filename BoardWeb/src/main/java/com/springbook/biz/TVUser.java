package com.springbook.biz;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeDown();
		tv.volumeUp();
		tv.powerOff();
	}

}
