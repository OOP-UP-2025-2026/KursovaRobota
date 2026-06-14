package ua.opnu.labwork2.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String email;
    String organization;

    @OneToMany(mappedBy = "organizer")
    List<Event> events;

    public Organizer() {
    }

    public Organizer(Long id, String firstName, String lastName, String email, String organization) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.organization = organization;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
