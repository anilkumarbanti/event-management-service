package com.eventmgmt.service.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

//Organizer class
public class Organizer {
	
	private int organizerId;
	private String organizerName;
	private int eventsManaged;

public Organizer(int organizerId, String organizerName, int eventsManaged) {
	super();
	this.organizerId = organizerId;
	this.organizerName = organizerName;
	this.eventsManaged = eventsManaged;
}

public int getOrganizerId() {
	return organizerId;
}
public void setOrganizerId(int organizerId) {
	this.organizerId = organizerId;
}
public String getOrganizerName() {
	return organizerName;
}
public void setOrganizerName(String organizerName) {
	this.organizerName = organizerName;
}
public int getEventsManaged() {
	return eventsManaged;
}
public void setEventsManaged(int eventsManaged) {
	this.eventsManaged = eventsManaged;
}


}

