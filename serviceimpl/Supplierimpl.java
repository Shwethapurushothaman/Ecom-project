package com.textile_app.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.textile_app.dao.Supplierdao;
import com.textile_app.model.Supplier;

@Service
public class Supplierimpl implements Supplierdao{
SessionFactory sessionFactory;
	

	public void addsup(Supplier sup) {
		//System.out.println("Supplier DAO");
		//System.out.println(sup.getsname());
		//UserCredential uc=new UserCredential();
		//uc.setUsername(r.getUsername());
		//uc.setPassword(r.getPassword());
		
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(sup);
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


	public void editsup(int i) {
		// TODO Auto-generated method stub
		
	}


	public void delsup(int i) {
		// TODO Auto-generated method stub
		
	}


	public void showsup() {
		// TODO Auto-generated method stub
		
	}


}
