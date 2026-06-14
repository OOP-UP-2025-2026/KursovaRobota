package ua.opnu.labwork2.service;

import org.springframework.stereotype.Service;
import ua.opnu.labwork2.entity.Event;
import ua.opnu.labwork2.entity.Organizer;
import ua.opnu.labwork2.exception.DuplicateResourceException;
import ua.opnu.labwork2.repository.EventRepository;
import ua.opnu.labwork2.repository.OrganizerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizerService {

    private final OrganizerRepository organizerRepository;
    private final EventRepository eventRepository;

    public OrganizerService(OrganizerRepository organizerRepository, EventRepository eventRepository) {
        this.organizerRepository = organizerRepository;
        this.eventRepository = eventRepository;
    }

    public void createOrganizer(Organizer organizer) {
        if (organizerRepository.existsByEmail(organizer.getEmail()))
            throw new DuplicateResourceException("cannot post 2 members with same email");
        organizerRepository.save(organizer);
    }

    public List<Organizer> getOrganizers() {
        return organizerRepository.findAll();
    }

    public Optional<Organizer> getOrganizerById(Long id) {
        return organizerRepository.findById(id);
    }

    public void setOrganizerById (Organizer organizer, Long id) {
        organizerRepository.deleteById(id);
        organizer.setId(id);
        organizerRepository.save(organizer);
    }

    public void deleteOrganizerById(Long id) {
        organizerRepository.deleteById(id);
    }

    public List<Event> getEventsByOrganizerId(Long organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }
}
