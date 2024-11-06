/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner scanner;
Scanner scanner;
scanner = new Scanner(System.in);
System.out.print("Enter your first name :");
String fname = scanner.nextLine();
System.out.print("Enter your last name :");
String Lname = scanner.nextLine();
System.out.print("Enter your age :");
int age = scanner.nextInt();
System.out.print ("Enter your student ID number: ");
int studentID = scanner.nextInt();
System.out.print("Enter the program you're enrolling in (e.g., Computer Science, Business Administration");
String program = scanner.nextLine();
System.out.print("Enter your intended major or concentration: ");
String intended = scanner.nextLine();
System.out.print("Enter your high school GPA: ");
int gpa = scanner.nextInt();
System.out.print("Enter your address : ");
String address = scanner.nextLine();
System.out.print("Enter your guardian or emergency contact's full name: ");
String guardian = scanner.nextLine();
System.out.print("Enter your guardian's contact number: ");
int number = scanner.nextInt();
        System.out.println("Student name: " + fname + " " + Lname);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Program:" + program);
        System.out.println("intended Major/Concentration:" + intended);
        System.out.println("High school GPA: " + gpa);
        System.out.println("Address :" + address);
        System.out.println("Guardian/Emergency contact :" + guardian);
        System.out.println("Guardian's Contact Number :" + number);
    
               
        
        




    }
    
}


