/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.StudentMS.Interface.impl;

import com.leapfrog.StudentMS.Interface.StudentDAO;
import com.leapfrog.StudentMS.utill.Student;
import java.util.ArrayList;

/**
 *
 * @author itcomputer
 */
public class StudentDAOimpl implements StudentDAO {
    private ArrayList<Student> studentList=new ArrayList<>();
    

    @Override
    public int insert(Student s) {
        studentList.add(s);
        return 1;
        
    }

    @Override
    public int delete(int id) {
        for(Student s:studentList){
           if(s.getId()==id){
               studentList.remove(s);
               
                     
           }
        }
        
        
    return 0;    
    }

    @Override
    public Student getbyid(int id) {
        studentList.get(id);
        return null;
                
    }
    @Override
    public ArrayList<Student> getall(){
        return studentList;
    }

    @Override
    public void getbyid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        
        
