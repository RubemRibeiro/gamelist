package com.rubemribeiro.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rubemribeiro.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
