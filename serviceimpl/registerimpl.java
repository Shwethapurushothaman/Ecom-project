package com.textile_app.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.textile_app.dao.registerdao;
import com.textile_app.model.register;
import com.textile_app.model.usercredential;
@Service
public class registerimpl implements registerdao
{
	
	@Autowired
	SessionFactory sessionFactory;
	public void adduser(register r) {
		//System.out.println("Register DAO");
		//System.out.println(r.getId());
		//System.out.println(r.getName());
		usercredential uc=new usercredential();
		uc.setName(r.getUsername());
	    uc.setPassword(r.getPassword());
	    uc.setRole("ROLE_USER");
		//System.out.println("User Credentials");
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		//tx.begin();
		session.save(r);
		session.save(uc);
		tx.commit();
		session.flush();
		session.close();
		} 
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}		
	}
	public void getinfo() {
		// TODO Auto-generated method stub
		
	}
	public void edituser(int i) {
		// TODO Auto-generated method stub
		
	}
	public void deluser(int i) {
		// TODO Auto-generated method stub
		
	}
	public void showuser() {
		// TODO Auto-generated method stub
		
	}
}