package com.poliana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
