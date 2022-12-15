package com.hibernatehqllab.hibernatehqllabcode;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class App 
{
    public static void main( String[] args )
    {
    	Books b1 = new Books();
        Configuration cf  = new Configuration().configure().addAnnotatedClass(Books.class);
        SessionFactory sf = cf.buildSessionFactory();
        Session ses = sf.openSession();
        ses.beginTransaction();
        
        
        //To Update Record
        /*
        Query q = ses.createQuery("update Books set BName=:name,Price=:c where BookId=:i");
        q.setParameter("name", "C++");
        q.setParameter("c",900);
        q.setParameter("i", 3);
        int n = q.executeUpdate();
        System.out.println(n + " row updated successfully");
        ses.getTransaction().commit();
        ses.close();
        */
        
        
        //To select record
        /*
        Query q = ses.createQuery("select max(Price) from Books");
        List<Integer> list = q.getResultList();
        System.out.println(list.get(0));
        ses.getTransaction().commit();
        ses.close();
        */
        
        
        //To Delete Record
        /*
        Query q = ses.createQuery("delete from Books where BookId=:i");
        q.setParameter("i", 3);
        int n = q.executeUpdate();
        System.out.println(n + " row deleted successfully");
        ses.getTransaction().commit();
        ses.close();
        */
        
        
        //****By Using HCQL i.e Criteria Interface****
        //Select with Criteria
        //Greater than method of the Restrictions class
        /*
        Criteria q = ses.createCriteria(Books.class);
        q.add(Restrictions.gt("Price", 600));
        List list = q.list();
        System.out.println(list);
        ses.getTransaction().commit();
        ses.close();
        */
        
        
        //startWith Method by using like
        /*
        Criteria q  = ses.createCriteria(Books.class);
        q.add(Restrictions.like("BName","j%"));
        List list = q.list();
        System.out.println(list);
        ses.getTransaction().commit();
        ses.close();
        */
        
    }
}
