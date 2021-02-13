package com.b2lights.practiceproblems.timeconvert;

public class Conversions {
	private int seconds;
	private int minutes = 0;
	private int hours = 0;
	
	private final int MULTIPLIER = 60;

	public Conversions(int seconds) {
		super();
		this.seconds = seconds;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Conversions [seconds=" + seconds + "]";
	}
	
	public void divTimer() {
		minutes = seconds / MULTIPLIER;
		hours = minutes / MULTIPLIER;
		remainderTimer();
	}
	
	public void remainderTimer() {
		seconds = seconds % MULTIPLIER;
		minutes = minutes % MULTIPLIER;
	}

}
