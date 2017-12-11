package com.textile_app.controller;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.textile_app.dao.Productdao;
import com.textile_app.dao.registerdao;
import com.textile_app.model.Product;
import com.textile_app.model.usercredential;

@Controller
public class loginpagecontroller {

	
	@Autowired
	 registerdao registerdao;

	@Autowired
	Productdao adao;
	//@SuppressWarnings("unchecked")
		//@SuppressWarnings("unchecked")
		@RequestMapping(value="/login_session_attributes")
		public ModelAndView login_session_attributes(HttpSession session,Model model) {
			System.out.println("Spring Security");
			String userid = SecurityContextHolder.getContext().getAuthentication().getName();
			//UserCredential user = registerdao.getuserid(userid);
			//session.setAttribute("name", user.getName());
			//session.setAttribute("password", user.getPassword());
			//session.setAttribute("LoggedIn", "true");

			Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
			ModelAndView page=null;
			//String role="ROLE_USER";
			for (GrantedAuthority authority : authorities) 
			{
			  
				 if (authority.getAuthority().equals("ROLE_USER")) 
			     {
			    	// session.setAttribute("UserLoggedIn", "true");
					 page = new ModelAndView("productlist");
	         	        List<Product> teams = adao.getProducts();
	         	        //System.out.println("obj:"+teams);
	        page.addObject("lists", teams);
	        	        break;
			    
			 		 //session.setAttribute("cartsize",cartDAO.cartsize((int)session.getAttribute("userId")));
			     }
			     else 
			     {
			    	 session.setAttribute("admin", "true");
					 page = new ModelAndView("admin");
				     break;
			    }
			}
			return page;
		}


	   //@RequestMapping(value="product")
		//public String product()
		//{
			//System.out.println("product");
			//return "product";
		//}

}
