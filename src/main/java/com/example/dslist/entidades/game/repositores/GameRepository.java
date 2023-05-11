package com.example.dslist.entidades.game.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dslist.entidades.game.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
