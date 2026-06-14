package ua.opnu.labwork2.service;

import org.springframework.stereotype.Service;
import ua.opnu.labwork2.entity.Event;
import ua.opnu.labwork2.entity.Participant;
import ua.opnu.labwork2.exception.DuplicateResourceException;
import ua.opnu.labwork2.repository.EventRepository;
import ua.opnu.labwork2.repository.ParticipantRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantService {

    private final ParticipantRepository participantRepository;
    private final EventRepository eventRepository;

    public ParticipantService(ParticipantRepository participantRepository,
                              EventRepository eventRepository) {
        this.participantRepository = participantRepository;
        this.eventRepository = eventRepository;
    }

    public void createParticipant(Participant participant) {
        if (participantRepository.existsByEmail(participant.getEmail()))
            throw new DuplicateResourceException("cannot post 2 members with same email");
        participantRepository.save(participant);
    }

    public List<Participant> getParticipants() {
        return participantRepository.findAll();
    }

    public Optional<Participant> getParticipantById(Long id) {
        return participantRepository.findById(id);
    }

    public void setParticipantById(Participant participant, Long id) {
        participantRepository.deleteById(id);
        participant.setId(id);
        participantRepository.save(participant);
    }

    public void deleteParticipantById(Long id) {
        participantRepository.deleteById(id);
    }

    public List<Event> getEventsByParticipantId(Long participantId) {
        return eventRepository.findByParticipantId(participantId);
    }
}
