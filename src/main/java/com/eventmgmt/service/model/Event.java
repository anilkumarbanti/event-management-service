package com.eventmgmt.service.model;

import java.time.LocalDate;
import java.util.*;

// Event class
public class Event {
	
	private int eventId;
	private LocalDate eventDate;
    private String location;
    private int numberOfAttendees;
    private double budget;

    public Event(int eventId, LocalDate eventDate, String location, int numberOfAttendees, double budget) {
		super();
		this.eventId = eventId;
		this.eventDate = eventDate;
		this.location = location;
		this.numberOfAttendees = numberOfAttendees;
		this.budget = budget;
	}
	
    public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public LocalDate getEventDate() {
		return eventDate;
	}
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNumberOfAttendees() {
		return numberOfAttendees;
	}
	public void setNumberOfAttendees(int numberOfAttendees) {
		this.numberOfAttendees = numberOfAttendees;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
    
}

