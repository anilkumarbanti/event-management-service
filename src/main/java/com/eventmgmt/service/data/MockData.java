package com.eventmgmt.service.data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.eventmgmt.service.model.Attendee;
import com.eventmgmt.service.model.Event;
import com.eventmgmt.service.model.Film;
import com.eventmgmt.service.model.Organizer;

//Mock data lists
public class MockData {
public static List<Event> events = Arrays.asList(
new Event(1, LocalDate.of(2023, 3, 15), "Los Angeles", 200, 10000),
new Event(2, LocalDate.of(2023, 5, 20), "New York", 150, 8000),
new Event(3, LocalDate.of(2023, 7, 10), "London", 300, 12000)
);

public static List<Film> films = Arrays.asList(
new Film(1, "The Great Movie", LocalDate.of(2022, 12, 31)),
new Film(2, "Blockbuster Returns", LocalDate.of(2023, 4, 15)),
new Film(3, "Summer Adventure", LocalDate.of(2023, 8, 25))
);

public static List<Organizer> organizers = Arrays.asList(
new Organizer(1, "John Doe", 3),
new Organizer(2, "Jane Smith", 2),
new Organizer(3, "Michael Johnson", 4)
);

public static List<Attendee> attendees = Arrays.asList(
new Attendee(1, "Alice", 25, "Female"),
new Attendee(2, "Bob", 30, "Male"),
new Attendee(3, "Carol", 28, "Female"),
new Attendee(4, "David", 22, "Male"),
new Attendee(5, "Eve", 35, "Female"),
new Attendee(6, "Frank", 27, "Male")
);
}
