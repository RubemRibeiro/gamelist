package com.rubemribeiro.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubemribeiro.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
