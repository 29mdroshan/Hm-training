## Problem Statement 1 - Student Report Generation

**Educational institutions are overburdened with paperwork and manual processes. They also find it difficult to maintain records of the students’ results, attendance, assessments, etc. The teachers with the help of the technical team have to set up a system that automates the grading system. Teams are formed and each team is assigned a task.**

**Evaluation and Grading:**

This team needs to evaluate the results and grades of the students. In order to do this, the below calculations have to be made on the data entered.
- Calculate the total marks scored by each student.
    -- public double findTotalMarks()
- Find the class average marks.
    -- public double findAverageTotalMarks()
- Find the top scorer of the class and display the name of the student.
    -- public void printTopScorer()
- Find the students who have cleared the examination.  (Pass marks = 60)
    -- public List<Student> findPassedStudent()
- Find the students who have failed in a subject and have to reappear for that exam.
    -- public List<Student> findFailedStudent()

### Tasks : 

1. Create a List of Student
1. Identify the objects from the problem statement.
1. Identify the classes from the problem statement.
1. Identify the attributes from the classes.
1. Identify behaviour for the classes.

### Class Diagram 

```text

Student

- id : int
- name : String
- marks : double
- address : String

```


## Problem Statement 2 - Resident Repository

**A city hospital has announced a full body check-up, free of cost, for its local residents.
People who wish to avail this facility can use the hospital’s website to register themselves. 
The registration form requires you to fill in the following details:**

**Full Name  

**Social Security number

**Gender (M/F)     

**Implement the following functionalities in the program:


          1. Create a list of all the residents. 
          2. Search for people with their social security number.
          3. Fetch the list of residents based on their gender.
	  4. ResidentNotFoundException should be thrown when Resident is not found based on social security number 

**Sample Code -**

```java

public class Resident {

    //declare the variables

    //getter setter

    //constructor

    //override toString method

}

```
**ResidentService**

```java

public class ResidentService {

    private static List<Resident> residentsRepository = new ArrayList<>();

    ResidentService(){

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident) {

        return false;
    }

   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber) throws ResidentNotFoundException{

       return null;

    }

   // Sort the name of the residents in alphabetical order.

    public List getAllNamesSorted(List residentsRepository){

        return null;

    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender){


       return null;
    }

}

```

