/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.studentms.Program;


import com.leapfrog.StudentMS.Interface.StudentDAO;
import com.leapfrog.StudentMS.Interface.impl.StudentDAOimpl;
import com.leapfrog.StudentMS.utill.Student;
import java.util.Scanner;

/**
 *
 * @author itcomputer
 */
public class Program {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StudentDAO stdDAO=new StudentDAOimpl();
        //stdDAO.insert(new Student(1,"abhash","pradhananga","ap@gmail.com"));
        
        stdDAO.getall().forEach(s->{
            System.out.println(s.getFirstName());
        });
        System.out.println("=====================================");
        System.out.println("Menu");
        System.out.println("1.add");
        
        System.out.println("2.delete");
        
        System.out.println("3.show All");
        
        System.out.println("4.search by id");
        
        System.out.println("5.search by any");
        
        System.out.println("6.exit");
        
        System.out.println("Enter your choice[1-6]");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                Student s = new Student();
                System.out.println("Enter First Name:");
                s.setFirstName(sc.next());
                stdDAO.insert(s);
                
                break;
            case 2:
                System.out.println("Enter your id");
                stdDAO.delete(sc.nextInt());
            default:
                break;
                
                
            
        }
        
        
        
    
    
    }
    
                
        
        
        
        
       
         
                
             
         }
        
        
        
        

            