package com.eventmgmt.service.model;

//Attendee class
public class Attendee {
private int attendeeId;
private String attendeeName;
private int age;
private String gender;

public Attendee(int attendeeId, String attendeeName, int age, String gender) {
	super();
	this.attendeeId = attendeeId;
	this.attendeeName = attendeeName;
	this.age = age;
	this.gender = gender;
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
}

