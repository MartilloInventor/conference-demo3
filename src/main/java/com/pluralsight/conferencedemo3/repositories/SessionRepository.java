package com.pluralsight.conferencedemo3.repositories;

import com.pluralsight.conferencedemo3.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
