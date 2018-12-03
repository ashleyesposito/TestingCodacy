/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcourse;

/**
 *
 * @author Ashley
 */
public class TestCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Construct a default Course
         Course course001 = new Course();
       // Call the get values
      System.out.println("course 001 name is: " +
                 course001.getCourseName());
          System.out.println("course 001 num students is: " +
               course001.getNumStudents());
      System.out.println( "number courses is: " +
                 Course.getNumCourses());
    }
    
}
