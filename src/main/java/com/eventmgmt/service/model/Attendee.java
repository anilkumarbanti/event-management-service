package com.eventmgmt.service.model;

//Attendee class
public class Attendee {
private int attendeeId;
private String attendeeName;
private int age;
private String gender;
private int eventId;

public Attendee(int attendeeId, String attendeeName, int age, String gender,int eventId) {
	super();
	this.attendeeId = attendeeId;
	this.attendeeName = attendeeName;
	this.age = age;
	this.gender = gender;
	this.eventId=eventId;
}
public int getAttendeeId() {
	return attendeeId;
}
public void setAttendeeId(int attendeeId) {
	this.attendeeId = attendeeId;
}
public String getAttendeeName() {
	return attendeeName;
}
public void setAttendeeName(String attendeeName) {
	this.attendeeName = attendeeName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getEventId() {
	return eventId;
}
public void setEventId(int attendeeId) {
	this.eventId = eventId;
}

}

