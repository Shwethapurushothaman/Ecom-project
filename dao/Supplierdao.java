package com.textile_app.dao;

import org.springframework.stereotype.Service;

import com.textile_app.model.Supplier;
@Service("addsupplierdao")
public interface Supplierdao {
	public void addsup(Supplier sup);
	public void editsup(int i);
	public void delsup(int i);
	public void showsup();

}
