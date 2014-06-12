package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.Required;

public class Product {
	@Id
	public Long id;
	@Required
	public String name;
	@Required
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
