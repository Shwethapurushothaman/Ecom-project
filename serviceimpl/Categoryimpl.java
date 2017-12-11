package com.textile_app.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.textile_app.dao.Categorydao;
import com.textile_app.model.Category;
import com.textile_app.model.Product;

import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	@Service("CategoryDAO")
	public class Categoryimpl implements Categorydao{
		@Autowired
		SessionFactory sessionFactory;
		public void addcategory(Category ap) {
			//System.out.println("AddProduct DAO");
			//UserCredential uc=new UserCredential();
			//uc.setUsername(r.getUsername());
			//uc.setPassword(r.getPassword());
			//System.out.println("User Credentials");
			try
			{
			Session session= sessionFactory.openSession();
			Transaction tx=session.beginTransaction();
			//tx.begin();
			session.save(ap);
			//session.save(uc);
			tx.commit();
			session.flush();
			session.close();
			} 
			catch(Exception e)
			{
				System.out.println("Error"+e);
			}		
		}
	       public List<Category> getProducts() {
		    	Session session =sessionFactory.openSession();
		    	//System.out.println("view product session object"+session);
		    	 Transaction transaction =  session.beginTransaction();
		    	List<Category> productList=null;
	 	        try {
	 	        productList= session.createQuery("from Category").list();   
	         	    transaction.commit();                 
	           }
	          catch (Exception e) {
	          transaction.rollback();
	          e.printStackTrace();
		       }
	 	     session.close();
			 return productList;
		    }
	    
	       public void edit_list(Category adp){
	    	   Session session =sessionFactory.openSession();
	    	  // System.out.println("edit session"+session);
		    	 Transaction transaction =  session.beginTransaction();
		    	List<Category> editlist=null;
		        try {
				    int id=adp.getid();
				  //  System.out.println("@@@@@@@"+id);
		        	   //int pid=adp.getid();
				   // System.out.println("id******"+id);
			        editlist=  session.createQuery("from Category where id=:id").setParameter("id",id).list();
			   // System.out.println("editlist *********"+editlist); 		     		       
			        editlist.get(0).setid(adp.getid());
			        editlist.get(0).setName(adp.getName());
			        editlist.get(0).setDesc(adp.getDesc());
			        session.saveOrUpdate(editlist.get(0));
			        transaction.commit();
	  	        }
	           catch (Exception e) {
	               transaction.rollback();
	               e.printStackTrace();
	 		       }  
		          session.close();
	        }
	    
	       public Category single_object(int id)
	       {
	          Session session =sessionFactory.openSession();
	         // System.out.println("single object session"+session);
		      Transaction transaction =  session.beginTransaction();
		      List<Category> b4=null;
		    	try
		        {
		    	//String query=.list();
		    	//System.out.println(query);
	            b4 =  session.createQuery("from Category where id= :id").setParameter("id",id).list();
	         //  System.out.println("*****"+b4.get(0));
	            transaction.commit();
	            session.close();             
		    }        
		    catch (Exception e) 
		    {
	           transaction.rollback();
	           e.printStackTrace();
	        }
	  	     return b4.get(0);
	       }
	       
	       public void deleteRow(int id) {  
	  	    	   Session session =sessionFactory.openSession();
		       	   Transaction transaction =  session.beginTransaction();
			       List<Product> del=null;
			       try{
			    	 del=session.createQuery("from Category where id=:id").setParameter("id", id).list();
	    	          session.delete(del.get(0));
	    	          transaction.commit();
	  	            session.close();
	     	    
			       }
	          catch(Exception e){
	              transaction.rollback();
	              e.printStackTrace();
	        }
	}
	       public List<Category> getCategories() {
	    	   return getProducts();
	    	  }
	      
	    public void del_catid(Category cid)
	    {
	    	Session session =sessionFactory.openSession();
	        // System.out.println("single object session"+session);
	 	      Transaction transaction =  session.beginTransaction();
	 	      List<Product> bk=null;
	    	         bk=session.createQuery("from Product where cid=:cid").setParameter("cid",cid).list();;
	        session.delete(bk.get(0));
	        System.out.println("deleted*******************");
	    }
	    public int checkcategoryid(Category cid)
	    {
	        System.out.println("check the dao line");
	        Session session =sessionFactory.openSession();
	        // System.out.println("single object session"+session);
	 	      Transaction transaction =  session.beginTransaction();
	 	      List<Product> bk=null;
	 	    	try
	 	        {
	 	    	//String query=.list();
	 	    	//System.out.println(query);
	           bk =  session.createQuery("from Product where pid= :pid").setParameter("pid",cid).list();
	        System.out.println("check cid object in daoimpl"+bk.get(0));
	        if(bk.get(0)!=null)
	            return 1;
	        }
	        catch(ArrayIndexOutOfBoundsException e)
	        {
	        System.out.println(e);
	        }
	            return 0;
	}
		@Override
		public void Category(com.textile_app.model.Category ct) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public com.textile_app.model.Category getAddcategoryById(int id) {
			// TODO Auto-generated method stub
			return null;
		}
	

	

}
