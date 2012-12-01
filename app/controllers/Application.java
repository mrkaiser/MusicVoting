package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render("Your new application is ready."));
  }
  
  public static Result vote(String id){
	  //TODO push vote to queue
	  return ok(id);
  }
  
  public static Result getQueue(Integer length){
	  //The length is the length of the queue returned
	  return ok("The queue is "+length+" long");
  }
  
  public static Result auto(){
	  //Set the autopilot
	  return ok("Toggle Toggle");
  }
}