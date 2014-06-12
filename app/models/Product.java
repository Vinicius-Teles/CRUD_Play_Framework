package models;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	public Long id;
	public String name;
	public Double price;
	public String category;
	public String descricao;
	
	public static List<Product> all() {
		return new ArrayList<Product>();
	}
  
	public static void create(Product task) {
	
	}
  
	public static void delete(Long id) {
	
	}
}
