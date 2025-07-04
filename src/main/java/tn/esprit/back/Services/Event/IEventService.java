package tn.esprit.back.Services.Event;



import tn.esprit.back.Entities.Event.Event;
import tn.esprit.back.Entities.Event.Reservation;

import java.util.List;

public interface IEventService {
    Event addEvent (Event Event);

    void deleteEvent (long idEvent);
    List<Event> retriveAllEvents ();
    Event getEventbyId  (long idEvent);
    Event effectereservationToEvent (List<Long> idReservation, long idEvent );
     Event affecterSponsorsToEvent(List<Long> idSponsors, Long idEvent);
    public Event affecterReviewsToEvent(List<Long> idReviews, Long idEvent);


    Event updateEvent(Long idEvent, Event eventDetails);


    Event updateEventWithSponsors(Long idEvent, Event eventDetails, List<Long> sponsorIds);

    Event getEventWithReviews(Long idEvent);
    Event getEventById(Long eventId);
    List<Reservation> getReservationsByEventId(Long eventId);
}
