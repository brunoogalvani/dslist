package com.intensivaojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivaojavaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
