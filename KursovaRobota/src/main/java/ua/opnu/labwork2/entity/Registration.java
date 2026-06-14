package ua.opnu.labwork2.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate registrationDate;

    public enum Status {
        PENDING,
        CONFIRMED,
        REJECTED,
        CANCELLED,
        ATTENDED,
        NO_SHOW,
        EXPIRED,
        WAITLISTED
    }

    Enum<Status> status;

    @ManyToOne
    @JoinColumn(name="event_id")
    Event event;

    @ManyToOne
    @JoinColumn(name="participant_id")
    Participant participant;

    public Registration() {
    }

    public Registration(Long id, LocalDate registrationDate, Enum<Status> status) {
        this.id = id;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
