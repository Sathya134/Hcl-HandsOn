package com.hcl;

import java.util.ArrayList;

public class CourseList {
	ArrayList<Course> courseList;

	public ArrayList<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public void insert(Course course) {
		
	}
	public double  revenue() {
		double revenue1=(200*1000*(20/100));
		double revenue2=(200*2000*(20/100));
		double revenue3=(200*500*(20/100));
		double totalRevenue=revenue1+revenue2+revenue3;
		System.out.println("Total revenue is: "+totalRevenue);
		return totalRevenue;
	}
	
}
