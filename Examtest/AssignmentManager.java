

package Examtest;
import java.util.Scanner;
import java.util.Date;
class Student
{
    void name(String name)
    {
        System.out.println("name of student is :"+name);
    }
    void prnno(int prnno)
    {
        System.out.println("prnno of student isv: "+prnno); 
    }
}
class Trainer extends Student
{
    void name(String name)
    { 
       
        System.out.println("Trainer name is :"+name);
    }
}
class Assignment extends Trainer
{
    void title()
    {
        System.out.println("Assignment on core java");
    }
    void date()
    {
     
        System.out.println(new Date());
    }
    void description()
    {  
        System.out.println("write a program to implement the hierarchical inheritance");
    }
    void assignee()
    {
        System.out.println("five assignment");
    }
      
}


public class AssignmentManager {
    
    public static void main(String[] args) {
              
        Scanner obj=new Scanner (System.in);
        System.out.println("Enter the name of student");
          String name=obj.nextLine();
          System.out.println("Enter the prnno of student");
          int prnno=obj.nextInt();
          
          Student s1=new Student();
             s1.name(name);
             s1.prnno(prnno);            
             
          Trainer t1=new Trainer();
           Scanner obj1=new Scanner (System.in);
          System.out.println("Enter the name of the Trainer");          
          String  Trainername=obj1.nextLine();
              t1.name(Trainername);  
          
           Assignment as=new Assignment();   
           Scanner val=new Scanner (System.in);           
         System.out.println("Enter the value");
         int choice =val.nextInt();
            switch (choice)
            { 
                case 1:  as.title();
                        break;
                case 2:  as.date();
                        break;
                case 3:  as.description();
                        break;
                case 4:  as.assignee();
            }     
    } 
    void showAssignment(){}
    void saveAssignment(){}
    void loadAssignment(){}
 
    }
    

