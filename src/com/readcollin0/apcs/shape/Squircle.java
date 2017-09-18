package com.readcollin0.apcs.shape;

public class Squircle implements Shape {

	private double squareRadius, circleRadius;
	private double area, perimeter;
	
	public Squircle(double squareRadius, double circleRadius) {

		this.squareRadius = squareRadius;
		this.circleRadius = circleRadius;
		
		computeArea();
		computePerimeter();
	}
	
	private void computeArea() {
		double squareArea = Math.pow(squareRadius*2, 2);
		double inscribedSquareArea = Math.pow(circleRadius*2, 2);
		double circleArea = Math.PI * Math.pow(circleRadius, 2);
		area = squareArea - (inscribedSquareArea - circleArea);
	}
	
	private void computePerimeter() {
		perimeter = 0;
		perimeter += 8*(squareRadius - circleRadius);
		perimeter += 2 * Math.PI * circleRadius;
	}
	
	@Override
	public double getArea() {
		return area;
	}

	@Override
	public double getPerimeter() {
		return perimeter;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

}
