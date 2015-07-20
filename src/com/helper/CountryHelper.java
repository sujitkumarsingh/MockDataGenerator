package com.helper;

import java.util.Random;

public class CountryHelper {
	private enum Country {
		US
	}
	
	private enum State {
		Alabama, Alaska, California, Colorado, Delaware, Florida, Georgia, Hawaii, Missouri, NewJersey, NewYork, Washington
	}
	
	public static String getState() {
		int stateInt = new Random().nextInt(State.values().length);
		return State.values()[stateInt].name();
	}
	
	public static String getCountry() {
		int countryIndex = new Random().nextInt(Country.values().length);
		return Country.values()[countryIndex].name();
	}
}
