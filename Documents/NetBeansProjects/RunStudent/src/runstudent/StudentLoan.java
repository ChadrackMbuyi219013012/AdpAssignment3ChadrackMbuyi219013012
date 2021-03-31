/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runstudent;
import java.util.*;

/**
 *
 * @author CHADRACK MBUYI
 */
public class StudentLoan 
{
    Student [] stud = new Student [20];
    int numOfStudents;
    
    
    public StudentLoan()
    {
        stud [0]=new Student("Chadrack", 219013012, 17000.0);
        stud [1]=new Student("Chadrack", 219013012, 17000.0);
        stud [2]=new PostGraduate("Chadrack", 219013012, 17000.0, "I dont know");
        stud [3]=new PostGraduate("Chadrack", 219013012, 17000.0, "I dont know");
        int numOfStudents = 4;
    }
    
    public int menu()
    {
    Scanner kbd = new Scanner(System.in);
    int choice ; 
        System.out.println("1: Add Student");
        System.out.println("2: Display Student");
        System.out.println("3: Display interest");
        System.out.println("4: Exit");
        choice =kbd.nextInt();
        return choice;
    }
    
    public Student createStudent()
    {
        Scanner kbd = new Scanner(System.in);
        String name;
        long studentNumber;
        double loanAmount;
        System.out.println("Please Enter the name of the student");
        name = kbd.next();
        System.out.println("Please Enter the student number");
        studentNumber = kbd.nextLong();
        System.out.println("Please Enter the student loan amount");
        loanAmount = kbd.nextDouble();
        Student stud = new Student(name, studentNumber, loanAmount);
        return stud;
    }
    
    public PostGraduate createPostGraduate()
    {
        Scanner kbd = new Scanner(System.in);
        String name, thesis;
        long studentNumber;
        double loanAmount;
        System.out.println("Please Enter the name of the student");
        name = kbd.next();
        System.out.println("Please Enter the student number");
        studentNumber = kbd.nextLong();
        System.out.println("Please Enter the student loan amount");
        loanAmount = kbd.nextDouble();
        System.out.println("Please Enter the student thesis");
        thesis = kbd.next();
        PostGraduate postGraduate = new PostGraduate(name, studentNumber, loanAmount, thesis);
        return postGraduate;
    }
    
    public void displayAllStudents()
    {
        System.out.println("Review of all Students");
        System.out.println("======================");
        for (int i=0;i<numOfStudents;i++)
       {
           stud[i].Show();
           //System.out.println(stud[i].toString());
           System.out.println("--------------------------");
       }
    }
    
    public void displayLoanAmounts()
    {
        System.out.println("Loan amounts and interests");
        System.out.println("==========================");
        for (int i=0;i<numOfStudents;i++)
       {
           System.out.println("R"+stud[i].getLoanAmount()+" "+" "+" "+"R"+stud[i].interest());
           System.out.println("--------------------------");
           //System.out.println(stud[i].toString());
       } 
    }
    
    public void menuControl()
    {
        int option;
        
        while (true){
            option = menu();
            switch (option){
                case 1:
                    add();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    displayLoanAmounts();
                    break;
                case 4:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("Not a valid option");
                    System.out.println("Please try again!!");
            }
        }
    }
    
    public void add()
    {
        int choice;
        Student student;
        PostGraduate postGraduate;
        Scanner kbd = new Scanner (System.in);
        System.out.println("Please Enter 1 for Student");
        System.out.println("Please Enter 2 for Post graduate Student");
        choice = kbd.nextInt();
        switch (choice){
            case 1:
                student = createStudent();
                stud[numOfStudents] = student;
                numOfStudents++;
                break;
            case 2:
                postGraduate = createPostGraduate();
                stud[numOfStudents] = postGraduate;
                numOfStudents++;
                break;
            default:
                System.out.println("Wrong choice");
        }
                
    }
    
}


