package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Course;
import entities.Student;
import services.CourseManager;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Course> courses = new ArrayList<Course>();
		
		System.out.println("Type name of teacher: ");
		String teacher = sc.nextLine();
		System.out.printf("Enter number of courses for the teacher \""+ teacher+"\": ");
		int numberOfCourses = sc.nextInt();
		
		CourseManager cm = new CourseManager(courses);
		cm.createCourses(teacher, numberOfCourses);
		
		for(int i=0; i<numberOfCourses;i++) {
			char codeCourse = cm.getCourses().get(i).getcodeCourse();
			System.out.printf("How many students for course "+ codeCourse + "? :");
			Course course = cm.getCourses().get(i);
			int numberOfStudents = sc.nextInt();
			
			System.out.println("Enter students codes: ");
				for(int j=0; j<numberOfStudents; j++) {
					course.getStudents().add(new Student(sc.nextInt()));
				}
		}
		
		System.out.println();
		System.out.println("Total Students: "+ cm.totalStudents());
		
		sc.close();
	}

}
