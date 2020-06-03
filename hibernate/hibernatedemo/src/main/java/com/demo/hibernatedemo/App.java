package com.demo.hibernatedemo;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
       QmQuery qm = new QmQuery();
       QmQueryDetails qmd = new QmQueryDetails();       
     
      
       Configuration cfg = new Configuration().configure().addAnnotatedClass(QmQuery.class).addAnnotatedClass(QmQueryDetails.class);
       ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry() ;
		
		
       SessionFactory sf = cfg.buildSessionFactory(reg);
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
       //Add records
       Addrecord(qm,qmd);
       session.saveOrUpdate(qm);
       session.saveOrUpdate(qmd);
       
       //Join table
       getListFromOuterJoin(session);
       getListFromInnerJoin(session);
       
       //Fetch record
       Fetchrecord(qm,session);
       
    
       //Delete recodrs
       QmQuery deleteQa = new QmQuery();
       QmQueryDetails deleteQmd = new QmQueryDetails();   
       Deleterecord(deleteQa,deleteQmd,session);
       
      
   
       tx.commit();
       
    }
    
    
    
  //Add new to record database  
  public static void Addrecord(QmQuery qm,QmQueryDetails qmd) {
    	//Add qmquery
         qm.setQueryId(5001);
         qm.setIndusId("Mech");
         qm.setCategory("Bill"); 
         qm.setAssignedto("admin");
         qm.setDateRaised(new Date());
         qm.setLastUpdatedBy("System");
         qm.setAssigneddepartment("admin");
         
         qm.setEmpuserName("Mark");
         qm.setLluserName("waugh");
         qm.setQueryType("querytype");
         qm.setSubCategory("Travel");
         
         //Add querydetail tabel
         qmd.setQueryId(5001);
         qmd.setQueryDetailId(202);
         qmd.setCallFromName("Mac");
         qmd.setCallFromType("Email");
         qmd.setCallFromNumber("test");
         
         qm.setQmQueryDetails(qmd);
        
         }
  
  
  //Delete new to record database  
  public static void Deleterecord(QmQuery qm,QmQueryDetails qmd,Session session) {
    	//Add qmquery
       try { 
    	   
    	  QmQuery emp = (QmQuery) session.load(QmQuery.class, 1237L);
    	  QmQueryDetails empDet = (QmQueryDetails) session.load(QmQueryDetails.class, 104L);
    	  session.delete(empDet);
           session.delete(emp);
           System.out.println("**************delete record  ********************");
     
        
       }catch(Exception e) {
    	   
    	   System.out.println("from Exception"+e.getMessage());
    	   
    	   
       }
        
         
        
         }
  
  
  
  
  //To get left outer join to fetch data
  
  @SuppressWarnings("unchecked")
 	private static void getListFromOuterJoin(Session session) {
	  
	  
	  DetachedCriteria queryDetailCriteria = DetachedCriteria.forClass(QmQueryDetails.class);
	  queryDetailCriteria.setProjection(Property.forName("queryId"));
	  
         Criteria criteria = session.createCriteria(QmQuery.class);
         criteria.add(Restrictions.eq("queryId", 1236L));
         criteria.add(Property.forName("queryId").in(queryDetailCriteria));
         List<QmQuery>  result = (List<QmQuery>) criteria.list();
         System.out.println("**************Outer Join ********************");
         System.out.println("App.getListFromOuterJoin()"+result.toString());
         System.out.println("**************Outer Join ********************");
     }
  
  
  

  
  //To get innner join to fetch data
  
  @SuppressWarnings("unchecked")
 	private static void getListFromInnerJoin(Session session) {
	  
	  
	  DetachedCriteria queryDetailCriteria = DetachedCriteria.forClass(QmQuery.class);
	  queryDetailCriteria.setProjection(Property.forName("queryId"));
	  
         Criteria criteria = session.createCriteria(QmQueryDetails.class);
         criteria.add(Restrictions.eq("queryId", 1236L));
         criteria.add(Property.forName("queryId").in(queryDetailCriteria));
         List<QmQuery>  result = (List<QmQuery>) criteria.list();
         
         System.out.println("**************inner Join ********************");
         System.out.println("App.getListFromInnerJoin()"+result.toString());
         
         System.out.println("**************inner Join ********************");
     }

  
  //Fetching record from single table
  
  public static void Fetchrecord(QmQuery qm,Session session) {
	  Criteria criteria = session.createCriteria(QmQuery.class);
      criteria.add(Restrictions.eq("queryId", 1236L));
      List<QmQuery>  result = (List<QmQuery>) criteria.list();
      System.out.println("**************Fetch single record Join ********************");

	       System.out.println("App.Fetchrecord()"+result.toString());
	   System.out.println("**************Fetch single record Join ********************");
         }


}
