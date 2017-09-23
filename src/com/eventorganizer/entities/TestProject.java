package com.eventorganizer.entities;

public class TestProject {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.id= new Long(1111);
		organizer.name= "AWS";
		System.out.println(organizer);
		System.out.println(organizer.id);
		System.out.println(organizer.name);
		
		Event event = new Event(new Long(2222),"apple","new app launch","","",true);
//		event.id= new Long(2222);
//		event.name = "apple";
//		event.description= "new app launch";
		
		System.out.println(event);
		System.out.println(event.id);
		System.out.println(event.name);
		System.out.println(event.description);
		
	}

}
