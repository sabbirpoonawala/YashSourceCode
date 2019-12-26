package com.yash.time;

import java.time.ZoneId;

public class ZoneIdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ZoneId.getAvailableZoneIds());
		// prints all available timezone ids

		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Asia/Karachi");
		System.out.println(zone1.getRules());
		System.out.println(zone2.getRules());
	}

}
