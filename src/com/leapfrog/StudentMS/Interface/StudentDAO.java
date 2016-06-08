/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentMS.Interface;

import com.leapfrog.StudentMS.utill.Student;
import java.util.ArrayList;

/**
 *
 * @author itcomputer
 */
public interface StudentDAO {
   int insert (Student s);
   int delete (int id);
   Student getbyid(int id);

    public void getbyid();
    ArrayList<Student> getall();
    
   
   

    
}
