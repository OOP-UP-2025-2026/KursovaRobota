package ua.opnu.labwork2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.opnu.labwork2.entity.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {

    boolean existsByEmail(String email);

}
