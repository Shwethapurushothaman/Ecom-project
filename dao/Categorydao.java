package com.textile_app.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.textile_app.model.Category;
@Service("addcategorydao")

public interface Categorydao {
	public void Category(Category ct);
	public  List<Category> getProducts();
	Category single_object(int pid);
	void edit_list(Category adp);
	public void deleteRow(int id);
	Category getAddcategoryById(int id);



}
