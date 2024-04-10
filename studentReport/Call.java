package com.Assessment.studentReport;
import java.util.*;

public class Call {
	public static void main(String[] args) {
		Student s1=new Student(1,"roshan",80,"Bangalore");
		Student s2=new Student(2,"ahmed",90,"Mysore");
		Student s3=new Student(3,"rahul",55,"Bangalore");
		Student s4=new Student(4,"yash",40,"Mandya");
		Student s5=new Student(5,"arun",65,"Mysore");
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		StudentTask studentTask = new StudentTask(); 
		System.out.println("***Average Of the Class***");
		double avg=studentTask.findAverageTotalMarks(list);
		System.out.println("The average of the class is : "+avg);
		
		System.out.println("***TOP Scorer***");
		studentTask.printTopScorer(list);
		
		List<Student> arr=new ArrayList();
		System.out.println("***Passed Student***");
		arr = studentTask.findPassedStudent(list);
		studentTask.printing(arr);
		
		System.out.println("***Failed Student***");
		arr= studentTask.findFailedStudent(list);
		studentTask.printing(arr);

		
	}

}
