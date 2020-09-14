package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int type;
		float radius, length, breadth, side;
		Scanner input = new Scanner(System.in);
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Shape s3 = new Square();
		System.out.println("List of shapes:");
		System.out.println("1.Circle\n2.Rectangle\n3.Square");
		System.out.println("Enter your type");
		type = input.nextInt();
	
		
		if(type==1){
			System.out.println("Enter the radius");
			radius = input.nextFloat();
			((Circle) s1).setRadius(radius);
			s1.calculatePerimeter();
		}
		
		else if(type==2){
			System.out.println("Enter the length and breadth");
			length = input.nextFloat();
			breadth = input.nextFloat();
			((Rectangle) s2).setLength(length);
			((Rectangle) s2).setBreadth(breadth);
			s2.calculatePerimeter();
		}
		
		else if(type==3){
			System.out.println("Enter the sides");
			side = input.nextFloat();
			((Square) s3).setSide(side);
			s3.calculatePerimeter();
		}
	}
}
