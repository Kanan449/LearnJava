package day44_constructors02;

import java.util.*;

public class Job_Dice {
public static void main(String[] args) {
	Job job1= new Job();
	Job job2= new Job("Java Developer");
	Job job3= new Job("SDET","Amazon", 130_000.0);
	
	System.out.println();
	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job3.toString());
	
	
	
	//Create a list of jobs and add 5 different jobs with company, salary and title
	List<Job>jobList = new ArrayList<>();
	jobList.add(job3);
	jobList.add(new Job("Scrum Master", "Google", 123000));
	jobList.add(new Job("SDET", "FreddieMac", 100000));
	jobList.add(new Job("BA", "Leidos", 98000));
	jobList.add(new Job("Senior QA Tester","Delta", 150000));
	
	System.out.println(jobList.toString());
	
	//find highest paying job and print toString for that
	double maxSalary = 0;
	int index = -1;
	for(int i = 0; i < jobList.size(); i++) {
		if(jobList.get(i).getAnnualSalary()>maxSalary) {
			maxSalary=jobList.get(i).getAnnualSalary();
			index = i;
		}
	}
	System.out.println("Highest Salary "+jobList.get(index).toString());
}
}
