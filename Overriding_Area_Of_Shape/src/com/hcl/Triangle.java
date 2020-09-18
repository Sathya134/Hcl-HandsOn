package com.hcl;

public class Triangle extends Shape {
	private Double base;
	private Double height;

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public void computeArea() {
		Double area=0.5*base*height;
		System.out.println("Area of the Triangle is:  "+area);
	}
}
