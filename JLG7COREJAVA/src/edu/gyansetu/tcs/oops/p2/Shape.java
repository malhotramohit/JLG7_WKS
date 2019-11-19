package edu.gyansetu.tcs.oops.p2;

public abstract class Shape extends Object {

	protected String color;
	protected boolean isFilled;

	public Shape() {
		super();
		color = "red";
		isFilled = true;
	}

	public Shape(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public abstract String toString();

}