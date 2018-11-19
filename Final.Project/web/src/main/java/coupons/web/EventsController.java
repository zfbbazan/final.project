package coupons.web;

import java.awt.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/event")
public class EventsController {

	@Autowired
	private EventsServices services;

	@GetMapping("/all")
	public GeneralResponse getAll() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new GeneralResponse(services.fetchAllEvents());
	}

	@PostMapping("/addEvent")
	public GeneralResponse addEvent(@RequestBody Event newEvent) {
		return new GeneralResponse(services.createEvent(newEvent));
	}

	@DeleteMapping("/{eventId}")
	public GeneralResponse deleteEvent(@PathVariable("eventId") Long eventId) {
		throw new UnsupportedOperationException("Can't delete event " + eventId);
	}
}
