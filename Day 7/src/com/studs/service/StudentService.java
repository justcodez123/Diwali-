package com.studs.service;

import com.studs.students.Student;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class StudentService {
	public void storeStudents(List<Student> students, String filename) {
        // Use try-with-resources to ensure the streams are closed automatically
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Write the entire list object to the file
            oos.writeObject(students);
            System.out.println("Successfully stored " + students.size() + " students in " + filename);

        } catch (IOException e) {
            System.err.println("Error storing students: " + e.getMessage());
        }
    }
}
