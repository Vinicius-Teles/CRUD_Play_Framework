package controllers;

import models.Product;
import play.*;
import play.data.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	static Form<Product> productForm = Form.form(Product.class);
	
	public static Result index() {
        return redirect(routes.Application.products());
    }
    
    public static Result products() {
        return TODO;
    }
    
    //SERVIÇO QUE IRÁ RETORNAR TODOS OS PRODUTOS CADASTRADOS
    public static Result listProducts() {
        return TODO;
    }
    
    public static Result newProduct() {
        return TODO;
    }
    
    public static Result deleteProduct(Long id) {
        return TODO;
    }
}
