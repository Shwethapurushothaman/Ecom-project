package com.textile_app.dao;

import java.util.List;


import org.springframework.stereotype.Service;

import com.textile_app.model.Product;

@Service("Productdao")
public interface Productdao {
	public void addpro(Product a);
	public void editpro(int i);
	public void delpro(int i);
	public void showpro();
	public List<Product> getProducts();
	public Product single_object(int pid);
	public void edit_list(Product adp);
	public void deleteRow(int pid);
	
	public void product(Product apt);

	

}
