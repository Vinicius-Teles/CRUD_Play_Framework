package controllers;

import models.Product;
import play.*;
import play.data.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	static Form<Product> productForm = Form.form(Product.class);
	
	public static Result index() {
        return redirect(routes.Application.products());
    }
    
    public static Result products() {
    	return ok(views.html.index.render(Product.all(), productForm));
    }
    
    public static Result editProduct(Long id) {
    	Product product = Product.getById(id);
    	if(product == null){
            return redirect(routes.Application.products());
    	}
    	return ok(views.html.index.render(Product.all(), productForm.fill(product)));
    }
    
    //SERVIÇO QUE IRÁ RETORNAR TODOS OS PRODUTOS CADASTRADOS
    public static Result listProducts() {
        return ok(Json.toJson(Product.all()));
    }
    
    //SERVIÇO QUE IRÁ RETORNAR UM PRODUTO DE ACORDO COM UM ID PASSADO
    public static Result getProduct(Long id) {
    	Product product = Product.getById(id);
    	if(product == null){
    		return ok("");
    	}
        return ok(Json.toJson(product));
    }
    
    public static Result newProduct() {
    	Form<Product> filledForm = productForm.bindFromRequest();
    		if(filledForm.hasErrors()) {
    			return badRequest(views.html.index.render(Product.all(), filledForm));
		} else {
			flash("success","Produto salvo com sucesso");
			Product.create(filledForm.get());
			return redirect(routes.Application.products());  
		}
    }
    
    public static Result deleteProduct(Long id) {
        Product.delete(id);
		flash("success","Produto deletado com sucesso");
        return redirect(routes.Application.products());
    }
}
