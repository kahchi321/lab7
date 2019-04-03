/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author wic180056
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String old;
       List student=new List();
       String name="name";
        System.out.println("Enter your student name list. Enter 'n' to end... ");
       while(!name.equals("n")){
            name=s.nextLine();
            if(!name.equals("n"))
            student.add(name);
        }
        System.out.println("");
        System.out.println("You have enter the following students' name:");
        student.printList();
        System.out.println("");
        System.out.println("The number of student entered is : "+ student.getSize());
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        String input=s.next();
        if(input.equals("r"));{
        System.out.println("Enter the existing student name that u want to rename: ");
        old=s.nextLine();
        System.out.println("");
        System.out.println("Enter the new name:");
        name=s.nextLine();
        student.replace(old, name);
        System.out.println("");
        System.out.println("The new student list is :");
        student.printList();
        System.out.println("");
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        name=s.next();
        if(name.equals("y")){
            System.out.println("Enter a student name to remove : ");
            name=s.nextLine();
            student.removeElement(name);
        }
        System.out.println("The number of updated student is :" + student.getSize());
        System.out.println("The updated student list is :");
        student.printList();
        System.out.println("");
        
    }
      System.out.println("All student data capture complete. Thank you!");  
    }
    
}
