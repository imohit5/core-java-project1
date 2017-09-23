package com.eventorganizer.entities;

public class Event extends CommonData {

	
	public String description;
	public String startTime;
	public String endTime;
	public Boolean started;
	
	public Event(Long id, String name, String description, String startTime, String endTime, Boolean started) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.started = started;
	}
	
	
}
