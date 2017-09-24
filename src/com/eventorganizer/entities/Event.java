package com.eventorganizer.entities;

public class Event extends CommonData {

	private String description;
	private String startTime;
	private String endTime;
	private Boolean started;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Boolean getStarted() {
		return started;
	}

	public void setStarted(Boolean started) {
		this.started = started;
	}

	public Event(Long id, String name, String description, String startTime, String endTime, Boolean started) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.started = started;
	}

}
