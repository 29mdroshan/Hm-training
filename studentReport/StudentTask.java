package com.Assessment.studentReport;
import java.util.*;


public class StudentTask {
	
	public void printing(List<Student> stu) {
		for(Student s:stu) {
			System.out.println(s.toString());
		}
	}
	
	
	public double findAverageTotalMarks(List<Student> stu) {
		double sum=0;
		
		for(Student s:stu) {
			double mark=s.getMarks();
			sum+=mark;		
		}
		double len= stu.size();
		return sum/len;
	}
	
	
	
	public void printTopScorer(List<Student> stu) {
		double score=0;
		Student topScore= new Student();
		
		for(Student s:stu) {
			double mark=s.getMarks();
			if (mark>score) {
				score=mark;
				topScore=s;
			}
		}
		System.out.println(topScore.toString());
		
	}
	
	public List<Student> findPassedStudent(List<Student> stu) {
		
		List<Student> arr= new ArrayList();
		for(Student s:stu) {
			if(s.getMarks()>=60) {
				arr.add(s);
					
				}
			}
		return arr;

	}
	
	
	public List<Student> findFailedStudent(List<Student> stu) {
		List<Student> arr= new ArrayList();
		for(Student s:stu) {
			if(s.getMarks()<60) {
				arr.add(s);
				
				}
			}
		return arr;
		
	}

		
		
}
