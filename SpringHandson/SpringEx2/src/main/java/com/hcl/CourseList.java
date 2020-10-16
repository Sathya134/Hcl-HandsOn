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

	public ArrayList<String> noOfCourse(Double budget) {
		ArrayList<String> list = new ArrayList<>();
		for (Course course : courseList) {
			if (budget >= course.getFee()) {
				list.add(course.getName() + "-" + (int) (budget / course.getFee()));
			}
		}
		return list;
	}
}
