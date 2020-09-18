package com.hcl;

public class rectangle extends Shape {
	
	private Double length;
	private Double breadth;
	
	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getBreadth() {
		return breadth;
	}

	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}


	
	public void computeArea(){
		Double area=length*breadth;
		System.out.println("Area of thr Rectangle is:  "+area);
	}

}
