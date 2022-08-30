package com.pluralsight.conferencedemo3.repositories;

import com.pluralsight.conferencedemo3.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
