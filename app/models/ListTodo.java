package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class ListTodo extends Model{
	@Id
	public Long id;
	public String todo;
	public String date;
	
	public static Finder<Long, ListTodo> find = new Finder<Long, ListTodo>(Long.class, ListTodo.class);
}
