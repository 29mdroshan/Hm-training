package com.Assessment.residentRepository;
import java.util.*;



class SortByName implements Comparator<Resident>{

	@Override
	public int compare(Resident o1, Resident o2) {
		// TODO Auto-generated method stub
		return o1.getFull_name().compareTo(o2.getFull_name());
	}
	
}



public class ResidentService {
	 private static List<Resident> residentsRepository = new ArrayList<>();

	    ResidentService(){

	    }

	    /**
	     * create list of all the residents.
	     */
	    public boolean addResident(Resident resident) {
	    	
	    	return residentsRepository.add(resident);

	        
	    }

	   //Search for people with their social security number.

	    public void searchResident(int socialSecurityNumber) throws ResidentNotFoundException{
	    	int found=0;

	       for(var v: residentsRepository)
	    	   
	    	   if(socialSecurityNumber==v.getSocial_security_no()) {
	    		   System.out.println(v.toString());
	    		   found=1;
	    		   
	    	   }
	       if(found==0) {
	    		   throw new ResidentNotFoundException ("Invalid Social Security number");
	    	   
	       }
	    }

	   // Sort the name of the residents in alphabetical order.

	    public List getAllNamesSorted(){

	       Collections.sort(residentsRepository,new SortByName());
	       return residentsRepository;

	    }

	   // Fetch the list of residents based on their gender.
	    public List<Resident> getAllResidentsByGender(char gender){
	    	List<Resident> list= new ArrayList();
	    	for(var v: residentsRepository) {
	    		if(gender==v.getGender()) {
	    			list.add(v);
	    			
	    		}
	    	}
	    	
	       return list;
	    }
	    
	    
	    


}
