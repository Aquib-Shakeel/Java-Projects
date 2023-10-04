package com.pwskills.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       Student stud=null;
       
      
      
       Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       
       
       stud=s.get(Student.class,57);
       
      
       System.out.print(stud);
    }
}
