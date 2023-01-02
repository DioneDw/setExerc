package services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entities.Course;
import entities.Student;

public class CourseManager {
	
	private List<Course> courses = new ArrayList<Course>();
	
	public CourseManager(List<Course> courses) {
		this.courses=courses;
	}
	
	public List<Course> getCourses() {
		return courses;
	}

	public void createCourses(String teacher, Integer numberOfCourses) {
		for(int i=0; i<numberOfCourses; i++) {
			char codeCourse = (char) ('A' + i);
			courses.add(new Course(codeCourse,teacher));
		}
	}
	public int totalStudents() {
		Set<Student> students = new HashSet<Student>();
		for(int i=0; i<courses.size();i++) {
			for(int j=0; j<courses.get(i).getStudents().size(); j++) {
				students.add(courses.get(i).getStudents().get(j));
			}
		}
		return students.size();
	}
}
