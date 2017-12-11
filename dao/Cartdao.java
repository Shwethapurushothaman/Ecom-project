package com.textile_app.dao;

import java.util.List;

import com.textile_app.model.Product;
import com.textile_app.model.Cart;

public interface Cartdao {

  void cartsave(Cart cart1);
  List<Cart> cartlist();
Product single_object(int pid);
public void deleteRow(int productId);
}
