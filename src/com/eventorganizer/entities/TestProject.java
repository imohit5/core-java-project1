package com.eventorganizer.entities;

public class TestProject {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.setId(1111L);
		organizer.setName("AWS");
		System.out.println(organizer);
		System.out.println(organizer.getId());
		System.out.println(organizer.getName());
		
		Event event = new Event(new Long(2222),"apple","new app launch","","",true);
//		event.id= new Long(2222);
//		event.name = "apple";
//		event.description= "new app launch";
		
		System.out.println(event);
		System.out.println(event.getId());
		System.out.println(event.getName());
		System.out.println(event.getDescription());
		
	}

}
