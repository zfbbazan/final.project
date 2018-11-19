package coupons.web;

import java.awt.Event;

public interface EventsServices {
	
	Iterable<Event> fetchAllEvents();
	
	Long createEvent(Event newEvent);
	
	Long removeEvent(Long eventId);
	
	String createCustomer(Event newCustomer);
	
	String removeCustomer(Event CustomerId);
}
