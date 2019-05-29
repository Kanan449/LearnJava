package day45_encapsulation_review;

import java.util.*;

public class Canvas {
	public static void main(String[] args) {
		Course course1 = new Course();
		course1.setName("Java Programming");
		List<String> teachers = new ArrayList<>();
		teachers.add("Vasyl");
		teachers.add("Murodil");
		teachers.add("Marufjon");
		teachers.add("Muhtar");
		
		course1.setTeachers(teachers);
		
		List<String>students = new ArrayList<>();
		students.add("Murad");
		students.add("Roman");
		students.add("Vlad");
		students.add("Gulnar");
		students.add("Ethem");
		students.add("Sung");
		
		course1.setStudents(students);
		System.out.println(course1.toString());
		
		course1.addTeacher("Maria");
		course1.addStudent("Kate");
		System.out.println(course1.toString());
		
		if(course1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher.");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(course1.getStudents().contains("Kate")) {
			System.out.println("Kate is our student");
		}else {
			System.out.println("Kate does not go to school with us");
		}
		if(course1.getStudents().contains("Kanan")) {
			System.out.println("Kanan is our student.");
		}else {
			System.out.println("Kanan is not our student");
		}
		course1.addStudent("Kanan");
		if(course1.getStudents().contains("Kanan")){
			System.out.println("Kanan is our student");
		}else {
			System.out.println("Kanan is not our student");
		}
		course1.removeStudent("Murad");
		if(course1.getStudents().contains("Murad")){
			System.out.println("Murad is our students");
		}else {
			System.out.println("Murad is not our student");
		}
	}
}
