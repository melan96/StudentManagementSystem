/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDefinition;

/**
 *
 * @author melandias
 */
public class Student {
    
    private String studentName;
    private String studentAddress;
    private int studentAge;
    private static int studentID = 0;
    private int studentGPA;

    public Student(String studentName, String studentAddress, int studentAge, int studentGPA) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentGPA = studentGPA;
        
        genID();
        System.out.println("System Added STUDENT  : "+studentID+" Successfully");
    }
    
    private static void genID(){
       studentID++;
        
    }
   
    
}
