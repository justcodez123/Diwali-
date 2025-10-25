package com.studs.test;
/*rollno, sname, course, 
attendance_percentage, score */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.studs.exception.LowAttendanceException;
import com.studs.service.StudentService;
import com.studs.students.Student;

public class TestStudents {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Alice", "CS", 95.5, 92.0));
        studentList.add(new Student(102, "Bob", "IT", 85.0, 88.5));
        studentList.add(new Student(103, "Charlie", "CS", 55.0, 95.0)); // Low attendance
        studentList.add(new Student(104, "David", "MECH", 99.0, 75.0));
        studentList.add(new Student(105, "Eve", "IT", 65.5, 62.0));
        studentList.add(new Student(106, "Frank", "ECE", 78.0, 81.0));
        studentList.add(new Student(107, "Grace", "MECH", 92.0, 89.0));
        studentList.add(new Student(108, "Heidi", "CS", 45.9, 99.0)); // Low attendance
        studentList.add(new Student(109, "Ivan", "IT", 88.5, 79.5));
        studentList.add(new Student(110, "Judy", "ECE", 91.0, 93.0));
        
        System.out.println("--- Testing Grade Calculation ---");
        // Test calculateGrade() and handle the exception
        for (Student s : studentList) {
            try {
                char grade = s.calculateGrade();
                System.out.println("Grade for " + s.toString() + " -> " + grade);
            } catch (LowAttendanceException e) {
                // Catch the specific exception for students with low attendance
                System.err.println("Grading Failed: " + e.getMessage());
            }
        }
        
     // 4. Store 10 student objects in a file using serialization
        System.out.println("\n--- 4. Storing Students in File ---");
        StudentService service = new StudentService();
        service.storeStudents(studentList, "students.ser");


        // 5. Create collection for storing students in decreasing order of attendance
        System.out.println("\n--- 5. Sorted Student Collection (Descending Attendance) ---");
        
        // Define a Comparator to sort by attendance in reverse (decreasing) order
        Comparator<Student> attendanceSorter = Comparator
            .comparingDouble(Student::getAttendancePercentage)
            .reversed();

        // Use a TreeSet, which is a collection that automatically sorts its elements.
        // We provide our custom sorter to its constructor.
        TreeSet<Student> sortedStudents = new TreeSet<>(attendanceSorter);

        // Add all students from the list to the sorted set
        sortedStudents.addAll(studentList);

        // Print the sorted set
        for (Student s : sortedStudents) {
            System.out.println(s);
        }
        
	}

}