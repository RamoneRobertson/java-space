package main;

import university.Student;
import university.Course;
import university.Enrollment;

public class Main {
    public static void main(String [] args){
        Student student = new Student();
        student.setStudentId(480612);
        student.setName("Brody James");

        Course course = new Course();
        course.setCourseId(89112);
        course.setCourseName("Computer Architecture");


        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);

        System.out.println("Enrollment Details: \n" +
                "Student Name: " + enrollment.getStudent().getName() + "\n" +
                "Course Info: \n" +
                "Course ID: " + enrollment.getCourse().getCourseId() + "\n" +
                "Course Name: " + enrollment.getCourse().getCourseName());
    }
}
