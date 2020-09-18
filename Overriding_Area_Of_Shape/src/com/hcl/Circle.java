package com.hcl;

public class Circle extends Shape{
	private Double radius;


	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	public void computeArea(){
	
		Double area=(3.14*(radius*radius));
		System.out.println("Area of the Circle is:  "+area);
	}
}
