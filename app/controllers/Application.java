package controllers;

import static play.data.Form.form;

import java.util.List;

import models.*;
import play.*;
import play.data.Form;
import play.db.ebean.Model.Finder;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	Form<Receipt> form = new Form<Receipt>(Receipt.class);
        return ok(index.render("Your new application is ready.", form, getAll()));
    }

    public static Result submit() {
    	Form<Receipt> form = form(Receipt.class).bindFromRequest();
    	if (form.hasErrors()) {
    		return badRequest(index.render("Whoops!", form, getAll()));
    	}
     	form.get().save();
     	flash("success", "Record created.");
     	return redirect(routes.Application.index());
    }
    
    public static List<Receipt> getAll() {
    	return Receipt.find.all();
    }
    
 
}
