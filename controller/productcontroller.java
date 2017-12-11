package com.textile_app.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.textile_app.dao.Productdao;
import com.textile_app.model.Product;
@Controller
public class productcontroller {
	int id;

	@Autowired
	    Productdao pdao;
	    @RequestMapping(value="Product", method=RequestMethod.GET)
	    public ModelAndView getLogin(@ModelAttribute("Product")Product product)
	    {
	                          System.out.println("Product");
	                          ModelAndView model=new ModelAndView("Product");
	                          return model;
	    }
	   
	    @Bean
		public MultipartResolver multipartresolver(){
			CommonsMultipartResolver multipartresolver=new CommonsMultipartResolver();
			return multipartresolver;
		}
	   @RequestMapping(value="Product", method=RequestMethod.POST)
	   public ModelAndView Success(Product add, Model m)
	    {
	                          pdao.addpro(add);
		MultipartFile image=add.getPimage();
	       if(image != null && !image.isEmpty())
	       {
	      	Path path=Paths.get("E://project/textile_app/src/main/webapp/pics/"+add.getPid()+".jpg");
	      try {
	   		image.transferTo(new File(path.toString()));
	   		} catch (IllegalStateException e) {
	   			// TODO Auto-generated catch block
	 			e.printStackTrace();
	  		} catch (IOException e) {
	 			// TODO Auto-generated catch block
	  			//e.printStackTrace();
	   	}
	       }

	                         ModelAndView model=new ModelAndView("viewproduct","Product", new Product());
	                    List<Product> teams = pdao.getProducts();
	               	        System.out.println("obj:"+teams);
	            model.addObject("lists", teams);
	                         return model;
	   }
    
	    
	    
//	    @RequestMapping(value="Product", method=RequestMethod.POST)
	//	public ModelAndView success(Product apt, Model m)
		//{
			//    List<Product> categories=pdao.getProducts();
			  //  m.addAttribute("categories", categories);
				//pdao.addpro(apt);
				//MultipartFile image=apt.getImage();
			      // if(image != null && !image.isEmpty())
			       //{
			      	//Path path=Paths.get("E://javaproject/pmaven1/src/main/webapp/images/"+apt.getpid()+".png");
			      	//try {
			   			//image.transferTo(new File(path.toString()));
			   		//} catch (IllegalStateException e) {
			   			// TODO Auto-generated catch block
			 		//	e.printStackTrace();
			  		//} catch (IOException e) {
			 			// TODO Auto-generated catch block
			  			//e.printStackTrace();
			   		//}
			      // }
				//ModelAndView model=new ModelAndView("redirect:viewproduct","Product", new Product());
				//List<Product> teams = pdao.getProducts();
	 	        //System.out.println("obj:"+teams);
	            //model.addObject("lists", teams);
				//return model;
		//}

@RequestMapping(value="viewproduct")
public ModelAndView listOfTeams() {
 //AddProduct addp=new AddProduct();
    ModelAndView modelAndView = new ModelAndView("viewproduct");
     	        List<Product> teams = pdao.getProducts();
     	        //System.out.println("obj:"+teams);
    modelAndView.addObject("lists", teams);
    	        return modelAndView;
}

@RequestMapping("editproduct/{pid}")  
public ModelAndView editUser(@PathVariable int pid) {  
 Product apobj = pdao.single_object(pid);  
 return new ModelAndView("editproduct", "command",apobj );  
}  

@RequestMapping(value="/editproduct/update",method=RequestMethod.POST)  
public ModelAndView updateUser(@ModelAttribute("apobj")Product adp) { 
	id=adp.getPid();
 pdao.edit_list(adp);  
 ModelAndView model=new ModelAndView("viewproduct");
 List<Product> teams = pdao.getProducts();
  //System.out.println("obj:"+teams);
 model.addObject("lists", teams);
	return model;
 
}  
@RequestMapping(value="delete/{pid}",method=RequestMethod.POST)  
public ModelAndView deleteUser(@PathVariable int pid) {  
 pdao.deleteRow(pid); 
 ModelAndView model=new ModelAndView("viewproduct");
 List<Product> teams = pdao.getProducts();
  //System.out.println("obj:"+teams);
 model.addObject("lists", teams);
	
	return new ModelAndView("redirect:http://localhost:8080/textile_app/viewproduct");
 //return new ModelAndView("viewproduct"); 
	
}  
}