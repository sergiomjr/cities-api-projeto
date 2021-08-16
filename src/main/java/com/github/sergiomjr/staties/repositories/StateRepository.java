package com.github.sergiomjr.staties.repositories;

import com.github.sergiomjr.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
