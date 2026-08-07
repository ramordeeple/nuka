package com.example.paymentcheckerservice.repository;

import com.example.paymentcheckerservice.entity.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;

public interface ScenarioRepository extends JpaRepository<Scenario, UUID> {

    Optional<Scenario> findByRequestDateAndExpiresAtAfter(
            LocalDate requestDate,
            OffsetDateTime now
    );
}
