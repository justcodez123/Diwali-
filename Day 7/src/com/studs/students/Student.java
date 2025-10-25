package com.studs.students;

import com.studs.exception.LowAttendanceException;
import java.io.Serializable;

/*
 * Create a class Student with following details: rollno, sname, course, 
attendance_percentage, score 
1. Add constructors - default and parameterized 
2. Add method – calculateGrade() 
3. If the attendance_percentage is lesser than 60%, throw a user defined exception 
and print appropriate message 
4. Store 10 student objects in file using serialization 
5. Create appropriate collection for storing students in the decreasing order of 
attendance_percentage 
 * */

public class Student implements Serializable{
	// Make sure to add a serialVersionUID for stable serialization
    private static final long serialVersionUID = 1L;

    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    // 1. Default constructor
    public Student() {}

    // 1. Parameterized constructor
    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    // 2. Method to calculate grade
    public char calculateGrade() throws LowAttendanceException {
        
        // 3. Check attendance and throw the custom exception
        if (attendance_percentage < 60) {
            throw new LowAttendanceException(
                "Student " + sname + " (Roll: " + rollno + ") is ineligible for grading. " +
                "Attendance is " + attendance_percentage + "% (Minimum 60% required)."
            );
        }

        // Grade calculation logic (can be adjusted as needed)
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    // Getter needed for sorting (Req 5)
    public double getAttendancePercentage() {
        return attendance_percentage;
    }

    // toString() method for easy printing
    @Override
    public String toString() {
        return String.format("Student[Roll: %-3d | Name: %-10s | Course: %-6s | Attendance: %-5.1f%% | Score: %-5.1f]",
            rollno, sname, course, attendance_percentage, score);
    }	
	
	
}
