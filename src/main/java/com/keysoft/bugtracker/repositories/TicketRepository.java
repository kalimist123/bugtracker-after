package com.keysoft.bugtracker.repositories;

import java.util.List;

import com.keysoft.bugtracker.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface    TicketRepository extends JpaRepository<Ticket, Integer> {
}
