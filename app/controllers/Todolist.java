package controllers;



import models.ListTodo;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Todolist extends Controller{
	
	public static Result index() {
		
        return ok(todolist.render(ListTodo.find.all()));
    }
	
	public static Result addTodo(){
		ListTodo listTodo = Form.form(ListTodo.class).bindFromRequest().get();
		listTodo.save();
		
		return index();
	}
		

}
