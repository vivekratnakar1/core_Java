package com.for_loop.max.studnet;
//College Attendance Tracker
public class StudentsDriver {

	public static void main(String[] args) {
		
		String[] names = {"Rahul", "Amit", "Priya", "Sneha"};
		double [] attendance = {82.0, 68.5, 91.2, 71.0};
		int [] rollNumbers = {101, 102, 103, 104};

		//  'names.length' run loop...

		for (int i = 0; i < names.length; i++) 
		{
		    if (attendance[i] < 75.0) 
		    {
		        // Student[i].names replace by  names[i] and attendance[i] 
		        System.out.println("Low Attendance : " + names[i] + " (" + attendance[i] + "%)");
		    }
		}
		
		
		
		
	}
	
		
}
