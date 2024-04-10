package com.Assessment.residentRepository;
import java.util.*;

public class Call {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Resident resident1 = new Resident("roshan",1,'M');
		Resident resident2 = new Resident("ahmed",2,'M');
		Resident resident3 = new Resident("priya",3,'F');
		Resident resident4 = new Resident("hina",4,'F');
		
		ResidentService rs= new ResidentService();
		rs.addResident(resident1);
		rs.addResident(resident2);
		rs.addResident(resident3);
		rs.addResident(resident4);
		
		Resident resident_found=new Resident();
		System.out.println("Please eneter Social Security number : ");
		int ssn= scan.nextInt();
		try {
		rs.searchResident(ssn);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		System.out.println("Please enter gender [M/F]: ");
		char c=scan.next().charAt(0);
		List<Resident> arr= new ArrayList();
		arr=rs.getAllResidentsByGender(c);
		System.out.println("The Resident Are : ");
		for(var v: arr) {
			System.out.println(v.toString());
		}
		
		System.out.println("***Sorting based on Names***");
		arr=rs.getAllNamesSorted();
		for(var v:arr)
			System.out.println(v.toString());
		
	}

}
