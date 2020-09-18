package com.hcl;

import java.util.Scanner;

import sun.security.util.Length;

import javafx.scene.shape.Rectangle;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Shape s= new Shape();
		Circle c = new Circle();
		Rectangle re = new Rectangle();
		Triangle t = new Triangle();

		System.out.println("Enter the Shape:");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");

		int type = sc.nextInt();

		if (type == 1) {
			System.out.println("Enter the Radius");
			c.setRadius(sc.nextDouble());
			c.computeArea();
		}/* else if (type == 2) {
			System.out.println("Enter the Length");
			re.setLength(sc.nextDouble());
			System.out.println("Enter the Breadth");
			re.setBreadth=sc.nextDouble();
			re.computeArea();

		} */else if (type == 3) {
			System.out.println("Enter the Base");
			t.setBase(sc.nextDouble());
			System.out.println("Enter the height");
			t.setHeight(sc.nextDouble());
			t.computeArea();
		}
	}

}
