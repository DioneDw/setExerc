package entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private Character codeCourse;
	private String professor;
	private List<Student> students = new ArrayList<Student>();
	
	public Course(Character codeCourse, String professor) {
		this.codeCourse = codeCourse;
		this.professor = professor;
	}

	public Character getcodeCourse() {
		return codeCourse;
	}

	public void setcodeCourse(Character codeCourse) {
		this.codeCourse= codeCourse;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
