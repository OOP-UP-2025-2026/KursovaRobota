package ua.opnu.labwork2.service;

import org.springframework.stereotype.Service;
import ua.opnu.labwork2.entity.Registration;
import ua.opnu.labwork2.repository.RegistrationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public void createRegistration(Registration registration) {
        registrationRepository.save(registration);
    }

    public List<Registration> getRegistrations() {
        return registrationRepository.findAll();
    }

    public Optional<Registration> getRegistrationById(Long id) {
        return registrationRepository.findById(id);
    }

    public void setStatusByRegistrationId(Registration registration, Long id) {
        registrationRepository.deleteById(id);
        registration.setId(id);
        registrationRepository.save(registration);
    }

    public void deleteRegistrationById(Long id) {
        registrationRepository.deleteById(id);
    }

    public List<Registration> getRegistrationsByEventId(Long eventId) {
        return registrationRepository.findByEventId(eventId);
    }
}
