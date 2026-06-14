package ua.opnu.labwork2.service;

import org.springframework.stereotype.Service;
import ua.opnu.labwork2.entity.Participant;
import ua.opnu.labwork2.repository.ParticipantRepository;
import ua.opnu.labwork2.entity.Event;
import ua.opnu.labwork2.repository.EventRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final ParticipantRepository participantRepository;

    public EventService(EventRepository eventRepository,
                        ParticipantRepository participantRepository) {
        this.eventRepository = eventRepository;
        this.participantRepository = participantRepository;
    }

    public void createEvent(Event event) {
        eventRepository.save(event);
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public void setEventById(Event event, Long id) {
        eventRepository.deleteById(id);
        event.setId(id);
        eventRepository.save(event);
    }

    public void deleteEventById(Long id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getEventsByCategoryId (Long categoryId) {
        return eventRepository.findByCategoryId(categoryId);
    }

    public List<Participant> getParticipantsByEventId (Long eventId) {
        return participantRepository.findByEventId(eventId);
    }
}
