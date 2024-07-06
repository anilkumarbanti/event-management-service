package com.eventmgmt.service.controller;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.eventmgmt.service.data.MockData;
import com.eventmgmt.service.model.Attendee;
import com.eventmgmt.service.model.Event;
import com.eventmgmt.service.model.Film;
import com.eventmgmt.service.model.Organizer;

public class EventController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.How many events have been organized by the firm?
		long numberOfEvents=MockData.events.stream().count();
		System.out.println("Number of Events:"+numberOfEvents);
		
		//2. List the names of all films for which events have been organized.
		
		List<String> filmNamesWithEvents= MockData.films.stream()
										 	.map(Film::getFilmName)
										 	.collect(Collectors.toList());
		System.out.println("Films with events:"+filmNamesWithEvents);
		
		//3.	What is the average number of attendees per event?
		double averageAttendees=MockData.events.stream()
		.mapToInt(Event::getNumberOfAttendees)
		.average()
		.orElse(0.0);
		System.out.println("Average attendees per event:"+averageAttendees);
		
		//4.Get the details of the event with the highest number of attendees.
	    System.out.println("Event with most attendees:"+ MockData.events.stream()
		.max(Comparator.comparing(Event::getNumberOfAttendees)));
	    
	    //5.Print the names of all organizers in the organization.
	    System.out.println("organizer names:"+
	    										MockData.organizers.stream()
	    										.map(Organizer::getOrganizerName)
	    										.collect(Collectors.toList()));
	    //6 to 10 given as assignment
	    
	    //11. Get the details of the event with the most significant budget. 
	    // 11th is same as 4th
	    
	   // 12.	What is the average age of attendees for each event?
	    
	  Map<Integer, Object> avgAgePerEvent=  MockData.events.stream()
	    .collect(Collectors.toMap(Event::getEventId,
	    		  event-> MockData.attendees.stream()
	    		          .filter(attende->attende.getEventId()==event.getEventId())
	    		          .mapToInt(Attendee::getAge)
	    		          .average()
	    		          .orElse(0)));
	    System.out.println("avgAgePerEvent"+avgAgePerEvent);
	    
	  //13.How many male and female attendees are there in the system?
	    Map<String,Long> genderCount=MockData.attendees.stream()
	    		                     .collect(
	    		                    Collectors.groupingBy
	    		                    (Attendee::getGender,Collectors.counting()));
	    System.out.println("genderCount"+genderCount);
	    
	    
	    //14.	Get the names of all organizers who have managed more than three events.
	    
	    List<String> expOrganizers= MockData.organizers.stream()
	    							.filter(organizer->organizer.getEventsManaged()>3)
	    							.map(Organizer::getOrganizerName)
	    							.collect(Collectors.toList());
	    System.out.println("expOrganizers"+expOrganizers);
	    
	    //15 to 20 given for assessment
	
	    
	   //23.Get the details of the event with the oldest film (by release date).
	    System.out.println(
	    MockData.events.stream()
	    .min(Comparator.comparing(
	    		event->MockData.films.stream().filter(film->film.getFilmId()==event.getEventId())
	    		       .findFirst()
	    		       .orElse(null)
	    		       .getReleaseDate())));
	    
	    
}       
}
