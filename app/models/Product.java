package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Product extends Model{
	@Id
	public Long id;
	@Required
	public String name;
	@Required
	public Double price;
	public String category;
	public String descricao;
	
	public static Finder<Long,Product> find = new Finder(Long.class, Product.class);
	
	public static List<Product> all() {
		return find.all();
	}
  
	public static void create(Product product) {
		if(product.id == null)
			product.save();
		else
			product.update();
	}
	
	public static Product getById(Long id){
		return find.byId(id);
	}
  
	public static void delete(Long id) {
		find.ref(id).delete();
	}
}
