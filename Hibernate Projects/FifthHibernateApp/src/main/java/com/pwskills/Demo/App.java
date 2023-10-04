package com.pwskills.Demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       
       Student e = new Student();
       e.setName("Aquib");
       e.setMarks(90);
       e.setRollNo(4);
       e.setDt1(new Date());
       e.setDt1(new Date());
       e.setDt1(new Date());
      
       Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
      Transaction tf=s.beginTransaction();
      
       s.save(e);
       
       tf.commit();

       System.out.print(e);
       s.close();
    }
}
