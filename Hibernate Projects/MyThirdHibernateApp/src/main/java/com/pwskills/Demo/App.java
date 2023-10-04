package com.pwskills.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       
       Employee e = null;
      
       Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class);
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
      
       e=s.get(Employee.class,1);

       System.out.print(e);
       s.close();
    }
}
