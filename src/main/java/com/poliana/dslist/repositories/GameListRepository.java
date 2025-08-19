package com.poliana.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
